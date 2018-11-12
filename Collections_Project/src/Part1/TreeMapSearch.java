package Part1;

/**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Load file input into a TreeMap, search for specific entries and calculate the time it takes
 * Inputs: Textfile with words that start with q not followed by u, and textfile with letters and Scrabble values
 * Outputs: The content of the TreeMap and the time it takes to load
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSearch {

    private static long time;

    //Main method to run the program
    public static void main(String[] args){


        // *** Load the alphabet with points ***

        //Creating TreeMap
        Map<String, Integer> letterPointMap = new TreeMap<>();

        //Initializes the chosen file
        File inputFile = new File("ScrabblePointValue.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(inputFile);

            while(in.hasNext()){
                //Get the next line from file, split at each whitespace
                String[] line = in.nextLine().split(" ");
                String letter = line[0]; //Saves the letter from the file
                int point = Integer.parseInt(line[1]); //Retrieves and saves the point from the file
                letterPointMap.put(letter,point); //put letter and points in TreeMap
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(letterPointMap);



        // *** Search for the word points ***

        //Creates TreeMap
        Map<String, Integer> wordPointsMap = new TreeMap<>();

        //Initializes the chosen file
        File qwords = new File("Qwords.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(qwords);

            time = System.nanoTime(); //Get current time in nanoseconds

            while(in.hasNext()){
                int totalWordPoint = 0;
                String word = in.nextLine(); //get next line from file
                //Iterate through each character in word
                for(char c : word.toCharArray()) {
                    //Get the point value for each character
                    int point = letterPointMap.get(Character.toString(c));
                    totalWordPoint += point; //Sum the points
                }
                wordPointsMap.put(word, totalWordPoint); //Put word and points in TreeMapS

                time = System.nanoTime() - time; //Get current time minus last timestamp
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(wordPointsMap);
        System.out.println(time + " ns");
    }
}
