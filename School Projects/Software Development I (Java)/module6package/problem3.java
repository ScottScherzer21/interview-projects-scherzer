package module6package;
import java.util.*;
public class problem3 {

//(Anagrams) Write a method that checks whether two words are anagrams. 
//Two words are anagrams if they contain the same letters in any order. 
//For example, silent and listen are anagrams. The header of the method is:

//public static boolean isAnagram(String s1, String s2)

//Write a test program that prompts the user to enter two strings and, if they are anagrams, 
//displays two strings are anagrams, and displays two strings are not anagrams if they are not anagrams.


    public static boolean isAnagram(String s1, String s2){

        //test 1.. are they the same length? 
        int s1_len = s1.length();
        int s2_len = s2.length();
        
        //if so proceed. if not, false
        if (s1_len == s2_len){

            //convert String to char[]
            //and create 2 arrays. 

            //array1
            char[] array_1 = new char[s1_len];
            //populate array 
            for(int i = 0; i < s1_len; i++){
                array_1[i] = s1.charAt(i);
            }

            //array2
            char[] array_2 = new char[s2_len];
            //populate array 
            for(int i = 0; i < s1_len; i++){
                array_2[i] = s2.charAt(i);
            }
            
            //algo to ensure they are both the same
            for(int i = 0; i < s1_len; i++){
                
                //restart n every time
                
                //start matching algo
                try {
                    int n = 0;
                    while (array_1[i] != array_2[n]){

                        if (array_1[i] == array_2[n]){
                            //do nothing. next
                            n++;
                        }
                        //if they arent a match increment untill it matches
                        //exit if an error is raised
                        else if (array_1[i] != array_2[n]){
                            while (array_1[i] != array_2[n]){
                                n++;
                            }
                            
                        }
                        //if they are equal do nothing
                        //i increments by 1.
                    }

            
                //if this criteria is not met during ANY of the loop 
                //ececutions, then it is false. I am using try and 
                //catch as a "break" function communly used in python
                } catch (Exception e) {
                    return false;
                }
                
            }
        }else{
            return false;
        }

        //if all of the above has been executied without error,
        //true should be submitted
        return true;
    }


    public static void main(String[] args) {
        

        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String str2 = input.next();
        input.close();

        //logic for answer presenatation 
        boolean answer = isAnagram(str, str2);
        
        if (answer == true){
            System.out.println(str + " and " + str2 + " are anagrams");

        }else{
            System.out.println(str + " and " + str2 + " are not anagrams");
        }






        
    }








        

        




    

}

    