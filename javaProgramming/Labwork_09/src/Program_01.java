class Base {
	public void show() {		//  Base::show()
		System.out.println("Base::show() called");
	}
}
class Derived extends Base {
	public void show() {		//  Derived::show()
		System.out.println("Derived::show() called");
	}
	
	/*
	 * public void show_01() { // Derived::show()
	 * System.out.println("Derived::show()_01 called"); }
	 */	
}
public class Program_01 {

	public static void main(String[] args) {
//  creating an instance of Derived class with a reference of Base class pointing to it.		
		Base b = new Derived();;	//  Superclass variable = new Subclass object();
		b.show(); 		// (Superclass variable).method();
	}
}
/*
 * Note: 
 * 	All 'Derived classes' are 'Base class' since 'Derived' is a subclass of
 * 'Base' but all 'Bases' are not 'Derived'. So we can create an object of
 * subclass and point it to a super class reference but we cannot make the super
 * class reference to do all the functions of a subclass object. The superclass
 * reference has access to only the functions known to the superclass. i.e.,
 * Base class reference has access only to Base::show() method. we cannot make
 * Base class reference to Derived::show()_01 method.
 */