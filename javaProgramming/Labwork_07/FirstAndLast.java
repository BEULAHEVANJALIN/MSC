// Author : Beulah Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 24/09/2020
// To get a string made of the first 2 and the last 2 chars from a given string.

import java.util.Scanner;

class FirstAndLast {

	static String first_last (String str) {
		String newStr = "";
		if (str.length() < 2) {
			return str;
		}
		else {
			return str.substring(0, 2) + str.substring(str.length()-2);
		}
	}
	
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter the Sentance: ");
		String myString = input.nextLine ();
		
		FirstAndLast fnl = new FirstAndLast();
		System.out.println(fnl.first_last(myString)); 
		

		
	}
}
