import java.util.*;

public class problem1 {
    
    public static void main(String[] args) throws CloneNotSupportedException{


        Scanner input = new Scanner(System.in);
        System.out.print("Enter time1 (hour minute second): ");
        String input_string1 = input.nextLine();

        Time time1 = new Time(input_string1);

        String time2str = Time.toString(Time.getHours(Time.hour), Time.getMinute(Time.minute, Time.second), Time.getSecond(Time.second));
        int elapsed_seconds = Time.elapsed_seconds(Time.hour, Time.minute, Time.second);

        System.out.println(time2str);
        System.out.println("Elapsed Seconds: " + elapsed_seconds);

        System.out.print("Enter time2 (elapsed time): ");
        String input_string2 = input.nextLine();
        input.close();

       
        Time time2 = new Time();  //create a new time object 
        int time2_input_seconds = Integer.parseInt(input_string2); //convert Str to int
        time2.second = time2_input_seconds;  
        

        //by using the seconds instance, we can create instances for hours and minutes
        time2.hour = Time.getHours((time2.second/60)/60); //hours = seconds/60/60
        time2.minute = Time.getMinute(time2.second/60, time2.second); //minutes = seconds/60
        //implement getsecond method after we populated the other instances with the raw data
        time2.second = Time.getSecond(time2.second);


        //now that we correctly populated the instances, we can plug them into our Time methods. 
        String time2str2 = Time.toString(time2.hour, time2.minute, time2.second);
        int elapsed_seconds2 = Time.elapsed_seconds(0, 0, time2.second);

        System.out.println(time2str2);
        System.out.println("Elapsed Seconds: " + elapsed_seconds2);

        System.out.println("time1.compareTo(time2)? " + (time1.second - time2_input_seconds));


        Time time3 = new Time();
        time3 = time1.clone;

        System.out.println("time1.compareTo(time3)? " + (time1.second - time3.second));

    }
}

class Time implements Cloneable, Comparable{
    public Time clone;
    static String hour_minute_second;
    static long time;
    static int hour;
    static int minute;
    static int second;

    // this will be used to separate our input by white space.
    // Since we are inputing hours minutes seconds this method will create an
    // arraylist so that:
    // list = [hours, minutes, seconds]
    ArrayList<String> string_to_arraylist(String s) {

        String[] input_array = s.split(" "); // create a list and pupolate it with input String s
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input_array)); // convert array to arraylist
        return list;
    }


    // contructor for Time
    // invole this constructor by using (new Time)
    Time(String hour_minute_second) {

        // create a list, then populate the list with the input data
        ArrayList<String> input_list = new ArrayList<String>();
        input_list = string_to_arraylist(hour_minute_second);

        // populating varibales with list items
        String hours_string = input_list.get(0);
        String minutes_string = input_list.get(1);
        String seconds_string = input_list.get(2);

        // Converting String into int using Integer.parseInt() to finish constructor
        hour = Integer.parseInt(hours_string);
        minute = Integer.parseInt(minutes_string);
        second = Integer.parseInt(seconds_string);
    }

    //default constructor if we need it
    public Time() {
    }

    // hours are counted in increments of 24 rather than 60
    //so decrement hours by 24 for every occurance that hours > 23
    static int getHours(int hours) {
        while(hours > 23){
            hours = hours - 24;
        }
        return hours;
    }

    //we need to feed this method minutes and seconds, because additional seconds
    //need to be accounted for while finding minutes
    static int getMinute(int minutes, int seconds) {

        //loop to figure out how many extra minutes to add from seconds
        //no need to run if there are less than 60 seconds
        if(seconds >= 60){

            // loop for reducing seconds, and adding any additional required minutes
            int extra_minutes = 0;
            while (seconds > 0){
                if(seconds % 60 == 0){
                    extra_minutes = seconds / 60 ;
                    break;
                }
                else if(seconds % 60 != 0){
                    seconds--;
                }
            }
            
            // add additional required minutes before adjusting minutes
            minutes = minutes + extra_minutes;
        }


        while (minutes > 60) {
            minutes = minutes - 60;
        }
        return minutes;
        
    }


    static int getSecond(int seconds) {
        while (seconds >= 60) {
            seconds = seconds - 60;
        }
        return seconds;
    }

    static int elapsed_seconds(int hours, int minutes, int seconds){

        int seconds_elapsed = 0;                     //initialize seconds elapsed
 
        int mins_elapsed = (hours * 60);             //find mins elapsed
        mins_elapsed = mins_elapsed + minutes;       //add mins elapsed from hours to actual minutes
        seconds_elapsed = mins_elapsed * 60;         //convert total mins to seconds
        seconds_elapsed = seconds_elapsed + seconds; //add actual seconds to previous caluclation 
        
        return seconds_elapsed;
    }

    static String toString(int hours, int minutes, int seconds){

        String answer = hours + " hours " + minutes + " minutes " + seconds + " seconds ";
        return answer;
    }
    //create the clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

}