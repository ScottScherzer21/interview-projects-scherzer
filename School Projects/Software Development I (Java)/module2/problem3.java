package module2;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
	

	//F is the force applied to push or pull an object in Newtons (N)
    //u is a coefficient of friction (u is small for a smooth surface and large for a rough surface)
	//m is the object’s mass in kilograms (kg)
	//g is the acceleration due to gravity, which is a constant 9.8 m/s (meters per square second)
	//a is the object’s acceleration in meters per square second (m/s)
		
		
	//set constant varibles
	double g = 9.8*9.8; //gravity 
	
	
	//prompt to receive f (force)
	System.out.print("Enter the friction force in Newtons: ");
	Scanner f = new Scanner(System.in);
	double friction = f.nextDouble();
	
	//prompt to receive m (mass)
	System.out.print("Enter the objects mass in kg: ");
	Scanner m = new Scanner(System.in);
	double mass = m.nextDouble();
		
	//prompt to receive a (acceleration)
	System.out.print("Enter the acceleration is m/s^2: ");
	Scanner a = new Scanner(System.in);
	double accel = a.nextDouble();
	
	//coefficient friction formula
	//f = u * m * g + m * a 
	//reorganize equation 
	//f/(mg + ma) = u 
	
	//isolate u
	double n = (mass * g) + (mass * accel);	
	double u = friction/n;
	//divide by n on both sides 
	
	System.out.println("The coefficient for friction is: " + u);
	
	
	
	
	
	
	
	
	
	}

}
