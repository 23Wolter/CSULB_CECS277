/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class Candy extends DessertItem {

    private double weigth;
    private int pricePrLbs;

    public Candy() {
        weigth = 0.20;
        pricePrLbs = 100;
    }

    @Override
    public int getCost() {
        return 0;
    }
}
