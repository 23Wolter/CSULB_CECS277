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

        //Default constructor test
        Candy defaultCandy = new Candy();
        System.out.println(defaultCandy);

        System.out.println("Name: " + defaultCandy.getName());
        System.out.println("Cost: " + defaultCandy.getCost());
        System.out.println("Price pr lbs: " + defaultCandy.getPricePrLbs());
        System.out.println("Weight: " + defaultCandy.getWeight());
        System.out.println("Calories: " + defaultCandy.getCalories());

        System.out.println("");


        //Multi-argument constructor test
        Candy candy = new Candy("gummy", 3.54, 7, 200);

        //Testing method getCost()
        int price = candy.getCost();
        System.out.println("this is the price of candy " + price);

        System.out.println("Name:" + candy.getName());
        System.out.println("Weight: " + candy.getWeight());
        System.out.println("Price pr LBS: " + candy.getPricePrLbs());

        //Testing IceCream class
        IceCream iceCream = new IceCream(400);
        int iceCreamPrice = iceCream.getCost();
        System.out.println("This is the price of the icecream: " + iceCreamPrice);

        //Testing SundaeClass
        Sundae sundae = new Sundae(100, "sundae", 500);
        int sundaePrice = sundae.getCost();
        System.out.println("This is the price of the sundae: " + sundaePrice);

    }

}
