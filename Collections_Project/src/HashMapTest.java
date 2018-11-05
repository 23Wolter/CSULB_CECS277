import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {

    private static long time;

    public static void main(String[] args){

        //Creating HashMap
        Map<String, Integer> hm = new HashMap<>();

       //Initializes the chosen file
        File inputFile = new File("QWords.txt");

        //Reads from file
        try {
            Scanner in = new Scanner(inputFile);

            time = System.nanoTime();

            while(in.hasNext()){
                hm.put(in.nextLine(),0);
            }

            time = System.nanoTime() - time;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(hm);
        System.out.println(time);

    }
}
