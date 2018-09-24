/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/


import java.util.ArrayList;

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
        Candy candy = new Candy("Gummy bears", 3.54, 75, 200);
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

        //Creates an arraylist of dessert items
        System.out.println("DEMONSTRATING POLYMORPHISM");
        ArrayList<DessertItem> dessertitems = new ArrayList<DessertItem>();

        dessertitems.add(candy);
        dessertitems.add(cookie);
        dessertitems.add(iceCream);
        dessertitems.add(sundae);

        for (DessertItem di : dessertitems){
            System.out.println("This item is: " + di.getName());
            System.out.println("The cost of this item is: " + di.getCost());
            System.out.println("The calories of this item is: " + di.getCalories());
            System.out.println("----------");
        }


        //Testing the CheckOut Class
        System.out.println("*** TESTING CHECKOUT CLASS ***");
        System.out.println("");
        Checkout checkout = new Checkout();
        checkout.enterItem(candy);
        checkout.enterItem(cookie);
        checkout.enterItem(iceCream);
        checkout.enterItem(sundae);
        System.out.println(checkout);
    }

}
