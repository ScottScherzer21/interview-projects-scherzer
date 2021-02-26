package module5package;

import java.util.*;


public class problem4 {

    public static void main(String[] args) {
        
        //declare variables used in loops 
        int input_rows;
        int var = 1;
        int text;
        int count_1;
        int count_2;

        System.out.print("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        input_rows = input.nextInt();
        
        //loop for printing shape, and calculating figures to be printed
        for (count_1=0; count_1 < input_rows; count_1++) {
            for(text = 1; text <= input_rows - count_1 ; text++)
            System.out.print(" ");
                for(count_2=0; count_2 <= count_1; count_2++){
                    if (count_2 == 0 || count_1 == 0)
                        var = 1;
                    else
                    var = var * ( count_1 - count_2 + 1 ) / count_2;
                    System.out.print(" " + var);
                    }           
        System.out.print("\n");
        }    
}}
