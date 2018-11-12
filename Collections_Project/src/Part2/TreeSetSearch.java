package Part2;

/**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Load input from a large file into a TreeSet and search for a specific word
 * Inputs: A textfile containing the entire Alice in Wonderland novel
 * Outputs: The content of the TreeSet and the time it takes to search
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSearch {

    private static long time;

    //Main method to run the program
    public static void main(String[] args){

        //Creating TreeSet
        Set<String> ts = new TreeSet<>();

        //Initializes the chosen file
        File inputFile = new File("alice.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(inputFile);

            while(in.hasNext()){
                //Put every word from file into TreeSet
                String word = in.next();
                //Replace words that ends with other characters, like: ".", ",", ":", etc.
                ts.add(word.replaceAll("[^a-zA-Z0-9' ]", ""));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(ts);

        //Word to be searched for
        String searchWord = "live";

        //Get current time in nanoseconds
        time = System.nanoTime();

        //Run search 100 times
        for(int i=0; i<100; i++) {
            //Loop through each word in TreeSet
            for(String word : ts) {
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
