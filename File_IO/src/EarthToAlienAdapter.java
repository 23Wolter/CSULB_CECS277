/**
 * Josephine & Oliver
 * October 10, 2018
 * Purpose:
 * Inputs:
 * Output:
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EarthToAlienAdapter implements EarthCellPhone {

    //ArrayList of valid languages
    AlienCellPhone acp;

    public EarthToAlienAdapter(AlienCellPhone acp) {
        this.acp = acp;
    }

    @Override
    public void sendMessage(String languageType, String fileName) {

        //first check if language exists in language ArrayList

        String translatedText = acp.translateText(fileName); //this calls the specific alien's translate method

        //create a new file with the translated text (overwrite new filename of this meesage)
    }

    @Override
    public void readMessage(String fileName) {

    }

    /*
    Method to add new languages to the ArrayList of valid languages
     */
}
