/**
 * Josephine & Oliver
 * October 9, 2018
 * Purpose:
 * Inputs:
 * Output:
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

public interface EarthCellPhone {
    public void sendMessage(String languageType, String fileName) throws LangNotSupportedException;
    public void readMessage(String fileName);
}