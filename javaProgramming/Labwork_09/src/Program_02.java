class Base1 {
//Using the final keyword in a method declaration indicates that the method cannot be overridden by subclasses	
	final public void show() {		
		System.out.println("Base1::show() called");
	}
}

class Derived1 extends Base1 {
//final methods cannot be overridden. Hence the compiler displays an error message!	
	public void show() {
		System.out.println("Derived1::show() called");
	}
}

class Program_02 {
	public static void main(String[] args) {
		Base1 b = new Derived1();;
		b.show();
	}
}
