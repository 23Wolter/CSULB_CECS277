import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {

    private static long time;

    public static void main(String[] args){

        //Creating HashMap
        Map<String, Integer> tm = new TreeMap<>();

        //Initializes the chosen file
        File inputFile = new File("QWords.txt");

        //Reads from file
        try {
            Scanner in = new Scanner(inputFile);

            time = System.nanoTime();

            while(in.hasNext()){
                tm.put(in.nextLine(),0);
            }

            time = System.nanoTime() - time;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(tm);
        System.out.println(time);

    }
}
