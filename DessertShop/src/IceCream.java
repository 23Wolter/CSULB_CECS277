/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class IceCream extends DessertItem {

    protected int cost;

    //Default constructor
    public IceCream(){
        cost = 500;
    }

    //Constructor takes a cost
    //Input: a cost
    public IceCream(int cost){
        this.cost = cost;
    }

    //getCost overwritten from DessertItem Class
    //Output: cost
    @Override
    public int getCost() {
        return cost;
    }
}
