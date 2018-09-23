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

    //Default sundae constructor, setting the name, cost of the icecream and cost of the toppings
    /**
     * Default sundae constructor, setting the name, cost of the icecream and cost of the toppings
     */
    public Sundae(){
        IceCream icecream = new IceCream();
        super.name = "Sundae Icecream";
        toppingPrice = 100;
        toppingCalories = 125;
        sundaeCalories = getTotalCalories();
    }

    //Multi-argument constructor sets an ice cream, the name, and toppingprice
    /**
     * Multi-argument constructor sets an ice cream, the name, and toppingprice
     * @param icecream - When toppings are added to an ice cream it becomes a Sundae, so an ice cream is needed
     * @param toppingPrice - The price of the topping
     * @param name - the name of the sundae
     */
    public Sundae(IceCream icecream, int toppingPrice, String name){
        this.icecream = icecream;
        super.name = name;
        this.toppingPrice = toppingPrice;
        sundaeCalories = getTotalCalories();
    }

    public int getTotalCalories(){
        int totalCal = icecream.getCalories() + toppingCalories;
        return totalCal;
    }

    //calculates the price of the sundae
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

    //returns the price for the topping
    /**
     * @return the price for the topping
     */
    public int getToppingPrice() {
        return toppingPrice;
    }

    //returns the calories of the toppings
    /**
     * @return the calories of the toppings
     */
    public int getToppingCalories() {
        return  toppingCalories;
    }

    //returns the calories of the sundae, which includes the calories of the ice cream added with the toppings
    /**
     * @return the calories of the sundae, which includes the calories of the ice cream added with the toppings
     */
    public int getSundaeCalories() {
        return  sundaeCalories;
    }

    //returns a string with information about this class
    /**
     *
     * @return a string with information about this class
     */
    @Override
    public String toString() {
        return "This is a " + name + ". The price for the topping is " + toppingPrice + " cents. The total price is " + getCost() + " cents. The calories of the topping are " + toppingCalories + ". The total calories are " + sundaeCalories;
    }
}
