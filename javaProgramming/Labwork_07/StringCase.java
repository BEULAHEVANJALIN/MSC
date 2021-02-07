// Author : Beulah Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 23/09/2020
// To convert all lowercase letters of a string to uppercase letters and vice versa.
import java.util.Scanner;
class StringCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter sentence");
		String myString = input.nextLine();
		String myNewString = "";

		for (int i = 0; i < myString.length(); i++) {
			int myLetterValue = myString.charAt(i);
			if (myLetterValue > 97 && myLetterValue < 172  ){
				myLetterValue -= 32;
			}
			else if (myLetterValue > 65 && myLetterValue < 90  ){
				myLetterValue += 32;
			}
			else{
			// do nothing
			}
			String myLetter = Character.toString((char)myLetterValue);
			myNewString = myNewString + myLetter;
		}
		System.out.println(myNewString);
	} // End of main method
} // End of StringCase
