package com.labwork12.javaprogramming;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		try {
			String myString = null;
			myString.length();
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}
