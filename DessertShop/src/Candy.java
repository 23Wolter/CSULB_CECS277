/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class Candy extends DessertItem {

    private String name;
    private double weight;
    private double pricePrLbs;

    public Candy() {
        name = "lollipop";
        weight = 0.20;
        pricePrLbs = 100;
    }

    public Candy(String name, double weight, int pricePrLbs){

        this.name = name;
        this.weight = weight;
        this.pricePrLbs = pricePrLbs;
    }

    @Override
    public int getCost() {

        int price = (int)(long)Math.round(pricePrLbs*weight);

        return price;
    }
}
