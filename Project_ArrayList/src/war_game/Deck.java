/*   Josephine Plass-Nielsen & Oliver W. Nielsen
     September 10, 2018
     Purpose: The purpose of the class is to define a deck of cards
     Inputs: A list of cards
     Output: The description of a deck
*/
package war_game;
import java.util.ArrayList;
import java.util.Collections;

//this class represents a deck of playing cards
public class Deck {

    ArrayList<Card> cards;
    int size;

    //Default constructor creates a deck with 52 unique playing cards
    public Deck() {
        String[] suits = new String[]{"Clubs", "Hearts", "Diamonds", "Spades"}; //create an array of possible suits
        ArrayList<Card> cards = new ArrayList<>(); //create empty arraylist

        //create all 52 playing cards
        for(int i=0; i<suits.length; i++) {
            for(int j=2; j<15; j++) {
                Card card;
                if(j == 11){
                    card = new Card(j,"Jack", suits[i], true); //Attaches a name for the special cases of Jack, Queen, King  and Ace
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
        this.cards = cards;
        this.size = cards.size();
    }

    //Creates a deck
    //Input: Arraylist of cards
    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        this.size = cards.size();
    }

    //returns the size of the arraylist
    public int getSize() {
        return cards.size();
    }

    //Shuffles the deck(arraylist)
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // This method handle splitting the deck into multiple decks
    //the method can be used for splitting all decksizes into any number of piles
    //the remainders gets split out to the other decks one by one, until no remainder is left
    public ArrayList<ArrayList<Card>> split(int numberOfPiles) {

        ArrayList<ArrayList<Card>> newDecks = new ArrayList<>();

        int remVar = getSize()%numberOfPiles;  // Finds the remainder to check if the piles of cards will be even
        ArrayList<Card> remainderList = new ArrayList<>(cards.subList(0,remVar)); //Creates a sublist for remainders

        for(int j = 0; j < remVar; j++){

            cards.remove(j); //removes the remainders from cards
        }

        int splitSize = getSize()/numberOfPiles; //Variable that calculates size of each sub pile
        for(int i = 0; i < numberOfPiles; i++){

            //Creates a new List based on the splitSize variable
            ArrayList<Card> newList = new ArrayList<>(cards.subList(splitSize*i,(splitSize*i)+splitSize));
            newDecks.add(newList);
        }

        //If any remainders left
        if(remainderList.size() > 0) {
            for (int k = 0; k < remainderList.size(); k++) {

                Card remSplit = remainderList.get(k);     //Deals out the remainders to the piles on by one
                ArrayList<Card> tempList = newDecks.get(k);
                tempList.add(remSplit);
            }
        }

        return newDecks;
    }

    //Returns cards
    public ArrayList<Card> getCards(){

        return cards;

    }

    //Removes the top card
    public void removeTopCard() {
        cards.remove(0);
    }

    //toString method prints the values of the class
    public String toString() {
        return "This deck contains, cards: " + cards + ", size: " + size;
    }
}
