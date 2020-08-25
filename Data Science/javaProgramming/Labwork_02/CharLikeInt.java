//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 04/08/2020
//Demonstrating char variables behave like integers

import java.util.*; 
public class CharLikeInt {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in); 	
		char myChar;
   
	   	System.out.print ("Enter any character: ");
		myChar = input.next ().charAt (0);
	   	myChar++;
	    System.out.println("Incremented! Now your character changed to = " + myChar);			 // character value gets incremented

	}						//end of main method

}							//end of CharLikeInt class
