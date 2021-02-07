// Author : Beulah Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 23/09/2020
// To check if the matrix is a Binary Matrix.
// A binary matrix is a matrix in which all the elements are either 0 or 1.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
class BinaryMatrix {

	static boolean isBinaryMatrix (int myMatrix[ ][ ], int m, int n) { 
		for (int i = 0; i < m; i++) { 
			for (int j = 0; j < n; j++) { 
				if (!(myMatrix[i][j] == 0 || myMatrix[i][j] == 1)) {
					return false; 
				}
			} 
		}
		   return true; 
	    } 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random randNum = new Random();
		
		System.out.print ("no. of row elements in a matrix: ");
		int rowNumber = input.nextInt( );
		
		System.out.print ("no. of Column elements in a matrix: ");
		int columnNumber = input.nextInt ( );
		
		int [ ][ ] myArray = new int [rowNumber][columnNumber];
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				myArray[i][j] = randNum.nextInt(10);
			}
		System.out.println (Arrays.toString (myArray [i]));
		}
		
		if (isBinaryMatrix(myArray, rowNumber, columnNumber)) {
			System.out.println("Yes"); 
		}
		else {
			System.out.println("No");
		} 
		
	} // End of main method
} // End of BinaryMatrix class


