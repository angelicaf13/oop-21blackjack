/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author Angelica Figueroa Muñiz
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("== 21 Black Jack ==");
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Enter de number of decks: ");
        int numberDecks = scan.nextInt();
        
        Game21 game = new Game21(numberDecks, name);
    }
    
}
