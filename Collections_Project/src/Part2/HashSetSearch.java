package Part2;

/**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Load input from a large file into a HashSet and search for a specific word
 * Inputs: A textfile containing the entire Alice in Wonderland novel
 * Outputs: The content of the HashSet and the time it takes to search
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetSearch {

    private static long time;

    //Main method to run the program
    public static void main(String[] args){

        //Creating HashSet
        Set<String> hs = new HashSet<>();

        //Initializes the chosen file
        File inputFile = new File("alice.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(inputFile);

            while(in.hasNext()){
                //Put every word from file into HashSet
                String word = in.next();
                //Replace words that ends with other characters, like: ".", ",", ":", etc.
                hs.add(word.replaceAll("[^a-zA-Z0-9' ]", ""));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(hs);


        //The word to be searched for
        String searchWord = "live";

        //Get current time in nanoseconds
        time = System.nanoTime();

        //Run search 100 times
        for(int i=0; i<100; i++) {
            //Loop through each word in HashSet
            for(String word : hs) {
                if(word.equals(searchWord)) {
                    break;
                }
            }
        }
        //Get current time minus last timestamp
        time = System.nanoTime() - time;

        System.out.println(time + " ns");
    }
}
