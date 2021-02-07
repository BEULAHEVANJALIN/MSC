package com.labwork12.javaprogramming;

class Calculate {
	static int divide(int numerator, int denominator) {
		return numerator/denominator;
	}
}

class ResolveExceptionalCondition {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(Calculate.divide(num1, num2));
		}
		catch(NumberFormatException e) {
			System.out.println("Enter valid integers");
		}
		catch(ArithmeticException e) {
			System.out.println("Enter non-zero value for the second argument");
		}
		
	}
}
