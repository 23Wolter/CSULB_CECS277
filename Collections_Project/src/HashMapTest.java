import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {

    public static void main(String[] args){

        Map<String, Integer> hm = new HashMap<>();

        File inputFile = new File("QWords_points.txt");
        try {
            Scanner in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println();

    }
}
