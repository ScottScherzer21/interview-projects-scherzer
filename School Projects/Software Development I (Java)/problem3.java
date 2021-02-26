import java.util.*;

public class problem3 {
    public static Rational parseRationalNumber(String s){

        //declare answer Rational object
        Rational rational_return = new Rational();

        //if the user enters a single number such as 2,
        //we need to just create an object with 2/1, no parsing needed
        int len = s.length();

        if (len == 1){
            long numerator_var = Long.parseLong(s); //convert string to long 
            rational_return.numerator = numerator_var; //set s value to numerator
            rational_return.denominator = 1;
            return rational_return;

        }else{

            String delimiters = "/ ";
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
            vector.add(s.substring(i, j));
            
            //loop to remove null values from arraylist 
            int len2 = vector.size();
            for(int z = 0; z < len2; z++){
                if(vector.size() == 2){
                    break;
                }
                else if(vector.get(z).equals("")){
                    vector.remove(z);
                    z = 0;
			    }
		    }

            //convert string values to Long
            long num1 = Long.parseLong(vector.get(0));
            long num2 = Long.parseLong(vector.get(1));

            //take the arraylist and convert it to a Rational object
            rational_return.numerator = num1;
            rational_return.denominator = num2;
            return rational_return;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first rational number: ");
        String input = scanner.nextLine();
        System.out.print("Enter the second rational number: ");
        String input2 = scanner.nextLine();
        scanner.close();
        

        Rational num1 = parseRationalNumber(input);
        Rational num2 = parseRationalNumber(input2);
        
        Rational result;
        result = num1.add(num2);
       
        System.out.println(num1 +" + " + num2 + " = " + result);
    }
}