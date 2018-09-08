package war_game;

import java.util.ArrayList;

/*   Josephine Plass-Nielsen
     Oliver W. Nielsen
     September 10, 2018
     Purpose: This program is meant to simulate a game of war
     Inputs: User's name
     Output: The war simulation and the winner of the game
*/public class GameManager {

    public static ArrayList<Card> winnerPile = new ArrayList<>();

    public static void evaluate(Player player1, Card playerCard1, Player player2, Card playerCard2){

        System.out.println(player1.name + " plays " + playerCard1.rank + " of " + playerCard1.suit);
        System.out.println(player2.name + " plays " + playerCard2.rank + " of " + playerCard2.suit);

        winnerPile.add(playerCard1);
        winnerPile.add(playerCard2);

        if(playerCard1.rank > playerCard2.rank){

            System.out.println(player1.name + " wins the round");

            player1.deck.cards.addAll(winnerPile);
            winnerPile.clear();
        }
        else if(playerCard1.rank < playerCard2.rank){

            System.out.println(player2.name + " wins the round");

            player2.deck.cards.addAll(winnerPile);
            winnerPile.clear();

        } else if(playerCard1.rank == playerCard2.rank){

            System.out.println("WAR!");

            war(player1, player2);

        }
    }

    public static void war(Player p1, Player p2){

        if(p1.deck.getSize() == 0 || p2.deck.getSize() == 0) {
            return;
        }


        if(p1.deck.getSize() > 3) {
            System.out.println(p1.name + " places xx");
            Card p1c1 = p1.drawTopCard();
            p1c1.facedown = true;
            winnerPile.add(p1c1);
        }
        if(p1.deck.getSize() > 2) {
            System.out.println(p1.name + " places xx");
            Card p1c2 = p1.drawTopCard();
            p1c2.facedown = true;
            winnerPile.add(p1c2);
        }
        if(p1.deck.getSize() > 1) {
            System.out.println(p1.name + " places xx");
            Card p1c3 = p1.drawTopCard();
            p1c3.facedown = true;
            winnerPile.add(p1c3);
        }


        if(p2.deck.getSize() > 3) {
            System.out.println(p2.name + " places xx");
            Card p2c1 = p2.drawTopCard();
            p2c1.facedown = true;
            winnerPile.add(p2c1);
        }
        if(p2.deck.getSize() > 2) {
            System.out.println(p2.name + " places xx");
            Card p2c2 = p2.drawTopCard();
            p2c2.facedown = true;
            winnerPile.add(p2c2);
        }
        if(p2.deck.getSize() > 1) {
            System.out.println(p2.name + " places xx");
            Card p2c3 = p2.drawTopCard();
            p2c3.facedown = true;
            winnerPile.add(p2c3);
        }


        Card p1c4 = p1.drawTopCard();
        Card p2c4 = p2.drawTopCard();
        evaluate(p1, p1c4, p2, p2c4);
    }
}
