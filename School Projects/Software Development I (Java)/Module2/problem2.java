package module2;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//v1 is the final velocity in meters per second (m/s)
		//v0 is the initial velocity in meters per second (m/s)
		//t is the time elapsed in seconds
		//a is the object’s acceleration in meters per square second (m/s2)
		//d is the distance traveled in meters
		
		//constant variables
	    double a = 9.8; //gravity
		double v0 = 0; //initial velocity for a dropped object is always 0 m/s
		
		//user input is the time
		System.out.print("Enter the ball travel time in seconds: ");
		Scanner t = new Scanner(System.in);
		double time = t.nextDouble();
		
        //Eq1 : v1 = v0 + a × t
		double v1 = v0 + (a*time);
		
		//Eq2 : d = averageSpeed × t, 
		//averageSpeed = (v0 + v1)/2
		double avgspeed = (v0 + v1) / 2;
		double d = avgspeed*time;
		System.out.println(d);
		
	
	
		
		
	    
		 
	}

}
