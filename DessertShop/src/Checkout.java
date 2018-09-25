/**
 * Josephine & Oliver
 * September 25, 2018
 * Purpose: To represent a checkout register that can manage multiple dessert items
 * Inputs: Dessert items, price and taxrate
 * Output: A list of dessert items, a total cost, tax rate
 */

import java.util.ArrayList;

public class Checkout {

    //Represents a cash register and a tax rate
    private ArrayList<DessertItem> cashRegister;
    private double taxRate;

    /**
     * Default constructor creating new arrayList
     */
    public Checkout(){

        cashRegister = new ArrayList<DessertItem>();
    }

    /**
     *
     * @return how many items in the cash register
     */
    public int numberOfItems(){
        return cashRegister.size();
    }

    /**
     *
     * @param item - adds items to the cash register
     */
    public void enterItem(DessertItem item){
        cashRegister.add(item);
    }

    /**
     * clears the register
     */
    public void clear() {
        cashRegister.clear();
    }

    /**
     * Adds cost of all dessertitems
     * @return total cost without taxes
     */
    public int getTotalCost() {
        int totalCost = 0;
        for(DessertItem di : cashRegister) {
            totalCost += di.getCost();
        }
        return totalCost;
    }

    /**
     * Multiplies total cost with tax rate
     * @return total tax based on total cost
     */
    public int getTotalTax() {
        int totalCost = getTotalCost();
        int totalTax = (int) Math.round(totalCost * taxRate);
        return totalTax;
    }

    /**
     * Converts the cost of an item to dollars
     * @param price - a price in cents
     * @return a price in dollars and cents
     */
    public double convertToDollars(double price){

        double dollars = price/100;
        return dollars;

    }

    /**
     *
     * @return taxRate as a double
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the taxRate
     * @param taxRate - takes a taxRate as a double
     */

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     *  Prints a receipt with the total number of items added to the cashregister, the cost of every single item, the taxes and the cost with taxes
     * @return a String representing a receipt
     */
    public String toString() {
        String str = "\t O & J's Sweets \n \t -------------------- \n";

        for (DessertItem dessertItem : cashRegister) {
            str += "" + dessertItem.getName();

            if(dessertItem instanceof Candy) {
                Candy candy = (Candy) dessertItem;
                str += " candy \n" + candy.getWeight() + " lbs @ " + candy.getPricePrLbs() + " cents/lbs";
            } else if(dessertItem instanceof Cookie) {
                Cookie cookie = (Cookie) dessertItem;
                str += " cookie \n" + cookie.getNumber() + " cookies @ " + cookie.getPricePrDz() + " cents/dz";
            } else if (dessertItem instanceof Sundae) {
                Sundae sundae = (Sundae) dessertItem;
                str += " sundae \n topping @ " + sundae.getToppingPrice() + " cents  + \n icecream @ $" + convertToDollars(sundae.getIcecream().getCost()) + " " + "\t \t" ;
            } else if (dessertItem instanceof IceCream) {
                str += " icecream \n one @ \t \t \t \t \t";
            }

            str += "\t \t $" + convertToDollars(dessertItem.getCost()) + " \n \n";



        }

        str += "Number of items: \t \t \t \t \t" + cashRegister.size();

        str += "\n Total tax: \t \t \t \t \t $" + convertToDollars(getTotalTax());

        str += "\n Total cost: \t \t \t \t \t $" + convertToDollars(getTotalCost()+getTotalTax());

        return str;
    }

}
