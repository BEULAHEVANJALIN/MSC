class A4 {
	static
		{
		System.out.println("THIRD");
		}
}
class B4 extends A4 {
	static
		{
		System.out.println("SECOND");
		}
}
class C4 extends B4 {
	static
		{
		System.out.println("FIRST");
		}
}
public class Program_11 {
	public static void main(String[] args) {
		C4 c = new C4();
	}
}
// The static blocks are called in the order they appear in the code.

/*
 * Non-static block gets called every time an instance of the class is constructed.
 * The static block only gets called once, when the class itself is initialized, no matter
 * how many objects of that type you create.
 */