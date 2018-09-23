/*
    Josephine & Oliver
    September 12, 2018
    Purpose: a dessert item is a description of what all the dessert items has in common
    Inputs: the name of the dessert item
    Output: the name of the dessert item, and the cost
*/

//the dessert item class represents the description of a dessert item
/**
 * the dessert item class represents the description of a dessert item
 * @author Mimi Opkins
 */
public abstract class DessertItem {

    protected String name; //the name of the dessert item

    //Null constructor for DessertItem class
    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }

    //Initializes DessertItem data
    /**
     * Initializes DessertItem data
     * @param name - the name of the dessert item
     */
    public DessertItem(String name) {
        this.name = name;
    }

    //@return name of DessertItem
    /**
     * @return name of the dessert item
     */
    public final String getName() {
        return name;
    }

    //@return cost of DessertItem
    /**
     * @return the cost of the dessert item
     */
    public abstract int getCost();

}






