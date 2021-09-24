/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Angelica Figueroa Muñiz
 */
public class Game21 {
    
    Scanner scan = new Scanner(System.in);
    private Deck gameDeck;
    private Player player;
    private Player computer;
    
    public Game21(int numberDecks, String playerName){
        gameDeck = new Deck(numberDecks);
        gameDeck.shuffle();
        player = new Player(playerName);
        computer = new Player("The Computer");
        Scanner scan = new Scanner(System.in);
        givePlayerCards(player, gameDeck); //give two cards to the player
        givePlayerCards(computer, gameDeck); //give to cards to the CPU
        System.out.println(player.showCards());
        System.out.println(computer.showCPUCards());
        player.minScore(); player.maxScore();
        System.out.println("Your minimum score is: " + player.getMinScore());
        System.out.println("Your maximum score is: " + player.getMaxScore());
        while(player.getMinScore() < 21 && player.getMaxScore() < 21){
            System.out.println("Do you wish to keep your cards? [Y/n]: ");
            String input = scan.next();
            if(input.toLowerCase().matches("y")){
                
            }else if(input.toLowerCase().matches("n")){
                givePlayerCards(player, gameDeck);
                player.minScore(); player.maxScore();
                System.out.println("Your minimum score is: " + player.getMinScore());
                System.out.println("Your maximum score is: " + player.getMaxScore());
            }
        }
    }
    
    public void givePlayerCards(Player player, Deck gameDeck){
        player.getCards().add(gameDeck.getCard());
        player.getCards().add(gameDeck.getCard());
    }
    
}
