import java.util.Scanner;

public class InputType {
   public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter Integer");
       int a = sc.nextInt();
       System.out.println("Enter Double");
       double b = sc.nextDouble();
	   System.out.println("Enter Long");
       long c = sc.nextLong();
       System.out.println("int " + a + "\ndouble " + b + "\nlong " + c );  
       sc.close();             
   } 
}