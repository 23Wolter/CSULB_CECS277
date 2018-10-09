/**
 * Created by josep on 30-09-2018.
 */
public class Tester {

    public static void main(String[] args){

        //Creates coins
        Coin c1 = new Coin();
        Coin c2 = new Coin();
        Coin c3 = new Coin();

        //Sets the value of test coins
        c1.setValue(1);
        c2.setValue(2);
        c3.setValue(3);

        //Prints out the to string for the coins
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //Creates a product
        Product p1 = new Product("Water",10);
        Product p2 = new Product("Candy bar",15);
        Product p3 = new Product("Chocolate",25);

        //Printsout the vending machine product
        System.out.println(p1);

        //Creates a vending machine
        VendingMachine machine = new VendingMachine();

        //Adds the coins to the vending machine
        machine.addCoins(c1);
        machine.addCoins(c2);
        machine.addCoins(c3);

        //Gets the number of coins in the vending machine
        int number = machine.getCoins();
        System.out.println(number
        );

        //gets the sum of the coins in the vending machine
        System.out.println(machine.sumOfCoins());

        //Adds product to the vending machine
        machine.addProducts(p1);
        machine.addProducts(p2);
        machine.addProducts(p3);

        //
        System.out.println(machine.getProducts());

        machine.selectProduct(p1);



    }

    //hehehehehhe

}
