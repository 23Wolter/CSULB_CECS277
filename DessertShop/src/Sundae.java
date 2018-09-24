/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

/**
 * This class represents an icecream with toppings(a sundae). It has a name, cost and a total price with toppings included
 * @author Josephine & Oliver
 * @date 09/22/18
 */
public class Sundae extends IceCream {

    private IceCream icecream;
    //price of topping
    private int toppingPrice;
    private int toppingCalories;
    private int sundaeCalories;

    /**
     * Default sundae constructor, setting the name, cost of the icecream and cost of the toppings
     */
    public Sundae(){
        IceCream icecream = new IceCream();
        this.icecream = icecream;
        super.name = "Sundae Icecream";
        toppingPrice = 100;
        toppingCalories = 125;
        sundaeCalories = getCalories();
    }

    /**
     * Multi-argument constructor sets an ice cream, the name, and toppingprice
     * @param icecream - When toppings are added to an ice cream it becomes a Sundae, so an ice cream is needed
     * @param toppingPrice - The price of the topping
     * @param name - the name of the sundae
     */
    public Sundae(String name, int toppingPrice, int toppingCalories, IceCream icecream){
        this.icecream = icecream;
        super.name = name;
        this.toppingPrice = toppingPrice;
        this.toppingCalories = toppingCalories;
        sundaeCalories = getCalories();
    }

    /**
     * calculates the price of the sundae
     * --> adds the price of the icecream with the price of the topping
     * @return the price of the sundae
     */
    @Override
    public int getCost() {
        int costOfIcecream = icecream.getCost();
        return costOfIcecream + toppingPrice;
    }

    /**
     * @return the price for the topping
     */
    public int getToppingPrice() {
        return toppingPrice;
    }

    /**
     * @return the calories of the toppings
     */
    public int getToppingCalories() {
        return  toppingCalories;
    }

    /**
     * @return the calories of the sundae, which includes the calories of the ice cream added with the toppings
     */
    @Override
    public int getCalories() {
        int totalCal = icecream.getCalories() + toppingCalories;
        return totalCal;
    }

    /**
     *
     * @return a string with information about this class
     */
    @Override
    public String toString() {
        return "This is a " + name + ". The price for the topping is " + toppingPrice + " cents. The total price is " + getCost() + " cents. The calories of the topping are " + toppingCalories + ". The total calories are " + sundaeCalories;
    }
}
