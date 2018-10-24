/**
 * Josephine & Oliver
 * October 23, 2018
 * Purpose: Interface for Alien cellphone
 * Inputs: fileName
 * Output: void, String
 * @author Mimi Opkins
 * @version 1.0
 */

public interface AlienCellPhone {
    /**
     * An alien cellphone can send messages(Not implemented)
     * @param fileName - takes a file to write from
     */
    public void alienSendText(String fileName);

    /**
     * An alien cellphone can read messages
     * @param fileName - - takes a file to read from
     */
    public void alienReadText(String fileName);

    /**
     * An alien cellphone can translate messages
     * @param fileName - takes a file to translate
     * @return a String with the translated text
     */
    public String translateText(String fileName);
}