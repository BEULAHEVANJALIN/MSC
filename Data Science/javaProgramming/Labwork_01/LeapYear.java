//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 22/7/2020
//Given year is leap year or not
import java.util.Scanner;							//importing the Scanner class

public class LeapYear {
	
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);			//creating a new Scanner instance
		
		int year;							//Declaring a variable called num
		
		System.out.print ("Enter year: ");
		year = input.nextInt ();					//The nextInt() method of an input object reads in a string of characters entered by the user and converts them into an int type

//If a year is divisible by 4, 100 and 400 then it is a leap year.
//If a year is divisible by 4 but not divisible by 100 then it is a leap year
			
		if (year % 4 == 0) {						
		
			if (year % 100 == 0) {	
				
				if (year % 400 == 0) {						
				
					System.out.printf ("%d is a leap year%n", year);
				}
				else {
				
					System.out.printf ("%d is not a leap year%n", year);
				}
			
			}
			else {
				
				System.out.printf ("%d is a leap year%n", year);
			}					
	
		}
		else {
			System.out.printf ("%d is not a leap year%n", year);	
		}

	}									//End of main method

}										//End of OddOrEven class