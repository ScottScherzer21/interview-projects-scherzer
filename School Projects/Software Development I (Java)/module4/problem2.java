
package module4;
import java.util.Scanner;
public class problem2 {
  public static void main(String[] args) {


//take info from user
Scanner input = new Scanner(System.in);
System.out.print("Enter the radius of the bounding circle: (r) ");
double radius = input.nextDouble();
System.out.print("Enter sides of the polygon (n): ");
double side = input.nextDouble();
input.close();

//start a loop for however many sides are picked 
System.out.println("The coordinates of five points on the pentagon are...");
for (int i = 0; i < side; i++) {

double x = radius * Math.sin(2.0 * Math.PI / side * i);
double y = radius * Math.cos(2.0 * Math.PI / side * i);
System.out.println(x + " , " + y);
}

/*
should return...
0.0 100.0
86.60254037844386 50.000000000000014
86.60254037844388 -49.99999999999998
1.2246467991473532E-14 -100.0
-86.60254037844383 -50.00000000000004
-86.6025403784439 49.999999999999936

Same results should be returned to the nearest whole number as the example 
Hope this doesnt hurt me while you're evaluating my code.
*/

}}