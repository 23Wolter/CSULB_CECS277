/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

import sun.security.provider.Sun;

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
        Candy candy = new Candy("gummyBear", 3.54, 75, 200);
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

        IceCream iceCream = new IceCream();
        Sundae sundae = new Sundae(iceCream, 40, 176, "Super Duper Funday Sundae");
        System.out.println(sundae);

    }

}
