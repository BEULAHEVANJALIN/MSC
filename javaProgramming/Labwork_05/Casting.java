// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-5
// Date : 24/08/2020
// casting

class Casting {
    public static void main(String[] args) {

        System.out.println("(int)2.3 is " + (int)2.3);
		System.out.println();
		int myNum = 1234567890;
        float approxOfMyNum = myNum;
		System.out.println("myNum is " + myNum);
		System.out.println("Approximation of myNum when assigning it to a float variable " +approxOfMyNum);
        System.out.println("Approximation of myNum after casting takes place " + (int)approxOfMyNum);		
		//information lost during the conversion from type int to type float because values of type float are not precise to nine significant digits. 
        System.out.println("myNum - (int)approxOfMyNum = " + (myNum - (int)approxOfMyNum));

    }
}