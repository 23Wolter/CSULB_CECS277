/*   Josephine Plass-Nielsen & Oliver W. Nielsen
     September 10, 2018
     Purpose: This class is used to handle the rules of the game
     Inputs: No input
     Output: The winner of the game round
*/
package war_game;
import java.util.ArrayList;

//Handles game rules
//Has no constructors as there will only be one game manager
public class GameManager {

    public static ArrayList<Card> winnerPile = new ArrayList<>(); //This variable is static so it can be used without an instance of the class

    //Method used to evaluate two cards
    //This method is static so it can be used without an instance of the class
    //Input: Players and their cards
    public static void evaluate(Player player1, Card playerCard1, Player player2, Card playerCard2){

        //Prints players actions
        System.out.println(player1.getName() + " plays " + playerCard1.getName() + " of " + playerCard1.getSuit());
        System.out.println(player2.getName() + " plays " + playerCard2.getName() + " of " + playerCard2.getSuit());

        //Both cards are added to the winnerpile
        winnerPile.add(playerCard1);
        winnerPile.add(playerCard2);

        //Checks whether one player's rank is higher than the other's
        if(playerCard1.getRank() > playerCard2.getRank()){

            System.out.println(player1.getName() + " wins the round");


            //Assign all cards from winnerpile to winning player
            player1.deck.cards.addAll(winnerPile);
            winnerPile.clear();

            //Prints how many cards the player has left
            System.out.println(player1.getName() + " has " + player1.deck.getSize() + " cards left");
            System.out.println(player2.getName() + " has " + player2.deck.getSize() + " cards left");
        }
        else if(playerCard1.getRank() < playerCard2.getRank()){

            System.out.println(player2.getName() + " wins the round");


            player2.deck.cards.addAll(winnerPile);
            winnerPile.clear();

            System.out.println(player1.getName() + " has " + player1.deck.getSize() + " cards left");
            System.out.println(player2.getName() + " has " + player2.deck.getSize() + " cards left");

            //If the ranks are even then a round of war begins
        } else if(playerCard1.getRank() == playerCard2.getRank()){

            System.out.println("WAR!");
            war(player1, player2);

        }
    }

    //Method simulating a round of war
    //This method is static so it can be used without an instance of the class
    //Input: Two players
    public static void war(Player p1, Player p2){

        //If one player has 0 cards the round ends
        if(p1.deck.getSize() == 0 || p2.deck.getSize() == 0) {
            return;
        }

        //Players places up to three face down cards, must keep at least one to play war
        if(p1.deck.getSize() > 3) {
            System.out.println(p1.getName() + " places xx");
            Card p1c1 = p1.drawTopCard();
            p1c1.facedown = true;
            winnerPile.add(p1c1);
        }
        if(p1.deck.getSize() > 2) {
            System.out.println(p1.getName() + " places xx");
            Card p1c2 = p1.drawTopCard();
            p1c2.facedown = true;
            winnerPile.add(p1c2);
        }
        if(p1.deck.getSize() > 1) {
            System.out.println(p1.getName() + " places xx");
            Card p1c3 = p1.drawTopCard();
            p1c3.facedown = true;
            winnerPile.add(p1c3);
        }


        if(p2.deck.getSize() > 3) {
            System.out.println(p2.getName() + " places xx");
            Card p2c1 = p2.drawTopCard();
            p2c1.facedown = true;
            winnerPile.add(p2c1);
        }
        if(p2.deck.getSize() > 2) {
            System.out.println(p2.getName() + " places xx");
            Card p2c2 = p2.drawTopCard();
            p2c2.facedown = true;
            winnerPile.add(p2c2);
        }
        if(p2.deck.getSize() > 1) {
            System.out.println(p2.getName() + " places xx");
            Card p2c3 = p2.drawTopCard();
            p2c3.facedown = true;
            winnerPile.add(p2c3);
        }


        //Places cards
        Card p1c4 = p1.drawTopCard();
        Card p2c4 = p2.drawTopCard();

        //Evaluates the two cards
        evaluate(p1, p1c4, p2, p2c4);
    }

    //method tostring prints the winner pile
    public String toString(){

        return "Winner pile is " + winnerPile;
    }
}
