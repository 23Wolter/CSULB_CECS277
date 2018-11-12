package Part2;

/**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Load input from a large file into a HashSet and calculate the time it takes
 * Inputs: A textfile containing the entire Alice in Wonderland novel
 * Outputs: The content of the HashSet and the time it takes to load
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetTest {

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

            //Get current time in nanoseconds
            time = System.nanoTime();

            while(in.hasNext()){
                //Put every word from file into HashSet
                String word = in.next();
                hs.add(word.replaceAll("[^a-zA-Z0-9' ]", ""));
            }

            //Get current time minus last timestamp
            time = System.nanoTime() - time;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(hs);
        System.out.println(time + " ns");

    }
}
