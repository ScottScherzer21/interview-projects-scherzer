package module5package;

import java.util.Scanner;

public class problem3 {

    public static String format(long input_seconds){

        long mins = input_seconds / 60;
        long seconds = input_seconds % 60 ; 

        //now that we have converted t mins and seconds, we can use mins to convert to hours. 
        long hours = 0;
        while(mins >= 60){
            mins = mins - 60; //decrease 60 from mins each time
            hours++;          //increase hours by 1 
        }
        
        //declare new variable
        String padded_hours = "";
        String padded_mins = "";
        String padded_seconds = "";
 
        //creating organized padded output 
        //if the category is less than 2 digits, add a zero in front of it and convert to string 
        //if it is already 2 digits, convert it right to a string
        if (hours < 10){
            padded_hours = String.format("%02d", hours);
        } else { 
            padded_hours = Long.toString(hours); }

        if (mins < 10){
            padded_mins = String.format("%02d", mins);
        } else { 
            padded_mins = Long.toString(mins); }

        if (seconds < 10){
            padded_seconds = String.format("%02d", seconds);
        } else { 
            padded_seconds = Long.toString(seconds); }

    
        String answer = padded_hours.concat(":").concat(padded_mins).concat(":").concat(padded_seconds);
        return answer;
        } 
    
	public static void main(String[] args) {

        // Create a scanner        
        Scanner input = new Scanner(System.in); 
		// Prompt the user to enter seconds
		System.out.print("Enter seconds: ");
        long seconds_input = input.nextLong();
        
        // Convert seconds to hours, minutes, and seconds
        System.out.println("hrs : minutes : seconds");
        System.out.println(format(seconds_input));
        input.close();


        
    
}}

	
	
	
