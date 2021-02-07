package exercises.simulations

import scala.collection.mutable

object LiftSim extends App {
  val numFloors = 3
  val numLifts = 3 // increasing no of lift
  val lifts = new Array[Lift](numLifts)
  val floors = new Array[Floor](numFloors)
  // The key of the wait status is the floor and the value is a boolean
  // which indicates whether it's waitList is empty or not
  val waitStatus = new mutable.HashMap[Int,Boolean]() withDefaultValue false

  class Passenger(val name: String,val source: Int,val destination: Int){
    override def toString: String = {
      f"I travelled from $source to $destination, my name is $name"
    }
  }
  class Floor(id: Int) extends Thread{
    // List of passengers waiting in a floor
    // They will get into one of the available lifts
    // I have not defined any constraints for lift
    // So the lift that arrives first will dequeue the passengers
    // from waitList
    val waitList = new mutable.Queue[Passenger]()
    // arrivedList keeps track of the passengers who comes to the floor
    val  arrivedList= new mutable.Stack[Passenger]()
    val lock = AnyRef // same as "new object()" --> creating new object
    override def run(): Unit = {  //floor functionality(which code to run) defined in this run() method
      while(true) {
        if (waitList.nonEmpty) {
          for (x <- lifts) {
            x.makeRequests(id)
          }
          waitStatus(id) = true
        }
      }
    }
    // A lift is going to call dispatch on only one Floor
    // So it is not possible for multiple floors to mutate the passengers queue of a Lift
    // So we don't need any lock
    def dispatch(passengers: mutable.Queue[Passenger]): Unit = lock.synchronized {
      while (waitList.nonEmpty) {
        // we need to lock dispatch method to protect waitList variable
        passengers.enqueue(waitList.dequeue())
        //dispatch method changes passengers.
        // from onboard we are passing passenger
        // (for each lift we have seperate passengers)
      }
      waitStatus(id) = false
    }
    //Lift thread changes the passengers and waitList variables
    // from Lift's run() method --to--> onboard() method --to--> dispatch() method

    def receivePassengers(incoming: mutable.Queue[Passenger]): Unit = lock.synchronized {
      if (incoming.forall(x=>x.destination == id)) {
        for (p <- incoming) {
          arrivedList.push(p)
          println(p)
        }
      } else {
        println("There is a mistake")
      }
    }

  }

  class Lift extends Thread { //take request from floor and to serve that request
    // Lift will dequeue while the passengers will enqueue
    // the value requests is immutable which is a pointer to a mutable Queue
    val requests = new mutable.Queue[Int]()
    val lock = AnyRef

    // Once reaching a floor we have to offload all the passengers belonging to that floor
    // irrespective of their order. So we have to apply filter
    // Only the lift modifies the passengers queue so no lock is required
    var passengers = new mutable.Queue[Passenger]() // for each lift there will be separate passengers list
    //passenger is a member variable
    override def run(): Unit = {
      while (true) lock.synchronized{
        if (requests.isEmpty && passengers.isEmpty) lock.wait()
        // else either passengers or requests is non Empty or both
        if (passengers.nonEmpty) {
          drop(passengers.front.destination)  // front - reading 1st element
        }
        if (requests.nonEmpty) {
          onBoard(requests.dequeue())
        }
      }
    }

    def makeRequests(floor: Int): Unit = lock.synchronized{
      requests.enqueue(floor)  //request variable changes
      lock.notifyAll()      //locking makeRequests
    }

    def onBoard(floor: Int): Unit = {
      if (waitStatus(floor)) {
        floors(floor).dispatch(passengers)
      }

    }

    def drop(destination: Int): Unit = {
      val (toDrop,remaining) = passengers.partition(x=> x.destination == destination)
      // is remaining a shared variable
      // passenger -> considering as queue/collection/set in maths
      // domain -> passenger set, co-domain -> boolean(either T / F)
      // this expression "x.destination == destination" returns boolean value
      floors(destination).receivePassengers(toDrop)
      passengers = remaining
      floors(destination).dispatch(passengers)
    }

  }
  val lift1 = new Lift
  val lift2 = new Lift
  val lift3 = new Lift

  val floor0 = new Floor(0)
  val floor1 = new Floor(1)
  val floor2 = new Floor(2)
  floors(0) = floor0;floors(1)=floor1;floors(2)=floor2
  lifts(0) = lift1
  lift1.start();floor0.start();floor1.start();floor2.start()

  // All you have to do is create different passengers and
  // put them into waitList of different floors
  floor0.waitList.enqueue(new Passenger("name1",0,2))
  floor0.waitList.enqueue(new Passenger("name2",1,1))
  floor0.waitList.enqueue(new Passenger("name3",2,0))
  floor0.waitList.enqueue(new Passenger("name4",1,2))

  //---------------//
  // terminate all threads

  lift1.join()
}
