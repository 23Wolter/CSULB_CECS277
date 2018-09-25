/**
 * Purpose: Test every class constructor and method
 * Inputs: The parameters for the multi-argument constrcutors
 * Output: String representations of each test result
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @date 09/25/2018
 * @version 1.0
*/


import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main (String[] args){

        System.out.println("********** TEST **********");
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        //Testing the Candy class
        System.out.println("*** CANDY CLASS TESTING ***");

        //Default constructor test
        System.out.println("** Default constructor testing **");
        Candy defaultCandy = new Candy();
        System.out.println(defaultCandy);
        System.out.println("");

        //Method testing for defaultCandy item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + defaultCandy.getName());
        System.out.println("Cost: " + defaultCandy.getCost());
        System.out.println("Price pr lbs: " + defaultCandy.getPricePrLbs());
        System.out.println("Weight: " + defaultCandy.getWeight());
        System.out.println("Calories: " + defaultCandy.getCalories());
        System.out.println("");

        //Multi-argument constructor test
        System.out.println("** Multi-argument constructor testing **");
        Candy candy = new Candy("Gummy bear", 3.54, 75, 200);
        System.out.println(candy);
        System.out.println("");

        //Method testing for candy item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + candy.getName());
        System.out.println("Cost: " + candy.getCost());
        System.out.println("Price pr lbs: " + candy.getPricePrLbs());
        System.out.println("Weight: " + candy.getWeight());
        System.out.println("Calories: " + candy.getCalories());

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");


        //Testing the Cookie class
        System.out.println("*** COOKIE CLASS TESTING ***");

        //Default constructor test
        System.out.println("** Default constructor testing **");
        Cookie defaultCookie = new Cookie();
        System.out.println(defaultCookie);
        System.out.println("");

        //Method testing for defaultCookie item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + defaultCookie.getName());
        System.out.println("Cost: " + defaultCookie.getCost());
        System.out.println("Price pr dz: " + defaultCookie.getPricePrDz());
        System.out.println("Number of cookies: " + defaultCookie.getNumber());
        System.out.println("Calories: " + defaultCookie.getCalories());
        System.out.println("");

        //Multi-argument constructor test
        System.out.println("** Multi-argument constructor testing **");
        Cookie cookie = new Cookie("Pumpkin Spice", 8, 322, 279);
        System.out.println(cookie);
        System.out.println("");

        //Method testing for cookie item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + cookie.getName());
        System.out.println("Cost: " + cookie.getCost());
        System.out.println("Price pr dz: " + cookie.getPricePrDz());
        System.out.println("Number of cookies: " + cookie.getNumber());
        System.out.println("Calories: " + cookie.getCalories());

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");


        //Testing the IceCream class
        System.out.println("*** ICECREAM CLASS TESTING ***");

        //Default constructor test
        System.out.println("** Default constructor testing **");
        IceCream defaultIcecream = new IceCream();
        System.out.println(defaultIcecream);
        System.out.println("");

        //Method testing for defaultIcecream item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + defaultIcecream.getName());
        System.out.println("Cost: " + defaultIcecream.getCost());
        System.out.println("Calories: " + defaultIcecream.getCalories());
        System.out.println("");

        //Multi-argument constructor test
        System.out.println("** Multi-argument constructor testing **");
        IceCream iceCream = new IceCream("Pistachio", 800, 512);
        System.out.println(iceCream);
        System.out.println("");

        //Method testing for iceCream item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + iceCream.getName());
        System.out.println("Cost: " + iceCream.getCost());
        System.out.println("Calories: " + iceCream.getCalories());

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");


        //Testing the Sundae class
        System.out.println("*** SUNDAE CLASS TESTING ***");

        //Default constructor test
        System.out.println("** Default constructor testing **");
        Sundae defaultSundae = new Sundae();
        System.out.println(defaultSundae);
        System.out.println("");

        //Method testing for defaultSundae item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + defaultSundae.getName());
        System.out.println("Topping Cost: " + defaultSundae.getToppingPrice());
        System.out.println("Sundae Cost: " + defaultSundae.getCost());
        System.out.println("Topping Calories: " + defaultSundae.getToppingCalories());
        System.out.println("Sundae Calories: " + defaultSundae.getCalories());
        System.out.println("");

        //Multi-argument constructor test
        System.out.println("** Multi-argument constructor testing **");
        Sundae sundae = new Sundae("Fudge", 100, 300, iceCream);
        System.out.println(sundae);
        System.out.println("");

        //Method testing for sundae item
        System.out.println("** Methods testing **");
        System.out.println("Name: " + sundae.getName());
        System.out.println("Topping Cost: " + sundae.getToppingPrice());
        System.out.println("Sundae Cost: " + sundae.getCost());
        System.out.println("Topping Calories: " + sundae.getToppingCalories());
        System.out.println("Sundae Calories: " + sundae.getCalories());

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        //Testing for polymorphism
        System.out.println("*** DEMONSTRATING POLYMORPHISM ***");
        ArrayList<DessertItem> dessertitems = new ArrayList<DessertItem>(); //Creates an arraylist of dessert items

        //adds items to dessert item list
        dessertitems.add(candy);
        dessertitems.add(cookie);
        dessertitems.add(iceCream);
        dessertitems.add(sundae);

        //prints out every item
        System.out.println("print out every item in the ArrayList of type DessertItem");
        for (DessertItem di : dessertitems){
            System.out.println("This item is: " + di.getName());
            System.out.println("The cost of this item is: " + di.getCost());
            System.out.println("The calories of this item is: " + di.getCalories());
            System.out.println("----------");
        }

        System.out.println("");

        //Testing the CheckOut Class
        System.out.println("*** TESTING CHECKOUT CLASS ***");
        System.out.println("");

        //testing new checkout item
        Checkout checkout = new Checkout();
        System.out.println("print out receipt from default constructor");
        System.out.println(checkout);
        System.out.println("");

        //methods testing for Checkout class
        System.out.println("** Methods testing **");
        System.out.println("");

        //testing the enterItem method
        checkout.enterItem(candy);
        checkout.enterItem(cookie);
        checkout.enterItem(iceCream);
        checkout.enterItem(sundae);

        //testing the setTaxRate method
        checkout.setTaxRate(0.08);

        //print out checkout with newly inserted data
        System.out.println("print checkout receipt with items inserted, and taxrate set");
        System.out.println("");
        System.out.println(checkout);

        System.out.println("");

        //testing numberOfItems method
        System.out.println("The number of items in the cashregister is: " + checkout.numberOfItems());

        //testing the clear method
        System.out.println("testing the clear() method");
        checkout.clear();
        System.out.println("The number of items in the cashregister is now: " + checkout.numberOfItems());

        //testing getTotalCost method
        System.out.println("The totalcost in the cashregister is: " + checkout.getTotalCost());
        System.out.println("One item is added");
        checkout.enterItem(candy);
        System.out.println("The total cost is now: " + checkout.getTotalCost());

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        //Testing the Dessertitem Class
        System.out.println("*** TESTING DESSERTITEM CLASS ***");
        System.out.println("");

        //testing getMax method
        //testing two different dessertItems
        System.out.println("testing getMax() method with two different dessertItems");
        System.out.println("expected: gummy bear, result: " + DessertItem.getMax(candy, cookie));
        System.out.println("expected: pistachio fudge, result: " + DessertItem.getMax(iceCream, sundae));

        System.out.println("");

        //testing the same cost but different calories
        System.out.println("testing same cost with different calories");
        IceCream iceCreamHighCalories = new IceCream("High calorie", 550, 620);
        IceCream iceCreamLowCalories = new IceCream("Low calorie", 550, 235);
        System.out.println("expected: high calorie, result: " + DessertItem.getMax(iceCreamHighCalories, iceCreamLowCalories));

        System.out.println("");

        //testing the exact same items
        System.out.println("testing the exact same dessertItems");
        System.out.println("expected: null (because this can't be compared), result: " + DessertItem.getMax(cookie, cookie));

        System.out.println("");

        //testing sorting an ArrayList of dessertItems
        System.out.println("testing sorting the dessertItems list");
        ArrayList<DessertItem> dessertList = new ArrayList<>();
        dessertList.add(candy);
        dessertList.add(cookie);
        dessertList.add(iceCream);
        dessertList.add(iceCreamLowCalories);
        dessertList.add(iceCreamHighCalories);
        dessertList.add(sundae);

        System.out.println("Unsorted list:");
        for (DessertItem item : dessertList) {
            System.out.println(item.getName() + ", " + item.getCost() + ", " + item.getCalories());
        }

        System.out.println("");
        //sorting the list based on the comparator from DessertItem's compareTo
        Collections.sort(dessertList, DessertItem::compareTo);

        System.out.println("Sorted list:");
        for (DessertItem item : dessertList) {
            System.out.println(item.getName() + ", " + item.getCost() + ", " + item.getCalories());
        }
    }

}
