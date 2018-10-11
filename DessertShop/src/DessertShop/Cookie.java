/**
 * Josephine and Oliver
 * September 22, 2018
 * Purpose: a cookie item has a number, a price, and a price pr. dozen
 * Input: name, number of cookies, a price pr. dz and calories
 * Output: number of cookies, a price and calories
 * @author Josephine and Oliver
 * date 09/22/18
 * @version 1.0
 */
package DessertShop;

public class Cookie extends DessertItem {

    private int number; //the number of cookies in a portion
    private double pricePrDz; //the price pr. dozen cookies
    private int calories; //the calories in the number of cookies

    /**
     * default constructor, setting the number of cookies, the calories, and the price pr. dz.
     */
    public Cookie() {
        super.name = "Chocolate Chip";
        number = 5;
        pricePrDz = 279;
        calories = 355;
    }

    /**
     * multi-argument constructor sets the name, number, price pr. dz., and calories of the cookie item
     * @param name - the name of the cookie
     * @param number - the number of cookies in a portion
     * @param pricePrDz - the price per dozen cookies
     * @param calories - the calories in this number of cookies
     */
    public Cookie(String name, int number, double pricePrDz, int calories) {
        super.name = name;
        this.number = number;
        this.pricePrDz = pricePrDz;
        this.calories = calories;
    }

    /**
     * @return the number of cookies in this portion
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return the price per dozen cookies
     */
    public double getPricePrDz() {
        return pricePrDz;
    }

    /**
     * @return the calories of a portion of cookies
     */
    @Override
    public int getCalories() {
        return calories;
    }

    /**
     * calculates the price of the number of cookies
     * -- divides the price pr. dz. by 12 to get the price pr. single cookie
     * -- then multiplies with how many cookies are in the portion
     * -- the number is rounded to the nearest number (cent)
     * -- the number is a double, which is cast to an int, so it can be set as the price
     * @return the price of the number of cookies in the portion
     */
    @Override
    public int getCost() {
        int price = (int) Math.round(pricePrDz/12 * number);
        return price;
    }

    /**
     * @return a string with information about this class
     */
    @Override
    public String toString() {
        return "This is a " + name + " cookie. There are " + number + " cookies in this portion. The price pr. dozen is " + pricePrDz + " cents. So the total price is " + getCost() + " cents. The calories are " + calories;
    }
}
