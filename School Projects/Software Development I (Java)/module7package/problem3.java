package module7package;

import java.util.*;
public class problem3 {

     //declare a class we wll call point
    static class Point{
        //declare varibales used 
        double x;
        double y;
    }

    public static double getTriangleArea(Point p1, Point p2, Point p3){

/*
        double side1 = (x2 - x1 ^ 2) + (y2 - y1 ^  2)     ^ 0.5)
		double side2 = (x3 - x2 ^ 2) + (y3 - y2 ^ 2)      ^ 0.5)
        double side3 = (x1 - x3 ^ 2) + (y1 - y3 ^  2)     ^ 0.5)
*/
        double side1 = Math.pow(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2), 0.5);
        double side2 = Math.pow(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y - p2.y, 2), 0.5);
        double side3 = Math.pow(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2), 0.5);
        
        double sides = (side1 + side2 + side3) / 2;
		double answer = Math.pow(sides * (sides - side1) * (sides - side2) * (sides - side3), 0.5);
        return answer;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3;

        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        input.close();

        //assign the variables into the objects in the class
        Point p1 = new Point();
        p1.x = x1;
        p1.y = y1;

        
        Point p2 = new Point();
        p2.x = x2;
        p2.y = y2;


        Point p3 = new Point();
        p3.x = x3;
        p3.y = y3;


         //call method
        if((x1 == y1) && (x2 == y2) && (x3 == y3)){
            System.out.println(
                "The three points are on the same line");
        }else{
            double answer = getTriangleArea(p1, p2, p3);
            System.out.println("the area is: " + answer);
        }
    }
}