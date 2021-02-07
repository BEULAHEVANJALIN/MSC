package com.labwork12.javaprogramming;

class T10 extends Exception {
	
}

public class Exercise10 {
	public static void main(String args[]) {
		try {
			throw new T10(); //No exception of type int can be thrown; an exception type must be a subclass of Throwable
		}
		catch(T10 e) {
			System.out.println("Got the Exception " + e);
		}
	}
}

