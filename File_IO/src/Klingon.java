/**
 * Created by josep on 10-10-2018.
 */
public class Klingon implements AlienCellPhone {
    @Override
    public void alienSendText(String fileName) {
        System.out.println("klingon sending message to file: " + fileName);
    }

    @Override
    public void alienReadText(String fileName) {
        System.out.println("klingon reading from file: " + fileName);
    }

    @Override
    public String translateText(String fileName) {

        //compare the input file with a Klingon dictionary

        return "klingon translating message from file: " + fileName;
    }
}
