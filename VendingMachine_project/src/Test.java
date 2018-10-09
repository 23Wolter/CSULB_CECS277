import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by josep on 30-09-2018.
 */
public class Test {

    public static void main(String[] args){

        System.out.println("TEST OF METHODS");

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
        Product p2 = new Product("Coffee",15);
        Product p3 = new Product("Soda",25);

        //Printsout the vending machine product
        System.out.println(p1);

        //Creates a vending machine
        VendingMachine machine = new VendingMachine(3);

        //Adds the coins to the vending machine
        machine.addCoins(c1);
        machine.addCoins(c2);
        machine.addCoins(c3);

        //Gets the number of coins in the vending machine
        int number = machine.getCoins();
        System.out.println(number);

        //gets the sum of the coins in the vending machine
        System.out.println(machine.sumOfCoins());

        //Adds product to the vending machine
        machine.addProducts(0, p1);
        machine.addProducts(1, p2);
        machine.addProducts(2, p3);

        //
        System.out.println(machine.getProducts());

        //machine.selectProduct(p1);


        System.out.println("--------------------------");
        System.out.println("VENDING MACHINE SIMULATION");
        System.out.println("--------------------------");

        VendingMachine vm = new VendingMachine(3);
        vm.addProducts(0, p1);
        vm.addProducts(1, p2);
        vm.addProducts(2, p3);

        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("--------------------");
            System.out.println("");
            System.out.println("Welcome to the vending machine");
            System.out.println("To exit press 'q'");
            System.out.println("Are you a customer [1] or employee [2]?");

            String s = scanner.next();
            System.out.println("--------------------");

            if(s.equals("1")) {

                System.out.println("You can buy these products if they are in stock: ");
                System.out.println("--- [1] Water");
                System.out.println("--- [2] Coffee");
                System.out.println("--- [3] Soda");


                Product chosenProduct = new Product("temp", 0);

                boolean loop = true;
                while (loop) {
                    System.out.println("Choose either '1', '2', or '3', or 'q' to exit");
                    String choice = scanner.next();

                    switch (choice) {
                        case "1":
                            loop = false;
                            chosenProduct = vm.getFirstProduct(0);
                            vm.removeProduct(0);
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

                System.out.println("You have chosen " + chosenProduct.getName());
                System.out.println("This item costs: " + chosenProduct.getValue());

                loop = true;
                while (loop) {
                    System.out.println("Do you want to add a coin (value of 5) y/n?");
                    String coinAdd = scanner.next();
                    switch (coinAdd) {
                        case "y":
                            Coin c = new Coin();
                            vm.addCoinToRepo(c);
                            System.out.println("The total amount in the machine is now " + vm.sumOfRepo());
                            break;
                        case "n":
                            loop = false;
                            break;
                        default:
                            System.out.println("Not a valid option, choose again");
                    }
                }

                System.out.println("The product cost " + chosenProduct.getValue());
                System.out.println("You have inserted " + vm.sumOfRepo());

                if(vm.sumOfRepo() >= chosenProduct.getValue()) {
                    System.out.println("Here you go! Thank you for shopping!");
                    vm.transferCoin();
                    vm.clearRepository();
                } else {
                    System.out.println("There is insufficient money, your coins are returned, try again");
                    vm.clearRepository();
                    System.out.println("The total amount in the machine is now " + vm.sumOfRepo());
                }

            } else if (s.equals("2")) {

                boolean employeeLoop = true;
                while (employeeLoop) {


                    System.out.println("What would you like to do? ");
                    System.out.println("[1] Restock");
                    System.out.println("[2] Retrieve coins");
                    System.out.println("[q] exit");

                    String str = scanner.next();
                    System.out.println("--------------------");

                    if (str.equals("1")) {

                        boolean loop = true;
                        while (loop) {

                            System.out.println("The current stock is:");
                            ArrayList<Product> ps = vm.getProducts();
                            for (Product p : ps) {
                                System.out.println(p.getName());
                            }
                            System.out.println("--------------------");
                            System.out.println("What would you like to restock?");
                            System.out.println("[1] Water");
                            System.out.println("[2] Coffee");
                            System.out.println("[3] Soda");
                            System.out.println("[q] Finished restocking");

                            String restock = scanner.next();
                            switch (restock) {
                                case "1":
                                    Product water = new Product("Water", 10);
                                    vm.addProducts(0, water);
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
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("Not a valid input, try again");
                            }
                        }

                    } else if (str.equals("2")) {

                        System.out.println("The total amount retrieved is: " + vm.sumOfCoins());
                        vm.clearCoins();

                    } else if (str.equals("q")) {
                        employeeLoop = false;
                    } else {
                        System.out.println("Not a valid input, try again");
                    }
                }

            } else if(s.equals("q")) {
                return;
            } else {
                System.out.println("Not a valid input, try again");
            }
        }





    }

    //hehehehehhe

}
