package module5package;

import java.util.Scanner;

public class problem2 {

    public static String title(String message){
        // stores each characters to a char array
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;

        for(int count_1 = 0; count_1 < charArray.length; count_1++) {

            if(Character.isLetter(charArray[count_1])) { //test if the array element is a letter

                if(foundSpace) { //check for spaces to separate words

                charArray[count_1] = Character.toUpperCase(charArray[count_1]); //change the letter into uppercase if its not already 
                foundSpace = false;                                 //use built in toUpperCase() method. 
                }
            } else {  //if the item in the array is an int or space
                foundSpace = true;
            }
        }
        
        message = String.valueOf(charArray); // convert the array back into a string
        return message;
        }

    public static void main(String[] args) {
        /*
        uncomment this if you would like to test your own example
        title("london england 2015");
        */

        Scanner input = new Scanner(System.in); //open scanner
        System.out.println("Enter a sentence: "); //give user instructions
        String user_int = input.nextLine(); //covert scanner to variable 
    
        System.out.println(title(user_int));
        input.close(); //close scanner 
}}
