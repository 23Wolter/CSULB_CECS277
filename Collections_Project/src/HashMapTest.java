import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {

    public static void main(String[] args){

        //Creating HashMap
        Map<String, Integer> hm = new HashMap<>();

       //Initializes the chosen file
        File inputFile = new File("QWords_points.txt");

        //Reads from file
        try {
            Scanner in = new Scanner(inputFile);
            while(in.hasNext()){

                String line = in.nextLine();
                String[] wordsAndPoints = line.split(" ");

                String currentWord = wordsAndPoints[0];
                Integer currentPoint = Integer.parseInt(wordsAndPoints[0]);

                hm.put(currentWord,currentPoint);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println();

    }
}
