package Part1;

/**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Load input from a file into a TreeMap and calculate the time it takes
 * Inputs: A textfile containing words that start with q not followed by u
 * Outputs: The content of the TreeMap and the time it takes to load
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {

    private static long time;

    public static void main(String[] args){

        //Creating TreeMap
        Map<String, Integer> tm = new TreeMap<>();

        //Initializes the chosen file
        File inputFile = new File("QWords.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(inputFile);

            time = System.nanoTime(); //Get current time

            while(in.hasNext()){
                tm.put(in.nextLine(),0); //Put each line into TreeMap
            }

            time = System.nanoTime() - time; //Get current time minus last timestamp

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(tm);
        System.out.println(time + " ns");

    }
}
