
public class Problem1 {

	public static void main(String[] args) {
		//Write a program that computes the discriminant 
		//for the equation 3x^2 + 4x + 5 = 0.
		int a = 3;
		int b = 4;
		int c = 5;
		
		
		
        double b_squared = (Math.pow(b, 2));
        double answer = (b_squared) - (4*a*c) ;
        System.out.println("answer = " + answer);
	}

}
