import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("no. of elements in an array: ");
        int n = input.nextInt();
		Random randNum = new Random();

		int[] myArray = new int[n];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = randNum.nextInt(20); 
		}
		System.out.println(Arrays.toString(myArray));

		int[] ReversedArray = new int[n];
		for (int i = 0; i < myArray.length; i++) {
			ReversedArray[i] = myArray[n-i-1];
		}
		System.out.println(Arrays.toString(ReversedArray));

		int[] sumArray = new int[n];
		for (int i = 0; i < myArray.length; i++) {
			sumArray[i] = myArray[i] + ReversedArray[i];
		}
		System.out.println(Arrays.toString(sumArray));
	}
}
