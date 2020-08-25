// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-5
// Date : 23/08/2020
// Given a number A which contains only digits 0's and 1's. The goal is to make all digits same by just flipping only one digit

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Digits {

	public static void main(String[] args) {		// main method begins program execution

		Scanner input = new Scanner(System.in);
        System.out.print("no. of elements in an array: ");
        int n = input.nextInt();
		int[] myArray = new int[n];					// Generating a Random array of n elements
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = getRandomNumberInRange(0,1); 
		}
		System.out.println(Arrays.toString(myArray));

		int oneCount = 0;
		int zeroCount = 0;
		for (int i = 0; i < n; i++) {
			if (myArray[i] == 1)
				oneCount++;
			else
				zeroCount++;		
		}
		if (oneCount == 1) {
			System.out.println("YES");
			for (int i = 0; i < n; i++) {
				if (myArray[i] == 1) {
					myArray[i] = 0;
					break;
				}
			}
			System.out.println("Flipped array" + Arrays.toString(myArray));
		}
		else if (zeroCount == 1) {
			System.out.println("YES");
			for (int i = 0; i < n; i++) {
				if (myArray[i] == 0) {
					myArray[i] = 1;
					break;
				}
			}
			System.out.println("Flipped array" + Arrays.toString(myArray));
		}	
		else
			System.out.println("NO");
	}	// End of main method
	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random randNum = new Random();				// Creating a Random object and assigning it to randNum
		return randNum.nextInt((max - min) + 1) + min;
	}		// End of getRandomNumberInRange method
}			// End of Digits class