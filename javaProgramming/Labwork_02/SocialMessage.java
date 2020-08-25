// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Displaying a message ”Wear mask and maintain social distance” using command line arguments 
class SocialMessage 
{ 
    public static void main(String[] args) {
        for (int i =0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }
            System.out.println();
	} 								// End of main method
} 										// End of SocialMessage class
