/**
 * Josephine & Oliver
 * October 4, 2018
 * Purpose: This class simulates a product in the vending machine
 * Inputs:
 * Output:
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0

 */
public class Product {

    private String name; //A product has a name
    private int value; //A product has a value

    /**
     * Default constructor
     */
    public Product(){}

    /**
     * Default constructor
     */
    public Product(String name, int value){
        this.name = name;
        this.value = value;
    }

    /**
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name - takes a name and set this name to the name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the value of the product
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @param value - sets the value of the product
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     *
     * @return a string with information about this class
     */
    @Override
    public String toString() {
        String str = "This is the following product: " + getName() + " and a value of: " + getValue();
        return str;
    }
}
