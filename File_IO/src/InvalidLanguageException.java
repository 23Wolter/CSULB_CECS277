/**
 * Josephine and Oliver
 * October 23, 2018
 * Purpose: The purpose of this class is create a custom exception
 * Inputs: Message
 * Output: Message
 * @author Josephine Plass-Nielsen and Oliver Nielsen
 * @version 1.0
 */

public class InvalidLanguageException extends Exception {

    /**
     * Constructor
     * @param message - error message
     */
    public InvalidLanguageException(String message){
    super(message);
    }


}
