// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Printing the Leap years between 1980 to 2020

public class LeapYear {
    public static boolean isLeapYear (int n) {
        if (n%4 != 0) {
            return false;
        }else if (n%100 !=0) {
            return true;
        }else if (n % 400 == 0) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        for (int i=1980; i<=2020;i++) {
            if(isLeapYear(i)) {
                System.out.println(i);
            }
        }
    }
}