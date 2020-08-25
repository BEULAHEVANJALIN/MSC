// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Printing a value for integers, double, long and string using command line arguments
class CmdArgIntoNum 
{ 
	public static void main(String[] args) 
	{
		System.out.println("Without conversion :	" + args[0] + 1);

		int numInt = Integer.parseInt(args[0]);		// parseInt method converts "20" to 20 and stores it in num

   		System.out.println("Converted argument :	" + (numInt + 1));

	} 								// End of main method
} 										// End of CmdArgIntoNum class
