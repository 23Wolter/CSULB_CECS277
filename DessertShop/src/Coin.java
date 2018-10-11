/**
 * Josephine & Oliver
 * October 9, 2018
 * Purpose: This class simulates a coin
 * Inputs: coin value
 * Output: coin value, string
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */

public class Coin {

    private int value; //A coin represents a value

    /**
     * Default constructor
     */
    public Coin(){

        value = 5;
    }

    /**
     * @return the value of the coin
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value - takes a value to set it as the value of the coin
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return a string with information about this class
     */
    @Override
    public String toString() {
        String str = "This is a coin with the value of : " + getValue() + ".";
        return str;
    }
}