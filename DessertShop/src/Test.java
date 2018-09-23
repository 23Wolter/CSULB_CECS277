/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class Test {

    public static void main (String[] args){

        //Testing the Candy class
        System.out.println("***CANDY CLASS TESTING***");

        //Default constructor test
        System.out.println("***Default constructor testing***");
        Candy defaultCandy = new Candy();
        System.out.println(defaultCandy);
        System.out.println("");

        //Method testing for defaultCandy item
        System.out.println("**Methods testing***");
        System.out.println("Name: " + defaultCandy.getName());
        System.out.println("Cost: " + defaultCandy.getCost());
        System.out.println("Price pr lbs: " + defaultCandy.getPricePrLbs());
        System.out.println("Weight: " + defaultCandy.getWeight());
        System.out.println("Calories: " + defaultCandy.getCalories());
        System.out.println("");

        //Multi-argument constructor test
        System.out.println("**Multi-argument constructor testing***");
        Candy candy = new Candy("gummyBear", 3.54, 75, 200);
        System.out.println(candy);
        System.out.println("");

        //Method testing for candy item
        System.out.println("**Methods testing ***");
        System.out.println("Name: " + candy.getName());
        System.out.println("Cost: " + candy.getCost());
        System.out.println("Price pr lbs: " + candy.getPricePrLbs());
        System.out.println("Weight: " + candy.getWeight());
        System.out.println("Calories: " + candy.getCalories());
        System.out.println("");


        System.out.println("***ICECREAM CLASS TESTING***");
        IceCream icecream = new IceCream();
        System.out.println(icecream);



    }

}
