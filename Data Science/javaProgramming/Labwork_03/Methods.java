// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-3
// Date : 11/08/2020
// Creating a class with methods

class Trapezoid {

    double base1;			// instance variable
    double base2;			// instance variable
    double base3;			// instance variable
    double base4;			// instance variable
    double height;			// instance variable

	void area() {
		    System.out.println ("Area of the trapezoid is " + ((base1 + base2) / 2) * height);
		}

	void perimeter() {
        System.out.println ("Perimeter of the trapezoid is " + (base1 + base2 + base3 + base4));
    }
}		// End of Trapezoid class

class Methods {
      
	public static void main( String[] args ) {	// main method begins program execution
		
		Trapezoid myTrapezoid = new Trapezoid();			// Creating a Trapezoid object and assigning it to myTrapezoid

		myTrapezoid.base1 = 2;			// assigning values to myTrapezoid's instance variables
		myTrapezoid.base2 = 4;			// assigning values to myTrapezoid's instance variables
		myTrapezoid.base3 = 1;			// assigning values to myTrapezoid's instance variables
		myTrapezoid.base4 = 3;			// assigning values to myTrapezoid's instance variables
		myTrapezoid.height = 7;			// assigning values to myTrapezoid's instance variables

		myTrapezoid.area ();
		myTrapezoid.perimeter ();

	}			// End of main method

}			// End of Methods class