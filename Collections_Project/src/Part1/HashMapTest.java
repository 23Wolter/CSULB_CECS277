package Part1;

/**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Load input from a file into a HashMap and calculate the time it takes
 * Inputs: A textfile containing words that start with q not followed by u
 * Outputs: The content of the HashMap and the time it takes to load
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {

    private static long time;

    //Main method to run the program


    public static void main(String[] args){

        //Creating HashMap
        Map<String, Integer> hm = new HashMap<>();

       //Initializes the chosen file
        File inputFile = new File("QWords.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(inputFile);

            //Get current time in nanoseconds
            time = System.nanoTime();

            while(in.hasNext()){
                //Put every line/word from file into HashMap
                hm.put(in.nextLine(),0);
            }

            //Get current time minus last timestamp
            time = System.nanoTime() - time;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(hm);
        System.out.println(time + " ns");

    }
}
