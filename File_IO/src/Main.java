/**
 * Josephine & Oliver
 * October 23, 2018
 * Purpose: The purpose of this class is to simulate a user interface/testing
 * Inputs: languageType, fileName
 * Output: files
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

public class Main {
    public static void main(String[] args){

        System.out.println("***TESTING METHODS***");
        System.out.println("");

        System.out.println("**Testing Trekkie class**");
        Trekkie trekkie = new Trekkie();
        System.out.println(trekkie);
        System.out.println("");
        System.out.println("Testing Trekkie sending Earth message from file earth-message.txt");
        trekkie.sendMessage("Earth", "earth-message.txt");
        System.out.println("");
        System.out.println("");
        System.out.println("Testing Trekkie reading message from file earth-message.txt");
        trekkie.readMessage("earth-message.txt");
        System.out.println("");
        System.out.println("");

        System.out.println("**Testing Klingon class**");
        Klingon klingon = new Klingon();
        System.out.println(klingon);
        System.out.println("");
        System.out.println("Testing alienSendText(Not implemented)");
        klingon.alienSendText("empty.txt");
        System.out.println("");
        System.out.println("Testing alienReadText from file: test-message.txt");
        klingon.alienReadText("test-message.txt");
        System.out.println("");
        System.out.println("");
        System.out.println("Testing translateText from file: test-message.txt");
        String klingonString = klingon.translateText("test-message.txt");
        System.out.println(klingonString);
        System.out.println("");

        System.out.println("**Testing Vulcan class**");
        Vulcan vulcan = new Vulcan();
        System.out.println(vulcan);
        System.out.println("");
        System.out.println("Testing alienSendText(Not implemented)");
        vulcan.alienSendText("empty.txt");
        System.out.println("");
        System.out.println("Testing alienReadText from file: test-message.txt");
        vulcan.alienReadText("test-message.txt");
        System.out.println("");
        System.out.println("");
        System.out.println("Testing translateText from file: test-message.txt");
        String vulcanString = vulcan.translateText("test-message.txt");
        System.out.println(vulcanString);
        System.out.println("--------------------");

        System.out.println("");
        System.out.println("***TESTING ADAPTER PATTERN***");
        System.out.println("Testing EarthToAlienAdapter");
        EarthToAlienAdapter test = new EarthToAlienAdapter(new Klingon());
        System.out.println(test);
        System.out.println("");
        System.out.println("Testing English to Klingon");
        EarthToAlienAdapter ea1 = new EarthToAlienAdapter(new Klingon());
        try{
            ea1.sendMessage("Klingon", "english-klingon.txt");
        } catch (InvalidLanguageException e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Testing English to Vulcan");
        EarthToAlienAdapter ea2 = new EarthToAlienAdapter(new Vulcan());
        try{
            ea2.sendMessage("Vulcan", "english-vulcan.txt");
        } catch (InvalidLanguageException e) {
            System.out.println(e);
        }
        System.out.println();



        System.out.println("Testing Invalid language: Wookie");
        EarthToAlienAdapter ea3 = new EarthToAlienAdapter(new Klingon());
        try {
            ea3.sendMessage("Wookie", "test-message.txt");
        } catch (InvalidLanguageException e) {
            System.out.println(e);
        }
    }
}
