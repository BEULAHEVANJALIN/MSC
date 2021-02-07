class Task1 extends Thread {
	public void run() {
		System.out.println("\nTask1 Started");
		for(int i = 1; i <= 20; i++)
			System.out.print(i + "  ");
		System.out.println("\nTask1 completed");
	}
}
class Task2 extends Thread {
	public void run() {
		System.out.println("\nTask2 Started");
		for(int i = 21; i <= 40; i++)
			System.out.print(i + "  ");
		System.out.println("\nTask2 completed");
	}
}
public class MultithreadRunner {
	public static void main(String[] args) {
		//TASK1
		Task1 task1 = new Task1();
		task1.start();
		
		//TASK2
		Task2 task2 = new Task2();
		task2.start();
		
		//TASK3
		System.out.println("\nTask3 Started");
		for(int i = 41; i <= 60; i++)
			System.out.print(i + ",");
		System.out.println("\nTask3 completed");
	}
}