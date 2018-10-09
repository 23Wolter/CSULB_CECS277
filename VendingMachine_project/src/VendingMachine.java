/**
 * Josephine & Oliver
 * October 4, 2018
 * Purpose: This program simulates a vending machine
 * Inputs:
 * Output:
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0

 */
import java.util.*;
public class VendingMachine {

    private ArrayList<Product> products = new ArrayList<Product>(); //Vending machine has an array of products
    private ArrayList<Coin> coins = new ArrayList<Coin>(); //Vending machine takes an arraylist of coins

    /**
     * Default constructor
     */
    public VendingMachine(){
    }

    /**
     *
     * @param product - adds products to the products Arraylist
     */
    public void addProducts(Product product){

        products.add(product);
    }

    /**
     *
     * @return the products in the vending machine
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Adds coins to the vending machine
     * @param coin
     */
    public void addCoins(Coin coin){
        coins.add(coin);
    }

    /**
     *
     * @return how many coins in the vending machine
     */
    public int getCoins(){
        return coins.size();
    }

    /**
     *
     * @return the value for all the coins in the vending machine
     */
    public int sumOfCoins(){
        int value = 0;
        for (Coin c : coins){

            value += c.getValue();
        }

        return value;

    }

    public void selectProduct(Product product){

        System.out.println("Following products can be purchased: ");
        for(Product p : products){
            System.out.println(p.getName());
        }
        System.out.println("");
        System.out.println("Choose a product.");

        System.out.println("You have chosen: " + product.getName());
        System.out.println("The value of " + product.getName() +" is " + product.getValue());
        System.out.println("Insert coins:");


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
