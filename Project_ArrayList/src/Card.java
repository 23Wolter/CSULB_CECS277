/*   Josephine Plass-Nielsen
     Oliver W. Nielsen
     September 10, 2018
     Purpose: This program is meant to simulate a game of war
     Inputs: User's name
     Output: The war simulation and the winner of the game
*/

//This class represents a playing card and its properties
public class Card {


    int rank;
    String suit;
    String color;
    boolean facedown; //Shows whether the card is face up or down


    //Default constructor
    public Card(){

        rank = 7;
        suit = "hearts";
        color = getColor(suit);
        facedown = true;
    }

    //Constructor setting the values
    public Card(int rank, String suit, boolean facedown){

        this.rank = rank;
        this.suit = suit;
        color = getColor(suit);
        this.facedown = facedown;

    }

    //Gets the color dependant on the suit
    public String getColor(String suit){

        if(suit == "hearts" || suit == "diamonds"){
            return "red";
        } else if(suit == "spades" || suit == "clubs") {
            return "black";
        }else {
            return "";
        }
    }

    //returns the rank
    public int getRank() {
        return rank;
    }

    //returns the suit
    public String getSuit() {
        return suit;
    }

    //toString method prints the values of the class
    public String toString(){

        return "This is a card with values, rank: " + rank + " suit: " + suit + " color: " + color + " facedown: " + facedown;

    }

}
