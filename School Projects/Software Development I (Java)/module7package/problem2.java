package module7package;

//for scanner
import java.util.*;


public class problem2{

        //declare a class we wll call point
        static class Point{
                //declare varibales used 
                double x;
                double y;
        }

        public static Point getCenterPoint(Point p1, Point p2, Point p3){

                //add average all x values to find mid, then do same for y
                double x = (p1.x + p2.x + p3.x) / 3;
                double y = (p1.y + p2.y + p3.y) / 3;
                
                Point answer = new Point();
                answer.x = x;
                answer.y = y;

                return answer;
                
        }
        public static void main(String args[]) { 
                
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
                Point answer = getCenterPoint(p1, p2, p3);


                System.out.println("The center is at ( " + answer.x + " , " + answer.y + ")");


                
        } 
}
