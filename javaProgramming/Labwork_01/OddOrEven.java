//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Given number is Odd or Even
import java.util.Scanner;							//importing the Scanner class

public class OddOrEven {
	
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);			//creating a new Scanner instance
		
		int num;							//Declaring a variable called num
		
		System.out.print ("Enter any number: ");
		num = input.nextInt ();						//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type


		if (num %2 == 0) {						// Any even number can be written as 2x for any integer x. Hence it is divisible by 2.
				
			System.out.printf ("%d is an even number%n", num);		
		}
		else {
			System.out.printf ("%d is an odd number%n", num);	//Odd number won't be divisible by 2
		}

	}									//End of main method

}										//End of OddOrEven class