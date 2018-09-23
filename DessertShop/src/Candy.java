/*
    Josephine & Oliver
    September 12, 2018
    Purpose: a Candy item has a weight and a price based on the weight
    Inputs: Candy name, weight, price pr. lbs.
    Output: Cost, price pr. lbs., weight, names
*/

//This class represents a candy item
/**
 * This class represents a candy item
 * @author Josephine & Oliver
 * @date 09/22/18
 */
public class Candy extends DessertItem {

    private double weight; //the weight of the candy
    private double pricePrLbs; //the price pr. lbs. for candy
    private double calories; //the calories of the candy

    //default constructor
    /**
     * default constructor, sets the name, weight, calories and price pr. lbs. for the candy item
     */
    public Candy() {
        super.name = "lollipop";
        weight = 0.20;
        pricePrLbs = 100;
        calories = 350;
    }

    //multi-argument constructor, takes 4 parameter: name, weight, price pr. lbs., and calories
    /**
     * multi-argument constructor, takes 4 parameter
     * @param name - the name of the candy item
     * @param weight - the weight of the portion of candy
     * @param pricePrLbs - the price pr. lbs. for the amount of candy
     * @param calories - the calories for the portion of candy
     */
    public Candy(String name, double weight, int pricePrLbs, double calories){

        super.name = name;
        this.weight = weight;
        this.pricePrLbs = pricePrLbs;
        this.calories = calories;
    }

    //calculates the price of candy based on the weight and price pr. lbs.
    /**
     * calculates the price of candy based on the weight and price pr. lbs.
     * uses Math class to round to the nearest cent
     * Math.round returns a long, which is being cast to an int, so it can be used as the price of the candy
     * @return price in cents
     */
    @Override
    public int getCost() {

        int price = (int)(long)Math.round(pricePrLbs*weight);
        return price;
    }

    //returns the price pr. lbs. for the candy as a double
    /**
     * @return the price pr. lbs. for a candy as a double
     */
    public double getPricePrLbs() {
        return pricePrLbs;
    }

    //returns the weight of a candy as a double
    /**
     * @return the weight of a candy as a double
     */
    public double getWeight() {
        return weight;
    }

    //returns the calories of the candy
    /**
     * @return the calories of the candy
     */
    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "This is a " + super.name + " with a weight of: " + weight + " lbs. The price pr lbs is: " + pricePrLbs + " cents which makes the total price of this item " + getCost() + " cents. The calories of this item are: " + calories + ".";
    }
}
