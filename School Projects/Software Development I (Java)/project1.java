
package Project1folder;

import java.util.*;

public class project1{
    
    // Method to extract the maximum value 
    static int max_in_string(String str) { 
        int num = 0;
        int res = 0; 

        // Start traversing the given string 
        for (int y = 0; y<str.length(); y++) { 
            // If a numeric value comes, start converting 
            // it into an integer till there are consecutive 
            // numeric digits 
            
            if (Character.isDigit(str.charAt(y))) { 
                num = num * 10 + (str.charAt(y)-'0'); 
            }
            // Update maximum value 
            else { 
                res = Math.max(res, num); 

                // Reset the number 
                num = 0; 
            } 
        } 



    // Return maximum value 
    return Math.max(res, num); 
    } 

     //Function return true if given element 
    // found in array 
    private static boolean check(int[] arr, int toCheckValue) { 
        // check if the specified element 
        // is present in the array or not 
        // using Linear Search method 
        boolean test = false; 
        for (int element : arr) { 
            if (element == toCheckValue) { 
                test = true; 
                break; 
                } 
        }
        return test;
    }

    public static void main(String[] args) {
        
        // PHASE 1 :
        // 1. Gather user input
        // 2. Convert the str input into a workable int array 

        
        System.out.print("Enter your numbers separated by a space.");
        Scanner input = new Scanner(System.in);
        String input_str = input.nextLine();
        input.close();
        
        //using String split function
        String[] input_array_str = input_str.split(" ");
        
        //find len of the str array so we can create a new one
        int len = input_array_str.length;
        
        //create an int array, same size as the str one
        int [] input_int_arr = new int [len];

        //create a BOOLEAN array. 
        //we will use boolean array to track if a * has ever been printed. 
        //once a * has been printed, true will be stored in the corresponding index
        //now, once a * has been printed, the loop searches for a new y value to add an asterick for it will still...
        //print *"s for previous astericks printed"
        //we will use len to make it the same size as our int array
        boolean print_history_arr[] = new boolean[len];

        //while y is less then the len of the str array, add a str element to the new int array.
        for(int y = 0; y < len; y++) {
            input_int_arr[y] = Integer.parseInt(input_array_str[y]);
        }
        
        //PHASE 1 END
        




        //PHASE 2 PART A
        //Execute code
        //asign simple variables
    
        //use these to make code look cleaner
        String asterick = "*";
        String space = " ";

        //PHASE 2 PART B
        //EXECUTE LOOP 
        //FIND Y in ARRAY to match X value 
        //IF they match, print * 
        //if not, print " "
        //IF A VALUE HAS EVER PRINTED AN ASTERIC STORE IT IN THE BOOLEN ARRAY 
        //Print y = x and also previously printed spots
        
        //the max will be found using the input string. NOT INT
        int max = max_in_string(input_str); 
        int y = max; 
        
        
        //run this loop for (y) many times to print every x axis number 
        while (y >= 0){ 
            
            //Start x axis as max + 1. 
            // the first time this loop executes it will not increase by anything 
            // this is so on the next lines the x axis values will not get ignored. 
            
            //for printint big x axis labels 
            if (y >= 10){
                System.out.print(y + "|");

            //add space for smaller x axis labels
            } else if (y < 10) {
                System.out.print(y + " |"); 
            }

            int x = 0; //restart y axis every time a full execution is acheived

            //this is to print astericks before an x = y criteria has been met
            
            //only can execute this if the y exists in the x
            if (check(input_int_arr, y) == true){
                
                //x = 0 , len = 10
                while(x < len){
                    if ((print_history_arr[x] == true) || (input_int_arr[x] == y)){
                        //first assign boolen array to true 
                        print_history_arr[x] = true;
                        System.out.print(space);
                        System.out.print(asterick);

                    }else{ 
                        System.out.print(space);
                        System.out.print(space);
                    }
                    //increase untill we parse the entire axis
                    x++;
                }
            //could use an else here but i like to visualize my logic
            } else if (check(input_int_arr, y) == false){
                while(x < len){
                    if (print_history_arr[x] == true){
                        //first assign boolen array to true 
                        System.out.print(space);
                        System.out.print(asterick);

                    }else{ 
                        System.out.print(space);
                        System.out.print(space);
                    }
                    x++;
                }
            }
                
            
            //restart loop 
            System.out.println(space); //skip line
            y--; //decrement x axis
        }

        //print x axis labels    
        System.out.println("-".repeat(max*3));
        System.out.println("   " + input_str);
        
}}
