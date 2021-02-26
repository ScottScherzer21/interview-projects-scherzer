package module2;

import java.util.Scanner;


public class problem1 {

	public static void main(String[] args) {
		//Write a program that prompts the user to enter the 
		//width and height of a rectangle and displays the 
		//perimeter, area, and the length of diagonal.
		
		//take input from user 
		System.out.print("Enter a  width: ");
		Scanner width = new Scanner(System.in);
		double w = width.nextDouble();
		
		
		//take input from user 
		System.out.print("Enter a  Height: ");
		Scanner height = new Scanner(System.in);
		double h = height.nextDouble();
		
		
		//perimeter
		double perimeter = (w+w+h+h);
		System.out.println("perimeter = " + perimeter);
		
		//area
		double area = (w*h);
		System.out.println("area = " + area);
		
		//legnth of diagonal
		//a squared + b squared = c squared
		//diagonal is c squared 
		double widthsq = Math.pow(w, 2); //raising w to a power of 2 
		double heightsq = Math.pow(h, 2);  //raising h to a power of 2 
		double diagonalsq = widthsq + heightsq;  //a squared + b squared 
		double diagonal = Math.sqrt(diagonalsq); //c squared 
		System.out.println("diagonal is = " + diagonal);
		  

	}

}
