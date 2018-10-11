/**
 * Josephine and Oliver
 * September 25, 2018
 * Purpose: a dessert item is a description of what all the dessert items has in common
 * Inputs: the name of the dessert item
 * Output: the name of the dessert item, the cost, and a comparison of the larger object
 * @author Mimi Opkins, Josephine Plass-Nielsen and Oliver Nielsen
 * @version 1.0

*/
package DessertShop;

public abstract class DessertItem implements Comparable {

    protected String name; //the name of the dessert item

    /**
     *
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }

    /**
     * Multi-argument constructor
     * Initializes DessertItem data
     * @param name - the name of the dessert item
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * @return name of the dessert item
     */
    public final String getName() {
        return name;
    }

    /**
     * @return the cost of the dessert item
     */
    public abstract int getCost();

    /**
     * Compares two desseritems and returns the larger (most expensive)
     * @param item1 - A Dessertitem to be compared
     * @param item2 - Another Dessertitem to be compared
     * @return returns a Dessertitem object
     */
    public static DessertItem getMax(DessertItem item1, DessertItem item2){

        int compare = item1.compareTo(item2); //Uses method compareTo from the comperable interface
        if(compare == -1){
            return item2;
        } else if(compare == 1){
            return item1;
        } else
            return null; // If the two objects given are exactly the same, then it returns null
    }

    /**
     *
     * @return the calories of the dessert item
     */
    public abstract int getCalories();

    /**
     * Compares cost of an item, and if they are the same, then it compares calories
     * @param o - takes an object to compare
     * @return - 1, -1 or 0
     */
    @Override
    public int compareTo(Object o) {
        DessertItem dessertitem = (DessertItem) o;
        int oCost = dessertitem.getCost();

        int dsCost = getCost();

        if (dsCost < oCost){
            return -1;
        } else if(dsCost > oCost) {
            return  1;
        } else if(dsCost == oCost && dessertitem.getCalories() > getCalories()){
            return -1;
        } else if (dsCost == oCost && dessertitem.getCalories() < getCalories()){
            return 1;
        } else
        return 0;
    }
}






