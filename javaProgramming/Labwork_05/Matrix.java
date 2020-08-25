// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-5
// Date : 23/08/2020
// Generating the matrix having R rows and C columns such that all the numbers are in increasing order starting from 1 in row wise manner.

import java.util.Scanner;
import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {		// main method begins program execution

		Scanner input = new Scanner(System.in);
        System.out.print("no. of row elements in a matrix: ");
		int rowNumber = input.nextInt();
		System.out.print("no. of Column elements in a matrix: ");
		int columnNumber = input.nextInt();
		int num = 1;
		int[][] myArray = new int[rowNumber][columnNumber];	
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				myArray[i][j] = num;
				num++;
					
			}
			System.out.println(Arrays.toString(myArray[i]));
		}	

	}	// End of main method

}			// End of Matrix class