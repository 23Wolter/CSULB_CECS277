/**
 * Josephine & Oliver
 * October 9, 2018
 * Purpose: This program simulates a vending machine
 * Inputs: numberOfProducts, index, product, coin
 * Output: A list of products, a specific product, number of coins, value of coins, value of coins in repo
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @version 1.0
 */
import java.util.*;
public class VendingMachine {

    private ArrayList<ArrayList<Product>> products = new ArrayList<ArrayList<Product>>(); //Vending machine has an array of products
    private ArrayList<Coin> coins = new ArrayList<Coin>(); //Vending machine takes an arraylist of coins
    private ArrayList<Coin> coinRepository = new ArrayList<Coin>(); //Holds the coins of the current buyer, before storing permanently

    /**
     * Default constructor
     * Three ArrayLists are added to the ArrayList products - So the vending machine has three different products as a standard
     */
    public  VendingMachine() {
        products.add(new ArrayList<>());
        products.add(new ArrayList<>());
        products.add(new ArrayList<>());
    }

    /**
     * Multi-argument constructor
     * @param numberOfProducts - sets the amount of how many different products that the vending machine contains
     */
    public VendingMachine(int numberOfProducts){
        for(int i=0; i<numberOfProducts; i++) {
            products.add(new ArrayList<Product>());
        }
    }

    /**
     * Adds products to the different ArrayLists dependent on the type of the product
     * @param index - sets the place for which ArrayList(category) the product should be placed in
     * @param product - Takes a product to add
     */
    public void addProducts(int index, Product product){
        if(index < products.size()) {
            products.get(index).add(product);
        } else {
            System.out.println("This index does not exist");
        }
    }

    /**
     * Removes the first product in the ArrayList
     * @param index - takes an index to remove the first
     */
    public void removeProduct(int index) {
        products.get(index).remove(0);
    }

    /**
     * Prints the products of the ArrayList
     * @return the products in the vending machine
     */
    public ArrayList<Product> getProducts() {
        ArrayList<Product> allProducts = new ArrayList<>(); //A new ArrayList is created to list all items from the given ArrayList
        for(int i=0; i<products.size(); i++) {
            for(Product p : products.get(i)) {
                allProducts.add(p);
            }
        }
        return allProducts;
    }

    /**
     * Returns the first product of a given ArrayList in the products ArrayList
     * @param index - Indicates which kind of product to get
     * @return the product of the given index
     */
    public Product getFirstProduct(int index) {
        return products.get(index).get(0);
    }

    /**
     * Adds coins to the vending machine
     * @param coin
     */
    public void addCoins(Coin coin){
        coins.add(coin);
    }

    /**
     * Gets the size of the coins ArrayList
     * @return how many coins in the vending machine
     */
    public int getCoins(){
        return coins.size();
    }

    /**
     * Calculates the value of all coins
     * @return the value for all the coins in the vending machine
     */
    public int sumOfCoins(){
        int value = 0;
        for (Coin c : coins){

            value += c.getValue(); //Gets value from each coin and add them together
        }
        return value;

    }

    /**
     * adds a coin to the temporary repository in case that the coins has to be returned to the costumer
     * @param - takes a coin
     */
    public void addCoinToRepo(Coin c) {
        coinRepository.add(c);
    }

    /**
     * Calculates the sum of the coins in the repository
     * @return the sum of the coins
     */
    public int sumOfRepo() {
        int value = 0;
        for (Coin c : coinRepository){

            value += c.getValue();
        }
        return value;
    }

    /**
     * Clears the repository when a purchase is successful or not
     */
    public void clearRepository() {
        coinRepository.clear();
    }

    /**
     * transfers the coins from the temporary repository to the vending machine
     */
    public void transferCoin() {
        for(Coin c : coinRepository) {
            coins.add(c); //Adds coins from the purchase to the coins ArrayList
        }
    }

    /**
     * Empties coins from vending machine
     */
    public void clearCoins() {
        coins.clear();
    }

    /**
     *
     * @return a String with information about this class
     */
    @Override
    public String toString() {
        return "This is a vending machine... bibopbiip";
    }
}
