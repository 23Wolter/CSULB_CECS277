/**
 * Josephine & Oliver
 * October 23, 2018
 * Purpose: Interface for Earth cellphone
 * Inputs: LanguageType, fileName
 * Output: void
 * @author Mimi Opkins
 * @version 1.0
 */

public interface EarthCellPhone {
    /**
     * An earth cellphone can send messages
     * @param languageType - specifies which type of language the message should be translated to
     * @param fileName - takes a file to write from
     * @throws InvalidLanguageException - trows exception if given language type is invalid
     */
    public void sendMessage(String languageType, String fileName) throws InvalidLanguageException;

    /**
     * An earth cellphone can read messages
     * @param fileName - takes a file to read from
     */
    public void readMessage(String fileName);
}