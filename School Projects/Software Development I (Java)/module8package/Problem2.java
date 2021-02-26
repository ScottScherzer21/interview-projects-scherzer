package module8package;
import java.util.*;
class problem2{ 

    // Returns number of bins required 
    static int nextBin(int weight[], int n, int max) 
    { 
        // Initialize result (Count of bins) and remaining 
        int answer = 1, bin_rem = max; 

        for (int i = 0; i < n; i++) { 
            // If this item can't fit in current bin 
            if (weight[i] > bin_rem) { 
                answer++; // Use a new bin 
                bin_rem = max - weight[i]; 
            } 
            else
                bin_rem -= weight[i]; 
            if((weight[i]+bin_rem)==10){
                System.out.println("Container "+answer+" contains objects with weight "+ weight[i]+" "+bin_rem);       
            }
        } 
        return 0;
    } 

// Main program 
    public static void main(String[] args){ 

        System.out.println("Enter the number of objects: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println("Enter the weights of the objects:");
        int []ojects = new int[n];

        

        for(int i=0; i<n; i++)
            ojects[i] = sc.nextInt();


        int max = 10;    
        System.out.println(nextBin(ojects, n, max)); 

                
            
    } 
} 