/**
 * Josephine & Oliver
 * October 23, 2018
 * Purpose: The purpose of this class is to simulate a Klingon
 * Inputs: Same as interface
 * Output: Same as interface
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Klingon implements AlienCellPhone {

    //Simulates translation
    private final String[] wordEndings = {"borg", "zip", "harp"};

    //Null constructor
    public Klingon(){}

    @Override
    /**
     * Overrides method from the interface AlienCellPhone (But is not implemented)
     */
    public void alienSendText(String fileName) {
        System.out.println("klingon sending message to file: " + fileName);
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
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        }
    }

    @Override
    public String translateText(String fileName) {

        String translatedText = "";

        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                int rand = (int) Math.floor(Math.random() * 3); //Randomizes the three word endings
                translatedText += inputFile.next() + wordEndings[rand] + " "; //Is added after each word
            }
            inputFile.close();
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
        String txt = "This is a Klingon. A Klingon can read translated messages.";
        return txt;
    }
}
