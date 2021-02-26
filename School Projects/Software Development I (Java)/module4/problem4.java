package module4;

import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {
    /*
    (Reduce square root) Write a program that prompts the user to enter a positive integer and obtains its
    square root in simplest form. For example, the simplest form for 
    √18 is 3√2
    sqrt28 is 2√7 , 
    and for 3√648 is 18√2
    */
    
    //grab user info
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive Integer: ");
    int user_input_var = input.nextInt();
    input.close();

    //set constant variables
    int root_1 = user_input_var; 
    int root_2 = 1;
    int power_var = 2;
    

    while(power_var * power_var <= root_1) {
      //find if int is capable of being factorable
      if(root_1 % ( power_var * power_var ) == 0 ){
        root_1 = root_1 / (power_var * power_var);
        root_2 = root_2 * power_var;
      
    }else
        //increment var to try another int
        power_var++;
    }

        //return the result 
        if(root_2!=1 && root_1!=1)
            System.out.println("sqrt("+user_input_var+") is "+root_2+"*sqrt("+root_1+")");
        if(root_1==1&&root_2!=1)
            System.out.println("sqrt("+user_input_var+") is "+root_2);
        if(root_1!=1 && root_2==1)
            System.out.println("sqrt("+user_input_var+") is " +"sqrt("+root_1+")");
        if(root_1==1 && root_2==1)
            System.out.println("sqrt("+user_input_var+") is " +1);
 
        
 }}