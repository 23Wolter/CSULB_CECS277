/*
    Josephine & Oliver
    September 12, 2018
    Purpose: a cookie item has a number, a price, and a price pr. dozen
    Inputs:
    Output:
*/

//this class represents a cookie with a number, price, and price pr. dozen
/**
 * this class represents a cookie with a number, price, and price pr. dozen
 * @author Josephine & Oliver
 * @date 09/22/18
 */
public class Cookie extends DessertItem {

    private int number; //the number of cookies in a portion
    private double pricePrDz; //the price pr. dozen cookies
    private double calories; //the calories in the number of cookies

    //default constructor, setting the number of cookies, the calories, and the price pr. dz.
    /**
     * default constructor, setting the number of cookies, the calories, and the price pr. dz.
     */
    public Cookie() {
        super.name = "Chocolate Chip";
        number = 5;
        pricePrDz = 279;
        calories = 355;
    }

    //multi-argument constructor sets the name, number, price pr. dz., and calories of the cookie item
    /**
     * multi-argument constructor sets the name, number, price pr. dz., and calories of the cookie item
     * @param name - the name of the cookie
     * @param number - the number of cookies in a portion
     * @param pricePrDz - the price per dozen cookies
     * @param calories - the calories in this number of cookies
     */
    public Cookie(String name, int number, double pricePrDz, double calories) {
        super.name = name;
        this.number = number;
        this.pricePrDz = pricePrDz;
        this.calories = calories;
    }

    //returns the number of cookies in this portion
    /**
     * @return the number of cookies in this portion
     */
    public int getNumber() {
        return number;
    }

    //returns the price per dozen cookies
    /**
     * @return the price per dozen cookies
     */
    public double getPricePrDz() {
        return pricePrDz;
    }

    //returns the calories of a portion of cookies
    /**
     * @return the calories of a portion of cookies
     */
    public double getCalories() {
        return calories;
    }

    @Override
    public int getCost() {

        return 0;
    }
}
