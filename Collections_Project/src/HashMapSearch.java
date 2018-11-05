import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapSearch {

    private static long time;

    public static void main(String[] args){

        //Creating HashMap
        Map<String, Integer> hm = new HashMap<>();

        // *** Load the alphabet with points ***
        //Initializes the chosen file
        File inputFile = new File("ScrabblePointValue.txt");
        //Reads from file
        try {
            Scanner in = new Scanner(inputFile);
            while(in.hasNext()){
                String[] line = in.nextLine().split(" ");
                String letter = line[0];
                int point = Integer.parseInt(line[1]);
                hm.put(letter,point);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(hm);


        // *** Search for the word points ***
        //Initializes the chosen file
        File qwords = new File("Qwords.txt");
        //Reads from file
        int totalWordPoint = 0;
        try {
            Scanner in = new Scanner(qwords);
            while(in.hasNext()){
                String word = in.nextLine();
                for(char c : word.toCharArray()) {
                    int point = hm.get(c);
                    totalWordPoint += point;
                }
                String letter = line[0];
                int point = Integer.parseInt(line[1]);
                hm.put(letter,point);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(hm);

    }
}
