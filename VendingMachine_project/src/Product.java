/**
 * Josephine & Oliver
 * October 9, 2018
 * Purpose: This class simulates a product to be purchased from the vending machine
 * Inputs: Name of product, value of product
 * Output: Name of product, value of product
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0

 */
public class Product {

    private String name; //A product has a name
    private int value; //A product has a value

    /**
     * Default constructor
     */
    public Product(){
        name = "Latte";
        value = 15;
    }

    /**
     * Multi-argument constructor, takes 2 parameters
     *
     */
    public Product(String name, int value){
        this.name = name;
        this.value = value;
    }

    /**
     * Gets the name of the product
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name to the name of the product
     * @param name - takes a String name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of the product
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the product
     * @param value - sets the value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return a string with information about this class
     */
    @Override
    public String toString() {
        String str = "Product name is " + getName() + " with a value of " + getValue() + "DKK.";
        return str;
    }
}
