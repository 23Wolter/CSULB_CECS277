/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public abstract class DessertItem {

    protected String name;

    //Null constructor for DessertItem class
    public DessertItem() {
        this("");
    }

    //Initializes DessertItem data
    public DessertItem(String name) {
        this.name = name;
    }


    //@return name of DessertItem
    public final String getName() {
        return name;
    }

    //@return cost of DessertItem
    public abstract int getCost();

}






