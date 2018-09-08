/*   Josephine Plass-Nielsen & Oliver W. Nielsen
     September 10, 2018
     Purpose: This program is meant to simulate a game of war
     Inputs: This is the Main method class
     Output: The war simulation and the winner of the game
*/
package war_game;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //Pre game phase

        String[] suits = new String[]{"Clubs", "Hearts", "Diamonds", "Spades"}; //create an array of possible suits
        ArrayList<Card> cards = new ArrayList<>(); //create empty arraylist

        //create all 52 playing cards
        for(int i=0; i<suits.length; i++) {
            for(int j=2; j<15; j++) {
                Card card;
                if(j == 11){
                    card = new Card(j,"Jack", suits[i], true);
                } else if(j == 12){
                    card = new Card(j,"Queen", suits[i], true);
                } else if(j == 13){
                    card = new Card(j,"King", suits[i], true);
                } else if(j == 14){
                    card = new Card(j,"Ace", suits[i], true);
                } else {
                    card = new Card(j, Integer.toString(j), suits[i], true);

                }
                cards.add(card);
            }
        }

        Deck mainDeck = new Deck(cards); //create a main deck of playing cards

        mainDeck.shuffle(); //shuffle the deck

        //end of pre game phase
        //----------------------------------------


        //main game phase
        ArrayList<ArrayList<Card>> splitDeck = mainDeck.split(2); //split the mainDeck into piles equal to player number

        Deck deck1 = new Deck(splitDeck.get(0)); //create two new decks
        Deck deck2 = new Deck(splitDeck.get(1));

        Player player1 = new Player(deck1, "Josephine"); //create two new players and assign the decks
        Player player2 = new Player(deck2, "Oliver");


        //Game loop
        while(deck1.getSize() > 0 && deck2.getSize() > 0) { //while both players have more than 0 cards

            System.out.println("---------------");

            Card card1 = player1.drawTopCard(); //both players draw a card
            Card card2 = player2.drawTopCard();

            GameManager.evaluate(player1, card1, player2, card2); //the two cards get evaluated

        }


        //end of main game phase
        //----------------------------------------



        //Game Over phase
        if(deck1.getSize() == 0 && deck2.getSize() == 0) { //if both players have 0 cards, it's a tie
            System.out.println("THE GAME IS A TIE!");
        }else if(deck1.getSize() == 0) { //if one player has 0 cards, the other player wins
            System.out.println(player2.name + " WINS THE GAME!");
        } else if(deck2.getSize() == 0) {
            System.out.println(player1.name + " WINS THE GAME!");
        }
    }

}
