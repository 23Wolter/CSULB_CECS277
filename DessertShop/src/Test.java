/*
    Josephine & Oliver
    September 12, 2018
    Purpose:
    Inputs:
    Output:
*/

public class Test {

    public static void main (String[] args){

        Candy candy = new Candy("gummy", 3.54, 7);
        int price = candy.getCost();
        System.out.println("this is the price of candy " + price);

        System.out.println("Name:" + candy.getName());
        System.out.println("Weight: " + candy.getWeight());
        System.out.println("Price pr LBS: " + candy.getPricePrLbs());

    }

}
