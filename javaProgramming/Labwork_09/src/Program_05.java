class Base4 {
	public void foo() {		
		/*
		 * Resolution: Either reduce the visibility of the parent method. 
		 * private void foo()
		 */
		System.out.println("Base4"); 
	}
}
/*
 * Liskov substitution principle:
 * if S is a subtype of T, then objects of type T may be substituted with objects
 * of type S(without altering any of the desirable properties of the program)
 */
class Derived4 extends Base4 {
	private void foo() {
		/*
		 * Resolution:  or Increase the visibility of the derived method. 
		 * public void foo()
		 */
		System.out.println("Derived4"); 
	}
}
public class Program_05 {
	public static void main(String args[]) {
		Base4 b = new Derived4();
		b.foo();
	}
}
