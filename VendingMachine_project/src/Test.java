/**
 * Purpose: Test every class constructor and method
 * Inputs: The parameters for the multi-argument constructors
 * Output: String representations of each test result
 * @author Josephine Plass-Nielsen & Oliver Nielsen
 * @date 10/09/2018
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        System.out.println("TEST OF METHODS");

        //Creates coins
        System.out.println("Testing Coin class: Default constructor");
        Coin c1 = new Coin();
        Coin c2 = new Coin();
        Coin c3 = new Coin();
        Coin c4 = new Coin(10);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("");
        System.out.println("Testing setvalue():");

        //Sets the value of test coins, does not set value for c3
        c1.setValue(1);
        c2.setValue(2);


        //Prints out the toString for the coins
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("");

        //Prints out the coin from the multi-argument constructor
        System.out.println("Testing multi-argument constructor: ");
        System.out.println(c4);


        //Creates a product with default constructor
        System.out.println("");
        System.out.println("Testing Product class: Default constructor");
        Product p1 = new Product();

        //Printsout the vending machine product
        System.out.println(p1);
        System.out.println("");

        //Testing methods from Coin class
        System.out.println("Testing setName() and setValue()");
        p1.setName("Juice");
        p1.setValue(30);
        System.out.println(p1);
        System.out.println("");

        //Creates a product with multi-argument constructor
        System.out.println("Testing multi-argument constructor:");
        Product p2 = new Product("Water",10);
        Product p3 = new Product("Coffee",15);
        Product p4 = new Product("Soda",25);

        //Prints out the products
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println("");

        //Creates and prints a vending machine
        System.out.println("Testing vending machine:");
        VendingMachine machine = new VendingMachine(3);
        System.out.println(machine);
        System.out.println("");


        //Adds the coins to the vending machine
        System.out.println("Adds coins to the vending machine: ");
        machine.addCoins(c1);
        machine.addCoins(c2);
        machine.addCoins(c3);

        //Gets the number of coins in the vending machine
        int number = machine.getCoins();
        System.out.println(number + " ... coins has been added");
        System.out.println("");

        //gets the sum of the coins in the vending machine
        System.out.println("Gets the sum of coins in the vending machine:");
        System.out.println(machine.sumOfCoins());
        System.out.println("");

        //Adds product to the vending machine
        System.out.println("Adds products to the vending machine:");
        machine.addProducts(0, p1);
        machine.addProducts(1, p2);
        machine.addProducts(2, p3);

        //Prints the products in the vending machine
        System.out.println(machine.getProducts());
        System.out.println("");

        //Testing getValue in Coin class
        System.out.println("Testing getValue in Coin class");
        System.out.println("This coin has a value of: " + c1.getValue());
        System.out.println("");

        //Testing getName and getValue in Product class
        System.out.println("Testing getName and getValue in Product class");
        System.out.println(p1.getName() + " has a value of " + p1.getValue());
        System.out.println("");

        //starts the Vending Machine simulation
        System.out.println("--------------------------");
        System.out.println("VENDING MACHINE SIMULATION");
        System.out.println("--------------------------");

        //creates a new Vending Machine with 3 types of products
        VendingMachine vm = new VendingMachine(3);
        vm.addProducts(0, p2); //adds the 3 previous instantiated products
        vm.addProducts(1, p3);
        vm.addProducts(2, p4);

        System.out.println("");

        //creates a scanner for handling input from user
        Scanner scanner = new Scanner(System.in);
        boolean run = true; //boolean to check if the program should run

        while (run) {
            System.out.println("--------------------");
            System.out.println("");
            System.out.println("Welcome to the vending machine");
            System.out.println("To exit press 'q'");
            System.out.println("Are you a customer [1] or employee [2]?");

            String s = scanner.next(); //reads the next input from the user
            System.out.println("--------------------");

            //if user inputs 1 (customer)
            if(s.equals("1")) {

                System.out.println("You can buy these products if they are in stock: ");
                System.out.println("--- [1] Water");
                System.out.println("--- [2] Coffee");
                System.out.println("--- [3] Soda");

                //instantiate a temporary product placeholder to be overwritten
                Product chosenProduct = new Product("temp", 0);

                boolean loop = true; //loop while this is true
                while (loop) {
                    System.out.println("Choose either '1', '2', or '3', or 'q' to exit");
                    String choice = scanner.next();

                    switch (choice) { //switch statement on the user input
                        case "1":
                            loop = false; //stop looping
                            chosenProduct = vm.getFirstProduct(0); //get the first product from the list at index 0
                            vm.removeProduct(0); //remove the product from the list
                            break;
                        case "2":
                            loop = false;
                            chosenProduct = vm.getFirstProduct(1);
                            vm.removeProduct(1);
                            break;
                        case "3":
                            loop = false;
                            chosenProduct = vm.getFirstProduct(2);
                            vm.removeProduct(2);
                            break;
                        case "q":
                            return;
                        default:
                            System.out.println("Not a valid option, choose again");
                    }

                }

                //print name and value of chosen product
                System.out.println("You have chosen " + chosenProduct.getName());
                System.out.println("This item costs: " + chosenProduct.getValue());

                loop = true; //loop while true
                while (loop) {
                    System.out.println("Do you want to add a coin (value of 5) y/n?");
                    String coinAdd = scanner.next();
                    switch (coinAdd) {
                        case "y":
                            Coin c = new Coin(); //create new coin
                            vm.addCoinToRepo(c); //add coin the temporary repository
                            System.out.println("The total amount in the machine is now " + vm.sumOfRepo());
                            break;
                        case "n":
                            loop = false; //stop looping
                            break;
                        default:
                            System.out.println("Not a valid option, choose again");
                    }
                }

                //print out cost and sum of temporary repository
                System.out.println("The product cost " + chosenProduct.getValue());
                System.out.println("You have inserted " + vm.sumOfRepo());

                //if the money in the machine is sufficient
                if(vm.sumOfRepo() >= chosenProduct.getValue()) {
                    System.out.println("Here you go! Thank you for shopping!");
                    vm.transferCoin(); //coins get transfered from the temp repo to the Vending Machine
                    vm.clearRepository(); //temp repository gets emptied
                } else {
                    //if money is not sufficient
                    System.out.println("There is insufficient money, your coins are returned, try again");
                    vm.clearRepository(); //empty temp repo
                    System.out.println("The total amount in the machine is now " + vm.sumOfRepo());
                }

            } else if (s.equals("2")) { //if user typed 2 (employee)

                boolean employeeLoop = true; //loop while true
                while (employeeLoop) {


                    System.out.println("What would you like to do? ");
                    System.out.println("[1] Restock");
                    System.out.println("[2] Retrieve coins");
                    System.out.println("[q] exit");

                    String str = scanner.next();
                    System.out.println("--------------------");

                    if (str.equals("1")) { //if user input 1 (restock products)

                        boolean loop = true;
                        while (loop) {

                            System.out.println("The current stock is:");
                            ArrayList<Product> ps = vm.getProducts(); //get list of products in vending machine
                            for (Product p : ps) {
                                System.out.println(p.getName()); //print the names og the products
                            }
                            System.out.println("--------------------");
                            System.out.println("What would you like to restock?");
                            System.out.println("[1] Water");
                            System.out.println("[2] Coffee");
                            System.out.println("[3] Soda");
                            System.out.println("[q] Finished restocking");

                            String restock = scanner.next();
                            switch (restock) { //switch on which product to restock
                                case "1":
                                    Product water = new Product("Water", 10); //create a new product with name water
                                    vm.addProducts(0, water); //add that product to the vending machine
                                    break;
                                case "2":
                                    Product coffee = new Product("Coffee", 15);
                                    vm.addProducts(1, coffee);
                                    break;
                                case "3":
                                    Product soda = new Product("Soda", 25);
                                    vm.addProducts(2, soda);
                                    break;
                                case "q":
                                    loop = false; //stop looping
                                    break;
                                default:
                                    System.out.println("Not a valid input, try again");
                            }
                        }

                    } else if (str.equals("2")) { //if user input 2 (retrieve coins)

                        //print out the total amount of coins in the machine
                        System.out.println("The total amount retrieved is: " + vm.sumOfCoins());
                        vm.clearCoins(); //empty coins

                    } else if (str.equals("q")) {
                        employeeLoop = false; //stop looping
                    } else {
                        System.out.println("Not a valid input, try again");
                    }
                }

            } else if(s.equals("q")) { //if user inputs 'q'
                return; //exit program
            } else {
                System.out.println("Not a valid input, try again");
            }
        }





    }


}
