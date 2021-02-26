package module8package;

import java.util.*;

public class Problem1 {

/*
(Split a string) Write the following method that splits a string into substrings using delimiter characters.

public static ArrayList<String> split(String s, String delimiters);

For example, split("AB#C D?EF#45", "# ?") returns a vector containing AB, C, D, EF, and 45.
Write a test program that prompts the user to enter a string and delimiters and displays the substrings
separated by a space. (You are not allowed to use the regex for splitting a string in this
exercise.)
*/

public static ArrayList<String> split(String s, String delimiters){
    ArrayList<String> vector = new ArrayList<String>();
    ArrayList<Character> delims = new ArrayList<Character>();

    //adding all the delimeters to an ArrayList
    for(int i = 0;i<delimiters.length();++i){
        delims.add(delimiters.charAt(i));
    }
   
    int i = 0;
    int j = i+1;
    //moving through the string
    while(j<s.length()){
        if(delims.contains(s.charAt(j))){
            //if character in the string is a delim make a
            //temporary string and set i and j
            String temp = s.substring(i, j);
            vector.add(temp);
            i = j+1;
            ++j;
        }
        else{
            //failure to execute results in incremting j
            ++j;
        }
    }
    return vector;
}


    public static void main(String[] args) {

        System.out.println(split("AB#C D?EF#45", "# ?"));

    }
    
}
