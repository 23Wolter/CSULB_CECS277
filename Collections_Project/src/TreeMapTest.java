import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args){

        //Creating HashMap
        Map<String, Integer> tm = new TreeMap<>();

        //Initializes the chosen file
        File inputFile = new File("QWords_points.txt");

        //Reads from file
        try {
            Scanner in = new Scanner(inputFile);
            while(in.hasNext()){

                String line = in.nextLine();
                String[] wordsAndPoints = line.split(" ");

                String currentWord = wordsAndPoints[0];
                Integer currentPoint = Integer.parseInt(wordsAndPoints[1]);

                tm.put(currentWord,currentPoint);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(tm);

    }
}
