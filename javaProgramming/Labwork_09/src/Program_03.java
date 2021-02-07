class Base2 {
	public static void show() {
		System.out.println("Base2::show() called");
	}
}
/*
 * If a subclass defines a static method with the same signature as a static
 * method in the superclass, then the method in the subclass hides the one in
 * the superclass.
 */
class Derived2 extends Base2 {
	public static void show() {
		System.out.println("Derived2::show() called");
	}
}
class Program_03 {
	public static void main(String[] args) {
		Base2 b = new Derived2();;
		b.show();
	}
}
