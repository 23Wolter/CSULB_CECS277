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

    public int totalCost() {
        int totalCost = 0;
        for(DessertItem di : cashRegister) {
            totalCost += di.getCost();
        }
        return totalCost;
    }

    public int totalTax() {
        int totalCost = totalCost();
        int totalTax = (int) Math.round(totalCost * taxRate);
        return totalTax;
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
            str += "" + dessertItem.getName() + "\n";

            if(dessertItem instanceof Candy) {
                Candy candy = (Candy) dessertItem;
                str += "" + candy.getWeight() + " lbs @ " + candy.getPricePrLbs() + " cents/lbs";
            } else if(dessertItem instanceof Cookie) {
                Cookie cookie = (Cookie) dessertItem;
                str += "" + cookie.getNumber() + " cookies @ " + cookie.getPricePrDz() + " cents/dz";
            } else if (dessertItem instanceof Sundae) {
                Sundae sundae = (Sundae) dessertItem;
                str += "topping price " + sundae.getToppingPrice() + " cents\t \t";
            } else if (dessertItem instanceof IceCream) {
                str += "\t \t";
            }

            str += "\t \t" + dessertItem.getCost() + "\n";

        }

        return str;
    }

}
