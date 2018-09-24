/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

import java.util.ArrayList;

public class Checkout {

    private ArrayList<DessertItem> cashRegister;
    private double taxRate;

    public Checkout(){

        cashRegister = new ArrayList<DessertItem>();
    }

    public int numberOfItems(){
        return cashRegister.size();
    }

    public void enterItem(DessertItem item){
        cashRegister.add(item);
    }

    public void clear() {
        cashRegister.clear();
    }

    public int getTotalCost() {
        int totalCost = 0;
        for(DessertItem di : cashRegister) {
            totalCost += di.getCost();
        }
        return totalCost;
    }

    public int getTotalTax() {
        int totalCost = getTotalCost();
        int totalTax = (int) Math.round(totalCost * taxRate);
        return totalTax;
    }

    public double convertToDollars(double price){

        double dollars = price/100;
        return dollars;

    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

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
                str += " sundae \n topping @ " + sundae.getToppingPrice() + " cents  + \n icecream @ $" + convertToDollars(sundae.getIcecream().getCost()) + " " + "\t" ;
            } else if (dessertItem instanceof IceCream) {
                str += " icecream \n one @ \t \t \t \t \t";
            }

            str += "\t \t $" + convertToDollars(dessertItem.getCost()) + " \n \n";



        }

        str += "Number of items: " + cashRegister.size();

        str += "\n Total tax: " + getTotalTax();

        str += "\n Total cost: " + getTotalCost();

        return str;
    }

}
