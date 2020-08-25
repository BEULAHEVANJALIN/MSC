//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Given number is Vowel or Consonant

import java.util.Scanner;							//importing the Scanner class

public class VowelConsonant {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);			//creating a new Scanner instance
		boolean isVowel=false;;
		char character;							//Declaring a variable called character
		System.out.print ("Enter a character: ");
		character = input.next ().charAt (0);				
/*next() function returns the next token in the input as a string and charAt(0) function returns the first character in that string.*/

		switch (character) {	
//if character is equal to "a","e","i","o","u","A","E","I","O","U", then it will be a vowel.
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' : isVowel = true;
		}

		if (isVowel == true) {
			System.out.print (character + " is a Vowel\n");
		}
		
		else { 
			if ((character >= 'a' && character <= 'z')||(character >= 'A' && character <= 'Z')) {		 
			//If it is not a vowel, then it will be a consonant.
				System.out.println( character + " is Consonant\n");
			}
			else {
				System.out.println("Not an alphabet\n");		
			}		
		}
	      		
	}									//End of main method

}										//End of OddOrEven class