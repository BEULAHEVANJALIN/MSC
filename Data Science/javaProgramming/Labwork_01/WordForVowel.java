//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Printing a word for a given vowel
import java.util.Scanner;							//importing the Scanner class
import java.util.HashMap;
public class WordForVowel {
	
	public static void main (String [] args) {
		
		HashMap<Character, String> hmap = new HashMap<Character, String>();
		hmap.put('a', "apple");
     	hmap.put('e', "elephant");
     	hmap.put('i', "ink");
    	hmap.put('o', "owl");
		hmap.put('u', "umbrella");
		hmap.put('A', "Apple");
     	hmap.put('E', "Elephant");
     	hmap.put('I', "Ink");
     	hmap.put('O', "Owl");
		hmap.put('U', "Umbrella");
    
		Scanner input = new Scanner (System.in);			//creating a new Scanner instance
		
		char character;							//Declaring a variable called character
		
		System.out.print ("Enter any character: ");
		character = input.next ().charAt (0);
		if (hmap.containsKey(character)) {
		    System.out.println(hmap.get(character));
		}
		else {
		    System.out.println("The entered character is not a vowel");
		}	
		
	}									//End of main method

}										//End of WordForVowel class