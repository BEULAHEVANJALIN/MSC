// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-3
// Date : 11/08/2020
// Creating a class with methods and return type

class Ellipse {

    private final double PI = 3.14159;		//instance variable
    double majorRadius;				//instance variable
    double minorRadius;				//instance variable

	public double area ( ) {
		    return PI * majorRadius * minorRadius;
		}

	public double perimeter ( ) {
        return 2 * PI * Math.sqrt((majorRadius * majorRadius + minorRadius * minorRadius) / (2 * 1.0));
    }
}		// End of Ellipse class

class MethodsWithReturnType {
      
	public static void main( String[] args ) {	// main method begins program execution
		
		Ellipse myEllipse = new Ellipse();		// Creating a Ellipse object and assigning it to myEllipse
		double area;
		double perimeter;

		myEllipse.majorRadius = 4;			// assigning values to myEllipse's instance variables
		myEllipse.minorRadius = 3;			// assigning values to myEllipse's instance variables

		area = myEllipse.area ( );
		perimeter = myEllipse.perimeter ( );

		System.out.println("Area of the Ellipse is " + area);
		System.out.println("Perimeter of the Ellipse is " + perimeter);

	}			// End of main method

}			// End of MethodsWithReturnType class