package module4;

import java.util.Scanner;


public class problem3 {
    /*
    Biologists use a sequence of the letters A, C, G, and T to model a genome.
    A gene is a substring of a genome that starts after a triplet ATG and ends before a triplet TAG, TAA,
    or TGA. Furthermore, the length of a gene string is a multiple of 3, and the gene does not contain any
    of the triplets ATG, TAG, TAA, or TGA. 
    
    Write a program that prompts the user to enter a genome and displays all genes in the genome. 
    
    If no gene is found in the input sequence, display “no gene is found”.
    */

    public static void main(String[] args) {

        //take user input    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String genome = input.nextLine();
        boolean found = false;
        int start = -1;
        input.close();
        
        for (int i = 0; i < genome.length() - 2; i++) {
            String triplet = genome.substring(i, i + 3);

            
            if (triplet.equals("ATG")) {
                start = i + 3;
            }else if
            (((triplet.equals("TAG")) || 
            (triplet.equals("TAA")) || 
            (triplet.equals("TGA"))) &&
            (start != -1)){
                String gene = genome.substring(start, i);
                if (gene.length() % 3 == 0){
                    found = true;
                    System.out.println(gene);
                    start = -1;
                }
            }
        }
        //if all is false
        if (!found)
            System.out.println("no gene is found");
        
}}


       
        









