/*   Josephine Plass-Nielsen & Oliver W. Nielsen
     September 10, 2018
     Purpose: This class defines a player
     Inputs: The deck and the player's name
     Output: A description of the player
*/

package war_game;
import java.util.ArrayList;

//This class represents a player in the game and her "abilities"
public class Player {

    Deck deck;
    String name;
    Card hand;

    //Default constructor
    public Player(){
        deck = new Deck();
        name = "Jane Doe";
        hand = null;
    }

    //Constructor initializing the player with a deck and a name
    public Player(Deck deck, String name){

        this.deck = deck;
        this.name = name;

    }

    //Allows player to draw the top card of the pile
    public Card drawTopCard(){

        ArrayList<Card> cards = deck.getCards(); //get all cards from the deck
        Card topCard = cards.get(0); //get the top card
        topCard.facedown = false; //turn it faceup
        deck.removeTopCard(); //removes the top card from deck
        return topCard;
    }

    //Returns the name
    public String getName(){

        return name;
    }

    //Prints the variables of the class
    public String toString() {
        return "The player: " + name + ", with the deck: " + deck;
    }
}
