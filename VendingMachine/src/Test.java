/**
 * Created by josep on 30-09-2018.
 */
public class Test {

    public static void main(String[] args){

        Coin c1 = new Coin();
        Coin c2 = new Coin();
        Coin c3 = new Coin();

        c1.setValue(1);
        c2.setValue(2);
        c3.setValue(3);

        VendingMachine machine = new VendingMachine();

        machine.AddCoins(c1);
        machine.AddCoins(c2);
        machine.AddCoins(c3);

        int number = machine.getCoins();

        System.out.println(number
        );

        System.out.println(machine.sumOfCoins());

    }

    //hehehehehhe

}
