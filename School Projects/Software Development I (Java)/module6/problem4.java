package module6package;
import java.util.*;
public class problem4 {



/*
(Algebra: 2×2 matrix inverse) The inverse of a square matrix A is denoted A−1, 
such that A×A−1 = I, where I is the identity matrix with all 1s on the diagonal 
and 0 on all other cells. For example, the
􏰀1 2􏰁 􏰀−0.5 1􏰁 inverse of matrix 3 4 is 1.5 0


Implement the following method to obtain an inverse of the matrix:

public static double[][] inverse(double[][] 

A) The method returns null if ad–bc is 0.

Write a test program that prompts the user to enter a, b, c, d for a matrix, 
and displays its inverse matrix. Here is a sample run:

Enter a, b, c, d: 1 2 3 4 -2.0 1.0
1.5 -0.5

Enter a, b, c, d: 0.5 2 1.5 4.5 -6.0 2.6666666666666665
2.0 -0.6666666666666666

Enter a, b, c, d: 1 2 3 6
No inverse matrix
*/


    public static double [][] inverse (double[][] A) {
        double a = A[0][0];
        double b = A[0][1];
        double c = A[1][0];
        double d = A[1][1];
        
        double i = a * d - b * c;
        if (i == 0)
            return (null);
        
        A[0][0] = d / i;
        A[0][1] = -b / i;
        A[1][0] = -c /i;
        A[1][1] = a / i;
        
        //return if not null 
        return (A);
    }
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            

                //gather user input
                System.out.print("Enter a, b, c, d:");
                double a = in.nextDouble ();
                double b = in.nextDouble ();
                double c = in.nextDouble ();
                double d = in.nextDouble ();
                
                //pupulate double arrays
                double [][]arr = { {a, b}, {c, d} };
                
                //null 
                if (inverse (arr) == null)
                    System.out.println ("No inverse matrix.");
                else {
                    System.out.println ("" + arr[0][0] + " " + arr[0][1]);
                    System.out.println ("" + arr[1][0] + " " + arr[1][1]);
                }
        }
} 


