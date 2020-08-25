// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Displaying command line arguments 
class CommandLine 
{ 
	public static void main(String[] args) 
	{ 
		if (args.length > 0) 				// Checking any command line arguments present
		{ 
			System.out.println("The command line arguments are: "); 

			for (String val:args) 						// iterating the args array
				System.out.println(val);
		} 
		else
			System.out.println("No command line arguments present."); 
	} 								// End of main method
} 										// End of commandLine class
