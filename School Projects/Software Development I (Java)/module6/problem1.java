package module6package;
import java.util.*;
public class problem1 {

    public static void main(String[] args) {
        /*
        (Area of a polygon) Write a program that prompts the user to enter the points of a convex polygon and
        display its area. Assume that the polygon has six end points and the points are entered clockwise. For
        the definition of a convex polygon, see http://www.mathopenref.com/polygonconvex.html. Hint:
        the total area of a polygon is the sum of the areas of the small triangles as shown in Figure 1.
        */

    
        System.out.println("Enter 8 points in x y format separated by a space ");
        Scanner input = new Scanner(System.in);
        double[][] input_coordinates = new double[4][2];
        double[][] area = new double[4][1];

        for (int i = 0; i < input_coordinates.length; i++) {
            input_coordinates[i][0] = input.nextDouble();
            input_coordinates[i][1] = input.nextDouble();
        }

        
        for (int h = 0; h < input_coordinates.length; h++) {
            double x1 = input_coordinates[h][0];
            double y1 = input_coordinates[h][1];

            for (int i = 0; i < input_coordinates.length; i++) {
                double x2 = input_coordinates[i][0];
                double y2 = input_coordinates[i][1];
                double dist = x2 - x1;
                double dist2 = y2 - y1;
                double a = (.5) * (dist) * (dist2);

                if (i == 3) {
                    area[h][0] = a;
                }

            }   

        }

        System.out.print("The areas are ");
        for (int n = 0; n < area.length; n++) {
            System.out.print(area[n][0] + " ");
        }   

        input.close();
    }}
    

