package module6package;
import java.util.*;
public class problem2 {

/*
2. (Occurrences of each digit in a string) Write a method that counts the occurrences of each digit in a
string using the following header:

public static int[] count(String s)

The method counts how many times a digit appears in the string. The return value is an array of
ten elements, each of which holds the count for a digit. For example, after executing int[] counts
= count("12203AB3"), counts[0] is 1, counts[1] is 1, counts[2] is 2, and counts[3] is 2. Write a
test program that prompts the user to enter a string and displays the number of occurrences of each
digit in the string.
*/
 
public static int[] count(String s){
    //create a new int array 
    int string_len = s.length();
    int[] array = new int[string_len];

    for(int i = 0; i < string_len; i++){
        if(Character.isDigit(s.charAt(i))){
            String string = Character.toString(s.charAt(i));
        
        //now convert to int
        int integer_ = Integer.parseInt(string);
        //++ for array[element]
        array[integer_] = array[integer_] + 1;
        }
    }   
    return array;
}
 

    public static void main(String[] args) {

        //prompt the user to enter a string.
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.next();

        //run function here
        int[] int_array = count(str);
        int len = int_array.length;

        input.close();

        for(int i = 0; i < len; i++){
            if(int_array[i] != 0){
                System.out.println("Count for [" + i + "] is: " + int_array[i]);
            }

        }
    }
}
