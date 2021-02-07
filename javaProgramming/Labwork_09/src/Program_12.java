class A5 {
	public A5() {
		System.out.println("Class A5 Constructor");
	}
}
class B5 extends A5 {
	public B5() {
		System.out.println("Class B5 Constructor");
	}
}
class C5 extends B5 {
	public C5() {
		System.out.println("Class C5 Constructor");
	}
}
public class Program_12 {
	public static void main(String[] args) {
		C5 c = new C5();
	}
}
