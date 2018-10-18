/**
 * Josephine & Oliver
 * October 17, 2018
 * Purpose: The purpose of this class is to act like an adapter between the AlienCellPhone and the EarthCellPhone
 * Inputs: languageType, filename language, filename
 * Output: void
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EarthToAlienAdapter implements EarthCellPhone {

    //Instance of AlienCellPhone
    private AlienCellPhone acp;

    //ArrayList of valid languages
    private ArrayList<String> validLanguage = new ArrayList<String>();

    //Constructor takes an instance of the AlienCellPhone
    public EarthToAlienAdapter(AlienCellPhone acp) {
        this.acp = acp;
    }

    /**
     * Overrides sendMessage from the interface EarthCellPhone
     * @param languageType - Needs which language to write to
     * @param fileName - Needs the name of the file to write to
     */
    @Override
    public void sendMessage(String languageType, String fileName) throws LangNotSupportedException {

        //first check if language exists in language ArrayList
        if(languageType.equals(validLanguage)){

            String translatedText = acp.translateText(fileName); //this calls the specific alien's translate method
        } else {

            throw new LangNotSupportedException("Language is not supported yet");

        }



        //create a new file with the translated text (overwrite new filename of this meesage)
    }

    /**
     * Adds a language to the arrayList of valid languages
     * @param lang - takes a language
     */
    public void AddLanguage(String lang){
        validLanguage.add(lang);
    }

    /**
     * Overrides readMessage from the EarthCellPhone interface
     * @param fileName - Needs a name of the file to read from
     */
    @Override
    public void readMessage(String fileName) {

    }

}
