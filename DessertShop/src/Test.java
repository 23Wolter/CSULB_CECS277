/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class Test {

    public static void main (String[] args){

        //Testing Candy class
        Candy candy = new Candy("gummy", 3.54, 7);
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
