import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("no. of elements in an array: ");
        int n = input.nextInt();
		Random randNum = new Random();

		int[] myArray = new int[n];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = randNum.nextInt(100); 
		}
		System.out.println(Arrays.toString(myArray));

		int max = myArray[0];
		int secondMax = myArray[1];
		for (int i = 0; i < myArray.length; i++) {
			if (max < myArray[i]) {
				secondMax = max;				
				max = myArray[i];
			}
			else if (secondMax < myArray[i] && myArray[i] != max) {
                secondMax = myArray[i]; 
			}
		}
		System.out.println("Max is " + max);
		System.out.println("Second Max is " + secondMax);


		int min = myArray[0];
		int secondMin = myArray[1];
		for (int i = 0; i < myArray.length; i++) {
			if (min > myArray[i]) {
				secondMin = min;				
				min = myArray[i];
			}
			else if (secondMin > myArray[i] && myArray[i] != min) {
                secondMin = myArray[i]; 
			}
		}
		System.out.println("Min is " + min);
		System.out.println("Second Min is " + secondMin);
		
	}
}