/*   Josephine Plass-Nielsen & Oliver W. Nielsen
     September 10, 2018
     Purpose: This class defines the properties of a card
     Inputs: Rank/name and suit
     Output: A description of the card
*/
package war_game;

//This class represents a playing card and its properties
public class Card {
    int rank;
    String name;
    String suit;
    String color;
    boolean facedown; //Shows whether the card is face up or down

    //Default constructor
    public Card(){
        rank = 7;
        name = "7";
        suit = "hearts";
        color = getColor(suit);
        facedown = true;
    }

    //Constructor setting the values
    //Input: Rank, name, suit and whether if it is facing up or down
    public Card(int rank, String name, String suit, boolean facedown){
        this.rank = rank;
        this.suit = suit;
        this.name = name;
        color = getColor(suit);
        this.facedown = facedown;

    }

    //Returns the color dependant on the suit
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

    //returns the name
    public String getName(){return name;}

    //toString method prints the values of the class
    public String toString(){

        return "This is a card with values, rank: " + rank + " name: " + name + " suit: " + suit + " color: " + color + " facedown: " + facedown;

    }

}
