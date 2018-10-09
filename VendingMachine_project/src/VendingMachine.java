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

    private ArrayList<ArrayList<Product>> products = new ArrayList<ArrayList<Product>>(); //Vending machine has an array of products
    private ArrayList<Coin> coins = new ArrayList<Coin>(); //Vending machine takes an arraylist of coins
    private ArrayList<Coin> coinRepository = new ArrayList<Coin>(); //Holds the coins of the current buyer, before storing permanently

    /**
     * Default constructor
     */
    public VendingMachine(){
    }

    /**
     *
     * @param product - adds products to the products Arraylist
     */
    public void addProducts(int index, Product product){

        products.get(index).add(product);
    }

    /**
     *
     * @return the products in the vending machine
     */
    public ArrayList<Product> getProducts() {
        ArrayList<Product> allProducts = new ArrayList<>();
        for(int i=0; i<products.size(); i++) {
            for(Product p : products.get(i)) {
                allProducts.add(p);
            }
        }
        return allProducts;
    }
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

    /*public void selectProduct(Product product){

        System.out.println("Following products can be purchased: ");
        for(Product p : products){
            System.out.println(p.getName());
        }
        System.out.println("");
        System.out.println("Choose a product.");

        System.out.println("You have chosen: " + product.getName());
        System.out.println("The value of " + product.getName() +" is " + product.getValue());
        System.out.println("Insert coins:");

    }*/

    //adds a coin to the temporary repository
    public void addCoinToRepo(Coin c) {
        coinRepository.add(c);
    }


    //returns the sum of the coins in the repository
    public int sumOfRepo() {
        int value = 0;
        for (Coin c : coinRepository){

            value += c.getValue();
        }
        return value;
    }

    public void clearRepository() {
        coinRepository.clear();
    }

    //transfers the coins from the temporary repository to the main coin storage
    public void transferCoin() {
        for(Coin c : coinRepository) {
            coins.add(c);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
