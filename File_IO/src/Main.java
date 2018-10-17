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

        Trekkie t = new Trekkie();
        t.sendMessage("klingon", "something.txt");
        t.readMessage("something.txt");

        Vulcan v = new Vulcan();
        v.alienSendText("hlkfshj.txt");
        System.out.println(v.translateText("sgege.txt"));
        v.alienReadText("fjeppjr.txt");


        Klingon k = new Klingon();
        k.alienSendText("sgre.txt");
        k.alienReadText("test-message.txt");
        String str = k.translateText("test-message.txt");
        System.out.println(str);

        EarthToAlienAdapter ea = new EarthToAlienAdapter(new Klingon());
    }
}
