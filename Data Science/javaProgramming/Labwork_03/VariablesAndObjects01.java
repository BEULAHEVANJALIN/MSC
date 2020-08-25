// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-3
// Date : 11/08/2020
// Creating a class with variables and single object
class Circle {

    private final double PI = 3.14159;		// instance variables
    double radius;							// instance variables

	double getPI() {
		return PI;
	}
	
}		// End of Circle class

class VariablesAndObjects01 {
      
	public static void main( String[] args ) {	// main method begins program execution
		
		Circle myCircle = new Circle();			// Creating a Circle object and assigning it to myCircle

		double area;
		double perimeter;

		myCircle.radius = 7;			// assigning values to myCircle's instance variables

		area = myCircle.getPI() * myCircle.radius * myCircle.radius;		// Area of a circle = Pi * r^2

		perimeter =  2 * myCircle.getPI() * myCircle.radius;			// Perimeter of a circle = 2 * Pi * r

		System.out.println("Area is " + area);
		System.out.println("Perimeter is " + perimeter);

	}			// End of main method

}			// End of VariablesAndObjects01 class