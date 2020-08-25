//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Smallest of three numbersS
import java.util.Scanner;						//importing the Scanner class

public class SmallestOfNumbers {
	
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);		//creating a new Scanner instance which to get user input
		
		int num1;						//Declaring first number 
		int num2;	
		int num3;						//Declaring third number
		
		System.out.print ("Enter first integer: ");
		num1 = input.nextInt ();				//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type

		System.out.print ("Enter second integer: ");
		num2 = input.nextInt ();				//Reading second number from user
	
		System.out.print ("Enter second integer: ");
		num3 = input.nextInt ();				//Reading third number from user
	
		if (num1 == num2) {
			if (num1 == num3) {
				System.out.printf ("Given numbers are equal");
			}
			else if (num1 < num3) {	

				System.out.printf ("%d is the smallest among %d and %d %n", num1, num1, num3);		
			
			}
			else {					
				
				System.out.printf ("%d is the smallest among %d and %d %n", num3, num1, num3);		
			}		
		}
		else if (num1 == num3) {
			if (num1 == num2) {
				System.out.printf ("Given numbers are equal");
			}
			else if (num1 < num2) {	

				System.out.printf ("%d is the smallest among %d and %d %n", num1, num1, num2);		
			
			}
			else {					
				
				System.out.printf ("%d is the smallest among %d and %d %n", num2, num1, num2);		
			}		
		}
		else if (num2 == num3) {
			if (num1 == num2) {
				System.out.printf ("Given numbers are equal");
			}
			else if (num1 < num2) {	

				System.out.printf ("%d is the smallest among %d and %d %n", num1, num1, num2);		
			
			}
			else {					
				
				System.out.printf ("%d is the smallest among %d and %d %n", num2, num1, num2);		
			}		
		}
		else if (num1 < num2) {					
			
			if (num1 < num3) {	

				System.out.printf ("%d is the smallest among %d, %d and %d %n", num1, num1, num2, num3);		
			
			}
			else if (num3 < num2) {					
				
			System.out.printf ("%d is the smallest among %d, %d and %d %n", num3, num1, num2, num3);		
			}
		}
		else if (num2 < num3) {					
				
			System.out.printf ("%d is the smallest among %d, %d and %d %n", num2, num1, num2, num3);		
		}
		
		else {
			System.out.printf ("%d is the smallest among %d, %d and %d %n", num3, num1, num2, num3);
		}
		
		

	}								//End of main method

}									//End of SmallestOfNumbers class	