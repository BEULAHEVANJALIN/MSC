package com.labwork12.javaprogramming;
import java.util.Scanner;
public class FinallyRunner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER FROM 1 TO 4:");
		int n = input.nextInt();
		int[] myNumbers = {3,7,13,17};
		try {
			int myFavNumber = myNumbers[n];
			System.out.println("Try block gets executed and my favourite number is " + myFavNumber);
		}
		catch (Exception e){
		System.out.println("Exception handled in the catch block");
		}
		finally {
			System.out.println("Finally block will get executed always");
			input.close();// scanner.close() should have to be called inorder to cause no leakage
		}
	}
}