import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vulcan implements AlienCellPhone {

    private final String[] wordEndings = {"!#$", "¤*?", "@£%"};

    @Override
    public void alienSendText(String fileName) {
        System.out.println("Vulcan sending message to file: " + fileName);
    }

    @Override
    public void alienReadText(String fileName) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
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
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                int rand = (int) Math.floor(Math.random() * 3);
                translatedText +=  wordEndings[rand] + inputFile.next() + " ";
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }

        return translatedText;
    }
}
