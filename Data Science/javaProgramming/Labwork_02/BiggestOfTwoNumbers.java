//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 04/08/2020
//Biggest of two integers

public class BiggestOfTwoNumbers {
	
	public static void main (String [] args) {

		
		int num1 = Integer.parseInt(args[0]);		//Declaring first number to add
		int num2 = Integer.parseInt(args[1]);		//Declaring second number to add

		if (num1 == num2) {					//Checking if both inputs are same
				
			System.out.printf ("%d and %d are equal%n", num1, num2);		
		}
		else if (num1 > num2) {					//Checking if num1 is greater than num2
				
			System.out.printf ("%d is greater than %d%n", num1, num2);		
		}
		else {
			System.out.printf ("%d is greater than %d%n", num2, num1);
		}

	}						//end of main method

}							//end of BiggestOfTwoNumbers class
