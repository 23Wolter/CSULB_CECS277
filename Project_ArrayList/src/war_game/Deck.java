package war_game;/*   Josephine Plass-Nielsen
     Oliver W. Nielsen
     September 10, 2018
     Purpose: This program is meant to simulate a game of war
     Inputs: User's name
     Output: The war simulation and the winner of the game
*/
import java.util.ArrayList;
import java.util.Collections;

//this class represents a deck of playing cards
public class Deck {

    ArrayList<Card> cards;
    int size;


    public Deck() {
        //to do create ArrayList
    }

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        this.size = cards.size();
    }

    public int getSize() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }



    // This method handle splitting the deck into multiple decks
    public ArrayList<ArrayList<Card>> split(int numberOfPiles) {

        ArrayList<ArrayList<Card>> newDecks = new ArrayList<>();

        int remVar = getSize()%numberOfPiles;  // Finds the remainder to check if the piles of cards will be even
        ArrayList<Card> remainderList = new ArrayList<>(cards.subList(0,remVar)); //Creates a sublist for remainders, if any

        for(int j = 0; j < remVar; j++){

            cards.remove(j);
        }

        int splitSize = getSize()/numberOfPiles; //Variable that calculates size of each sub pile
        for(int i = 0; i < numberOfPiles; i++){

            //Creates a new List based on the splitSize variable
            ArrayList<Card> newList = new ArrayList<>(cards.subList(splitSize*i,(splitSize*i)+splitSize));
            newDecks.add(newList);
        }

        if(remainderList.size() > 0) {
            for (int k = 0; k < remainderList.size(); k++) {

                Card remSplit = remainderList.get(k);
                ArrayList<Card> tempList = newDecks.get(k);
                tempList.add(remSplit);
            }
        }

        return newDecks;
    }


    public ArrayList<Card> getCards(){

        return cards;

    }

    public void removeTopCard() {
        cards.remove(0);
    }

    //toString method prints the values of the class
    public String toString() {
        return "This deck contains, cards: " + cards + ", size: " + size;
    }
}
