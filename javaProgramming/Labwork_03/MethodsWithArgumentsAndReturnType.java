// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-3
// Date : 11/08/2020
// Creating a class with methods, parameters and return type
import java.util.Scanner;

class Rectangle {

	public double area(double length, double breadth) {
		    return length * breadth;
		}

	public double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
}		// End of Rectangle class

class MethodsWithArgumentsAndReturnType {
      
	public static void main( String[] args ) {	// main method begins program execution
		
	Scanner input = new Scanner( System.in );		// creating Scanner to obtain input from command window
	
	Rectangle myRectangle = new Rectangle();			// Creating a Rectangle object and assigning it to myRectangle
	double area;
	double perimeter;
	double length;
	double breadth;

	System.out.print ("Enter the length: ");
	length = input.nextDouble ();				//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type

	System.out.print ("Enter the breadth: ");
	breadth = input.nextDouble ();				//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type

	area = myRectangle.area (length, breadth);
	perimeter = myRectangle.perimeter (length, breadth);

	System.out.println("Area of the Rectangle is " + area);
	System.out.println("Perimeter of the Rectangle is " + perimeter);

	}			// End of main method

}			// End of MethodsWithArgumentsAndReturnType class