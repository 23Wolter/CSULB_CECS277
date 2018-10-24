/**
 * Josephine & Oliver
 * October 23, 2018
 * Purpose: The purpose of this class is to simulate a Vulcan
 * Inputs: Same as interface
 * Output: Same as interface
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vulcan implements AlienCellPhone {

    //Simulates translation
    private final String[] wordEndings = {"!#$", "¤*?", "@£%"};

    //Null constructor
    public Vulcan(){}

    @Override
    /**
     * Overrides method from the interface AlienCellPhone (But is not implemented)
     */
    public void alienSendText(String fileName) {
        System.out.println("Vulcan sending message to file: " + fileName);
    }

    @Override
    /**
     * Overrides method from the interface AlienCellPhone
     */
    public void alienReadText(String fileName) {
        try {
            ClassLoader classLoader = getClass().getClassLoader(); //To reach a file in the src folder
            File file = new File(classLoader.getResource(fileName).getFile()); //creates new file from src folder
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                System.out.print(inputFile.next() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        }
    }

    @Override
    /**
     * Overrides method from the interface AlienCellPhone
     */
    public String translateText(String fileName) {

        String translatedText = ""; //To make sure translatedText is instantiated
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                int rand = (int) Math.floor(Math.random() * 3); //randomizes the three word endings
                translatedText +=  wordEndings[rand] + inputFile.next() + " "; //Is added in front of each word
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }

        return translatedText;
    }

    @Override
    /**
     * Prints information about the class
     */
    public String toString() {
        String txt = "This is a Vulcan. A Vulcan can read translated messages.";
        return txt;
    }
}
