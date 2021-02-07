class Base3 {
	public void Print() {
		System.out.println("Base3");
	}
}
class Derived3 extends Base3 {
	public void Print() {
		System.out.println("Derived3");
	}
}
class Program_04 {
	public static void DoPrint( Base3 o ) {
		o.Print();
	}
	public static void main(String[] args) {
		Base3 x = new Base3();	//creating an object of Base3  
		Base3 y = new Derived3();// creating an instance of Derived3 class with a reference of Base3 class pointing to it.
		Derived3 z = new Derived3();// creating an object of Derived3  
		
		DoPrint(x);
		DoPrint(y);
		DoPrint(z);
	}
}
