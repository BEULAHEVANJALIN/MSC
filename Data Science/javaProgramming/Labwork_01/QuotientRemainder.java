//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Finding the Quotient  and the Remainder
import java.util.Scanner;							//importing the Scanner class

public class QuotientRemainder {
	
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);			//creating a new Scanner instance
		
		int dividend;							//Declaring a variable called dividend
		int divisor;							//Declaring a variable called divisor
		int quotient;							//Declaring a variable called quotient
		int remainder;							//Declaring a variable called remainder
		
		System.out.print ("Enter Dividend: ");
		dividend = input.nextInt ();					//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type
	
		System.out.print ("Enter Divisor: ");
		divisor = input.nextInt ();
		//Quotient = Dividend / Divisor 
		//Remainder = = Dividend % Divisor
		System.out.printf ("%d divided by %d gives %d as quotient and %d as remainder%n", dividend, divisor, dividend/divisor, dividend%divisor);		

	}									//End of main method

}										//End of QuotientRemainder class