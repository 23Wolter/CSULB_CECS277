/**
 * Josephine & Oliver
 * October 23, 2018
 * Purpose: The purpose of this class is to simulate a trekkie
 * Inputs: Same as interface
 * Output: Same as interface
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Trekkie implements EarthCellPhone {

    //Null constructor
    public Trekkie(){}

    @Override
    /**
     * Overrides method from the interface EarthCellPhone
     */
    public void sendMessage(String languageType, String fileName) {
        String message = ""; //To make sure message is instantiated
        try {
            ClassLoader classLoader = getClass().getClassLoader(); //To reach a file in the src folder
            File file = new File(classLoader.getResource(fileName).getFile()); //creates new file from src folder
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                message += inputFile.next() + " "; //message gets added the next word in inputFile
            }
            System.out.print(message); //output message to console
            inputFile.close(); //close input stream

            String newFileName = fileName.substring(0, fileName.length()-4) + ".txt"; //create fileName equal to inputFile
            PrintWriter output = new PrintWriter(newFileName); //create new output file
            output.println(message); //output message to new file
            output.close(); //close output stream
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }

    @Override
    /**
     * Overrides method from the interface EarthCellPhone
     */
    public void readMessage(String fileName) {
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
    /**
     * Prints information about the class.
     */
    public String toString() {
        String txt = "This is a trekkie. A Trekkie speaks English but can translate to other languages as well.";
        return txt;
    }
}
