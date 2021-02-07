class A3 {
	String s = "Class A3";
}
class B3 extends A3 {
	String s = "Class B3";
	{
// The super keyword refers to the superclass, immediately above of the calling class in the hierarchy.
	System.out.println(super.s);	// using super() to invoke the constructor of (immediate)parent class of the B3
	}
}
class C3 extends B3 {
	String s = "Class C3";
	{
	System.out.println(super.s);	// using super() to invoke the constructor of parent class of the C3
	}
}
public class Program_10 {
	public static void main(String[] args) {
		C3 c = new C3();
		System.out.println(c.s);
	}
}

