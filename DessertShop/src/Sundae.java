/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class Sundae extends IceCream {

    private int toppingPrice;

    public Sundae(){

        super.name = "Sundae Icecream";
        super.cost = 400;
        toppingPrice = 100;
    }

    public Sundae(int toppingPrice, String name, int cost){

        super.name = name;
        super.cost = cost;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public int getCost() {
       int costOfIcecream = super.getCost();
        return costOfIcecream + toppingPrice;
    }
}
