/*   Josephine Plass-Nielsen
     Oliver W. Nielsen
     September 10, 2018
     Purpose: This program is meant to simulate a game of war
     Inputs: User's name
     Output: The war simulation and the winner of the game
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //Pre game phase

        String[] suits = new String[]{"clubs", "hearts", "diamonds", "spades"}; //create an array of possible suits
        ArrayList<Card> cards = new ArrayList<>(); //create empty arraylist

        //create all 52 playing cards
        for(int i=0; i<suits.length; i++) {
            for(int j=2; j<15; j++) {
                Card card = new Card(j, suits[i], true);
                cards.add(card);
            }
        }

        Deck mainDeck = new Deck(cards); //create a main deck of playing cards

        mainDeck.shuffle(); //shuffle the deck

        //end of pre game phase
        //----------------------------------------


        //main game phase
        ArrayList<ArrayList<Card>> splitDeck = mainDeck.split(2);

        Deck deck1 = new Deck(splitDeck.get(0));
        Deck deck2 = new Deck(splitDeck.get(1));

        Player player1 = new Player(deck1, "Josephine");
        Player player2 = new Player(deck2, "Oliver");


        //Game loop
        while(deck1.getSize() > 0 || deck2.getSize() > 0) {

            Card card1 = player1.drawTopCard();
            Card card2 = player2.drawTopCard();

            GameManager.evaluate(player1, card1, player2, card2);

        }


        //end of main game phase
        //----------------------------------------



        //Game Over phase
        if(deck1.getSize() == 0) {
            System.out.println(player2.name + " WINS THE GAME!");
        } else if(deck2.getSize() == 0) {
            System.out.println(player1.name + " WINS THE GAME!");
        }
    }

}
