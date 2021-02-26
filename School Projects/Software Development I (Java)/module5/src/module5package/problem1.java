package module5package;

import java.util.Scanner;

public class problem1 {

    public static String decimalToBinary(int value){
        return Integer.toBinaryString(value);
    }

    public static void main(String[] args) {
        
        /*
        you can uncomment this if you would easily like to test using 
        the example you gave

        System.out.println(decimalToBinary(1451));

        */

        Scanner input = new Scanner(System.in); //open scanner
        System.out.println("Enter an integer: "); //give user instructions
        int user_int = input.nextInt(); //covert scanner to variable 
        
        System.out.println(decimalToBinary(user_int)); //run method
        input.close(); //close scanner 





       
        
    
}}
