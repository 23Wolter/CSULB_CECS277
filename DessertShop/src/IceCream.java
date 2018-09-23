/*
    Josephine & Oliver
    September 12, 2018
    Purpose: an ice cream has just a cost, and can be a sundae if topping is added
    Inputs: the cost of the ice cream and the amount of calories
    Output: the cost of the ice cream and the calories
*/

//this class represents an ice cream item
/**
 * //this class represents an ice cream item
 * @author Josephine & Oliver
 * @date 09/22/18
 */
public class IceCream extends DessertItem {

    //the cost of an ice cream, the access modifier is protected because the Sundae class needs access to this variabel
    protected int cost;
    protected double calories; //the calories of an ice cream, is protected so Sundae can access it

    //default constructor, sets cost to 500 cents, and the calories to 470
    /**
     * default constructor, sets cost to 500 cents, and the calories to 470
     */
    public IceCream(){
        cost = 500;
        calories = 470;
    }

    //constructor takes a cost in cents
    //input: a cost
    /**
     * multi-argument constructor takes a cost in cents, and an amount of calories
     * @param cost - the cost of an ice cream in cents, and an amount of calories
     * @param calories - the calories of an ice cream
     */
    public IceCream(int cost, double calories){
        this.cost = cost;
        this.calories = calories;
    }

    //getCost overwritten from DessertItem Class
    //output: cost
    /**
     * getCost overwritten from DessertItem Class
     * @return the cost of the ice cream item, which is also a dessert item
     */
    @Override
    public int getCost() {
        return cost;
    }

    //returns the calories of the ice cream class
    //output: calories
    /**
     * @return the amount of calories of an ice cream
     */
    public double getCalories() {
        return calories;
    }
}
