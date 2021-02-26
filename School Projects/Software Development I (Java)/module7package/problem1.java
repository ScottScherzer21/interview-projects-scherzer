package module7package;

//for scanner
import java.util.*;


public class problem1{

    //declare a class we wll call point
    static class Point{
        //declare varibales used 
        double x;
        double y;
        }

    public static Point getintersectingPoint(Point p1, Point p2, Point p3, Point p4){

        //notes and equations from 
        //http://paulbourke.net/geometry/pointlineplane/


                            //((y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1))
        double denominator = ((p4.y - p3.y)*(p2.x - p1.x) - (p4.x - p3.x)*(p2.y - p1.y));
        
                 //((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3))
        double a = ((p4.x - p3.x)*(p1.y - p3.y)  -  (p4.y - p3.y)*(p1.x - p3.x));
                 //((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3))
        double b = ((p2.x - p1.x)*(p1.y - p3.y) -  (p2.y - p1.y)*(p1.x - p3.x));

        double ua = a / denominator ;
        double ub = b / denominator ;

    
        Point answer = new Point();
        answer.x = p1.x + ua * (p2.x - p1.x);
        answer.y = p1.y + ua * (p2.y - p1.y);
        

        
        return answer;
    }
    
        


    public static void main(String args[]) { 
            
        Scanner input = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,x4,y4;

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();


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

        Point p4 = new Point();
        p4.x = x4;
        p4.y = y4;


        if( ((y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1)) == 0){
            System.out.println("The two lines are parallel");
        } else {
        
            //call method
            Point answer = getintersectingPoint(p1, p2, p3, p4);
            System.out.println("The intersection is at ( " + answer.x + " , " + answer.y + ")");
        }
    }
}
