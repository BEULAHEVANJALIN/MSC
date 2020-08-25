//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Biggest of two integers
import java.util.Scanner;						//importing the Scanner class

public class BiggestOfNumbers {
	
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);		//creating a new Scanner instance which to get user input
		
		int num1;						//Declaring first number to add 
		int num2;						//Declaring second number to add
		
		System.out.print ("Enter first integer: ");
		num1 = input.nextInt ();				//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type

		System.out.print ("Enter second integer: ");
		num2 = input.nextInt ();				//Reading second number from user
	

		if (num1 == num2) {					//Checking if both inputs are same
				
			System.out.printf ("%d and %d are equal%n", num1, num2);		
		}
		else if (num1 > num2) {					//Checking if num1 is greater than num2
				
			System.out.printf ("%d is greater than %d%n", num1, num2);		
		}
		else {
			System.out.printf ("%d is greater than %d%n", num2, num1);
		}

	}								//End of main method

}									//End of BiggestOfNumbers class	