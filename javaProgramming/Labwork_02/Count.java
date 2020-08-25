// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// counting of number of positive or negative or zero from the command line arguments
public class Count {
    public static void main(String[] args) {
        int posCount = 0;
        int negCount = 0;
        int zero = 0;
        for (String s:args) {
            int x;
            try {
                x = Integer.parseInt(s);
                if (x > 0) 
                    posCount++;
                else if (x == 0) 
                    zero++;
                else 
                    negCount++;
            
            } catch (NumberFormatException e) {
                //If s can't be converted to integer
                //Do Nothin Ignore
            }
        }
        System.out.println("Positive count : " + posCount);
        System.out.println("Negative count : " + negCount);
        System.out.println("Zeros :	" + zero);
        

        //System.out.println(Integer.parseInt("2343"));
    }
}