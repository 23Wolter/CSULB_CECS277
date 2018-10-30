import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Josephine and Oliver
 * October 30, 2018
 * Purpose: This class is testing the time of a TreeMap data structure
 * Inputs: file with words and points
 * Output: the time it takes to load the file
 */

public class TreeMap_Test {

    public static void main(String[] args) {

        try {

            File file = new File('QWords_points.txt');
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {

                String line = inputFile.nextLine();

            }

        }  catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }

}
