// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-6
// Date : 02/08/2020
//printing an ARRAY after removing all duplicate values with original order preserved.

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class DuplicateElements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("no. of elements in an array: ");
        int n = input.nextInt();

        System.out.print("Enter the array elements one after the other \n");
		int[] myArray = new int[n];
		for (int i = 0; i < n; i++) {
        	System.out.print("");
			myArray[i] = input.nextInt(); 
		}
		System.out.println("Original Array" + Arrays.toString(myArray));

		for (int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(myArray[i] == myArray[j]) {
					for(int k = j; k < n-1; k++) {
						myArray[k] = myArray[k + 1];

					}
						n--;
					j--;
				}
			}
		}
		int[] myArrayWithNoDuplicates = new int[n];
		for (int i = 0; i < n; i++) {
					myArrayWithNoDuplicates[i] = myArray[i];
				}

		System.out.println("New Array after the removal of duplicates" + Arrays.toString(myArrayWithNoDuplicates));
        
	}
}