/**
 * Josephine & Oliver
 * October 9, 2018
 * Purpose:
 * Inputs:
 * Output:
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

public interface AlienCellPhone {
    public void alienSendText(String fileName);
    public void alienReadText(String fileName);
    //translateText returns the name of the output file
    //that has the translated message
    public String translateText(String fileName);
}