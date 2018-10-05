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
     * Adds coins to the vending machine
     * @param coin
     */
     public void AddCoins(Coin coin){
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

    public void purchaseProduct(Product product){


    }

     @Override
     public String toString() {
          return super.toString();
     }
}
