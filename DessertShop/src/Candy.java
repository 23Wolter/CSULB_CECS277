/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class Candy extends DessertItem {

    private double weight;
    private double pricePrLbs;

    public Candy() {
        super.name = "lollipop";
        weight = 0.20;
        pricePrLbs = 100;
    }

    public Candy(String name, double weight, int pricePrLbs){

        super.name = name;
        this.weight = weight;
        this.pricePrLbs = pricePrLbs;
    }

    @Override
    public int getCost() {

        int price = (int)(long)Math.round(pricePrLbs*weight);

        return price;
    }

    public double getPricePrLbs() {
        return pricePrLbs;
    }

    public double getWeight() {
        return weight;
    }
}
