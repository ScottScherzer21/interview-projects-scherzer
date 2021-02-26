package module2;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Prompt the user to enter coordinates
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter two points
		System.out.println("Enter x and y coordinates of two points:\n" +
		"Point 1: (x1, y1)");
		System.out.println("x1= ");
		double x1 = input.nextDouble();
		System.out.println("y1= ");
		double y1 = input.nextDouble();
		System.out.println("Point 2: (x2, y2)");
		System.out.println("x2= ");
		double x2 = input.nextDouble();
		System.out.println("y2= ");
		double y2 = input.nextDouble();
		
	    
		double answer = (y2 - y1) / (x2 - x1);
		
		// Display results
		System.out.println("The slope "
				+ "from the first point to the second: "
				+ answer);
		
	     
	       
	}

}
