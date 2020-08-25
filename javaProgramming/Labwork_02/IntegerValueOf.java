// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Converting string to a number

public class IntegerValueOf {

    public static void main(String[] args) {

        String myNum = "123";

        try {

            Integer result = Integer.valueOf(myNum);
            System.out.println(result);

        } catch (NumberFormatException e) {
        }

	}			// End of main method

}				// End of ConvertStrToNum class