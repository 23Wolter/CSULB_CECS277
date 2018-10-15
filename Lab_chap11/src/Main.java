import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if(args.length == 2) {
            File inputFile = new File(args[0]);

            try {
                Scanner in = new Scanner(inputFile);
                PrintWriter out = new PrintWriter(args[1]);

                while (in.hasNext()) {
                    String str = in.nextLine();
                    out.println(str);
                }

                in.close();
                out.close();

            } catch (FileNotFoundException e) {
                System.out.println("Input file does not exist!");
            }

        } else {
            System.out.println("Invalid number of arguments!");

        }
    }
}
