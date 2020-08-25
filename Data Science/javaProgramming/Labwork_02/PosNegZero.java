// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Demonstrating whether the given number is positive or negative or zero
public class PosNegZero{
    public static void main(String[] args) {
        int posCount = 0;
        int negCount = 0;
        int zero = 0;
        for (String s:args) {
            int x;
            try {
                x = Integer.parseInt(s);
                if (x > 0) 
					System.out.println("Positive value");
                else if (x == 0) 
					System.out.println("Zero!");
                else 
					System.out.println("Negative value");
            
            } catch (NumberFormatException e) {
                //If s can't be converted to integer
                //Do Nothin Ignore
            }
        }
        
    }
}