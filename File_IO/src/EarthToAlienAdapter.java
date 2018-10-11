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

    AlienCellPhone acp;

    public EarthToAlienAdapter(AlienCellPhone acp) {
        this.acp = acp;
    }

    @Override
    public void sendMessage(String languageType, String fileName) {

        if( languageType == "Klingon") {
            acp = new Klingon();
            acp.translateText("");
        }

    }

    @Override
    public void readMessage(String fileName) {

    }
}
