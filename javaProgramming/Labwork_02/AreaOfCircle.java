// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-2
// Date : 04/08/2020
// Computing the area of a circle
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        double pi = 3.14, radius, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle:");

        radius = input.nextDouble();

        area = pi * radius * radius;

        System.out.println("Area of circle:" + area);

    }            // End of main method

}				// End of AreaOfCircle class