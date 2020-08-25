// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Converting string to a number
import java.util.*; 
public class ConvertStrToNum{
   public static void main(String args[]){
	Scanner input = new Scanner(System.in); 
	System.out.println("Enter the input "); 
	
	if(input.hasNextInt()){ 					// Checking whether the given input is an integer
		System.out.println("Entered input is integer"); 
	}  
	else{ 
			System.out.println("Not an integer "); 
		} 
	}			// End of main method

}				// End of ConvertStrToNum class