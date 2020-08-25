//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Sum of two integers
import java.util.Scanner;			//importing the Scanner class

public class SumOfNumbers {
	
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);
		
		int num1;			//Declaring first number to add 
		int num2;			//Declaring second number to add
		int sum;			//Declaring sum which stores the sum of two given numbers num1 and num2

		System.out.print ("Enter first integer: ");
		num1 = input.nextInt ();		//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type

		System.out.print ("Enter second integer: ");
		num2 = input.nextInt ();		//Reading second number from user

		sum = num1 + num2;			//adding num1 & num2 and storing the total sum in the sum variable 

		System.out.printf ("The Sum is %d%n", sum);

	}						//end of main method

}							//end of SumOfNumbers class
