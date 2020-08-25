//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 04/08/2020
//Sum of two integers

public class SumOfTwoNumbers {
	
	public static void main (String [] args) {

		
		int num1 = Integer.parseInt(args[0]);		//Declaring first number to add
		int num2 = Integer.parseInt(args[1]);		//Declaring second number to add
		int sum;			//Declaring sum which stores the sum of two given numbers num1 and num2

		sum = num1 + num2;			//adding num1 & num2 and storing the total sum in the sum variable 

		System.out.printf ("The Sum is %d%n", sum);

	}						//end of main method

}							//end of SumOfTwoNumbers class
