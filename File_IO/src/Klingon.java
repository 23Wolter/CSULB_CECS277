import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by josep on 10-10-2018.
 */
public class Klingon implements AlienCellPhone {

    private final String[] wordEndings = {"borg", "zip", "harp"};

    @Override
    public void alienSendText(String fileName) {
        System.out.println("klingon sending message to file: " + fileName);
    }

    @Override
    public void alienReadText(String fileName) {
        try {
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                System.out.println(inputFile.next() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        }
    }

    @Override
    public String translateText(String fileName) {

        String translatedText = "";

        try {
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                translatedText += inputFile.next() + wordEndings[(int) Math.random() * 3];
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }

        return translatedText;
    }
}
