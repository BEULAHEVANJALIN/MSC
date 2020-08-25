// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Demonstrating lifetime of a variable
// Lifetime of a variable refers to how long the variable stays alive in memory.
class LifetimeOfVariable 
{ 
	public static void main(String args[]) 
	{ 
		for (int x = 0; x < 4; x++) 
		{ 
			System.out.println(x); 
		} 

		
		System.out.println(x); 		// Will throw an error 
	} 			// End of main method
} 				// End of LifetimeOfVariable class