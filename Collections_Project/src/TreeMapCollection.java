import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Josephine and Oliver
 * October 30, 2018
 * Purpose: This class is testing the time of a TreeMap data structure
 * Inputs: file with words and points
 * Output: the time it takes to load the file
 */

public class TreeMapCollection implements Collection {

    private TreeMap<String, Integer> treeMap;

    public TreeMapCollection(){
        try {

            File file = new File("QWords_points.txt");
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {

                String line = inputFile.nextLine();
                String[] wordsAndPoints = line.split(" ");
                String word = wordsAndPoints[0];
                int point = Integer.parseInt(wordsAndPoints[1]);

                treeMap.put(word, point);
            }

        }  catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }

    @Override
    public Iterator createIterator() {
        return new TreeMapIterator(treeMap);
    }


}
