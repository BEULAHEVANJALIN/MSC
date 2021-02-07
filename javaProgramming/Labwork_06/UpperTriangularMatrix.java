// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-6
// Date : 02/08/2020
// Lower Triangular Matrix
import java.util.Random;

public class LowerTriangularMatrix {
   public static void main(String[] args) {
       Random random = new Random();
       int n = 5;
       int [][] matrix = new int [n][n];
       for (int i=0; i < n; i++){
           for (int j=0; j< n;j++){
               matrix[i][j] = random.nextInt(10);
           }
       }
       for (int i=0;i<n;i++) {
           for (int j=0;j<n;j++)
            System.out.print(matrix[i][j]+ " ");
           System.out.println();
       }
       System.out.println();
       for (int i=0; i < n; i++){
        for (int j=i+1; j< n;j++){
            matrix[i][j] = 0;
        }
    }
    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++)
        System.out.print(matrix[i][j]+ " ");
            System.out.println();
    }
   } 
}