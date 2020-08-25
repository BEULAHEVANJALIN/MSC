// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-5
// Date : 24/08/2020
// Coping the elements of one array into another array

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("no. of elements in an array: ");
        int n = input.nextInt();
		Random randNum = new Random();

		int[] myArray = new int[n];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = randNum.nextInt(100); 
		}
		System.out.println("Original Array" + Arrays.toString(myArray));

		int duplicateArray[] = new int[myArray.length]; 		        // Creating an duplicateArray[] which is of size as same as myArray[] 
		for (int i = 0; i < myArray.length; i++) {     
            duplicateArray[i] = myArray[i];    
		}
		System.out.println("Duplicate Array" + Arrays.toString(duplicateArray)); 
        
	}
}