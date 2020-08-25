// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-4
// Date : 12/08/2020
// Array – Reverse and Sum with the corresponding elements of the reverse of array

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class NonDivisibleOf5 {

	public static void main(String[] args) {		// main method begins program execution

		Scanner input = new Scanner(System.in);
        System.out.print("no. of elements in an array: ");
        int n = input.nextInt();
		Random randNum = new Random();				// Creating a Random object and assigning it to randNum

		int[] myArray = new int[n];					// Generatinng a Random array of n elements
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = randNum.nextInt(20); 
		}
		System.out.println(Arrays.toString(myArray));
		
		for (int i = 0; i < myArray.length; i++) {
			if ((myArray[i] % 5) != 0) {			// Checking whether a number is divisible by 5 or not
				System.out.print("  " + myArray[i]);
			}
		}
		System.out.println("");
	}			// End of main method

}			// End of NonDivisibleOf5 class