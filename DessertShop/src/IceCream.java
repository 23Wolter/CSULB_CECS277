/*
    Josephine & Oliver
    September 12, 2018
    Purpose: an ice cream has just a cost, and can be a sundae if topping is added
    Inputs: the cost of the ice cream and the amount of calories
    Output: the cost of the ice cream and the calories
*/

/**
 * //this class represents an ice cream item
 * @author Josephine & Oliver
 * @date 09/22/18
 */
public class IceCream extends DessertItem {

    //the cost of an ice cream, the access modifier is protected because the Sundae class needs access to this variabel
    protected int cost;
    protected int calories; //the calories of an ice cream, is protected so Sundae can access it

    /**
     * default constructor, sets cost to 500 cents, and the calories to 470
     */
    public IceCream(){
        super.name = "strawberry";
        cost = 500;
        calories = 470;

    }

    /**
     * multi-argument constructor takes a cost in cents, and an amount of calories
     * @param cost - the cost of an ice cream in cents, and an amount of calories
     * @param calories - the calories of an ice cream
     */
    public IceCream(String name, int cost, int calories){
        super.name = name;
        this.cost = cost;
        this.calories = calories;
    }

    /**
     * getCost overwritten from DessertItem Class
     * @return the cost of the ice cream item, which is also a dessert item
     */
    @Override
    public int getCost() {
        return cost;
    }

    /**
     * @return the amount of calories of an ice cream
     */
    @Override
    public int getCalories() {
        return calories;
    }

    /**
     * @return a string with information about this class
     */
    @Override
    public String toString() {
        return "This is an icecream with the flavor: " + super.name + ". The price pr icecream is: " + cost + " cents. The calories of this item are: " + calories + ".";
    }
}
