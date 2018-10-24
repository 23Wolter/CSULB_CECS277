/**
 * Josephine and Oliver
 * October 23, 2018
 * Purpose: The purpose of this class is to act like an adapter between the AlienCellPhone and the EarthCellPhone
 * Inputs: languageType, filename language, filename
 * Output: void
 * @author Josephine Plass-Nielsen and Oliver Nielsen
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EarthToAlienAdapter implements EarthCellPhone {

    //Instance of AlienCellPhone
    private AlienCellPhone acp;

    //ArrayList of valid languages
    private ArrayList<String> validLanguage;

    //The translated text
    private String translatedText;

    /**
     * Constructor takes an instance of the AlienCellPhone
     * Adds Vulcan and Klingon as valid languages
     * @param acp - AlienCellPhone instance
     */
    public EarthToAlienAdapter(AlienCellPhone acp) {
        this.acp = acp;
        validLanguage = new ArrayList<String>();
        addLanguage("Vulcan");
        addLanguage("Klingon");
    }

    /**
     * Overrides sendMessage from the interface EarthCellPhone
     * @param languageType - Needs which language to write to
     * @param fileName - Needs the name of the file to write to
     */
    @Override
    public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {

        boolean langFound = false;
        //first check if language exists in language ArrayList
        for (String lang : validLanguage) {
            if(languageType.equals(lang)){ //if language exist, call translateText from AlienCellPhone
                langFound = true;
                translatedText = acp.translateText(fileName); //this calls the specific alien's translate method
                System.out.println("Translation successful: " + translatedText);
                break;
            }
        }
        if(!langFound) { //If language is not valid, throw exception
            throw new InvalidLanguageException(languageType + " is not supported");
        }

        try { //Handles fileNotFound
            String newFileName = fileName.substring(0, fileName.length()-4) + ".txt";
            PrintWriter output = new PrintWriter(newFileName);
            output.println(translatedText);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }

        //create a new file with the translated text (overwrite new filename of this message)
    }

    /**
     * Adds a language to the arrayList of valid languages
     * @param lang - takes a language
     */
    public void addLanguage(String lang){
        validLanguage.add(lang);
    }

    /**
     * Overrides readMessage from the EarthCellPhone interface
     * @param fileName - Needs a name of the file to read from
     */
    @Override
    public void readMessage(String fileName) {

        System.out.println("Reading message from:" + fileName);

    }

    @Override
    public String toString() {
        String txt = "This is a EarthToAlienAdapter. Valid languages are: " + validLanguage;
        return txt;
    }
}
