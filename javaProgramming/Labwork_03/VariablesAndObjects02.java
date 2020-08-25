// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-3
// Date : 11/08/2020
// Creating a class with variables and two objects
class Square {

    double side;			// instance variable
	
}		// End of Square class

class VariablesAndObjects02 {
      
	public static void main( String[] args ) {	// main method begins program execution
		
		Square mySquare01 = new Square();			// Creating a Square object and assigning it to mySquare01
		Square mySquare02 = new Square();			// Creating another Square object and assigning it to mySquare02

		double area;
		double perimeter;

		mySquare01.side = 4;			// assigning values to mySquare01's instance variables
		mySquare02.side = 10;			// assigning values to mySquare02's instance variables

		area = mySquare01.side * mySquare01.side;		// Area of a Square = a^2
		System.out.println("Area of the 1st instance of square is " + area);
		perimeter =  4 * mySquare01.side;			// Perimeter of a circle = 4 * a
		System.out.println("Perimeter of the 1st instance of square is " + perimeter);
		
		System.out.println ( );		// outputs a newline

		area = mySquare02.side * mySquare02.side;		// Area of a Square = a^2
		System.out.println("Area of the 2nd instance of square is " + area);
		perimeter =  4 * mySquare02.side;			// Perimeter of a circle = 4 * a
		System.out.println("Perimeter of the 2nd instance of square is " + perimeter);



	}			// End of main method

}			// End of VariablesAndObjects02 class