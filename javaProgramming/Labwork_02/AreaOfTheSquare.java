// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Computing the area of a Square
import java.util.Scanner;
public class AreaOfTheSquare {
    public static void main(String[] args) {
        float side, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter side length of a square:");

        side = input.nextFloat();

        area = side * side;

        System.out.println("Area of a square:" + area);

    }            // End of main method

}				// End of AreaOfTheSquare class