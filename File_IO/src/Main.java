/**
 * Josephine & Oliver
 * October 9, 2018
 * Purpose:
 * Inputs:
 * Output:
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

public class Main {
    public static void main(String[] args){

        Klingon klingon = new Klingon();
        klingon.alienSendText("empty.txt");
        klingon.alienReadText("test-message.txt");
        String klingonString = klingon.translateText("test-message.txt");
        System.out.println(klingonString);

        System.out.println("--------------------");

        Vulcan vulcan = new Vulcan();
        vulcan.alienSendText("empty.txt");
        vulcan.alienReadText("test-message.txt");
        String vulcanString = vulcan.translateText("test-message.txt");
        System.out.println(vulcanString);

        EarthToAlienAdapter ea = new EarthToAlienAdapter(new Klingon());
        try {

            ea.sendMessage("Klingon", "test-message.txt");
        } catch (LangNotSupportedException e) {
            System.out.println(e);
        }
    }
}
