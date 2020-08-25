// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Printing the odd numbers and even numbers between 1 and 50

public class OddEven {
    public static void printOdd(int n) {
        for(int i=1; i<=n;i++) {
            if (i%2==1)
                System.out.print(i + " ");
        }
    }
    public static void printEven(int n) {
        for(int i=1; i<=n;i++) {
            if (i%2==0)
                System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Odd numbers" );
        printOdd(50);
		System.out.println();
        System.out.println("Even numbers");
        printEven(50);
		System.out.println();
    }
}