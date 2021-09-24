/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Angelica Figueroa Muñiz
 */
public class Deck {
    
    final String[] suites = {"♣", "♦", "♠", "♥"};
    final String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "J", "Q", "K"};
    private ArrayList<Card> cards;
    private int firstCard;
    
    public Deck(){
        this.cards = new ArrayList<>();
        this.firstCard = 0;
        createCards(1);
    }
    
    public Deck(int numberDecks){
        this.cards = new ArrayList();
        this.firstCard = 0;
        createCards(numberDecks);
    }
    
    public void createCards(int numberDecks) {
        String color = "Black";
        for (int i = 0; i < numberDecks; i++) {
            for (int j = 0; j < suites.length; j++) {
                for (int k = 0; k < values.length; k++) {
                    this.cards.add(new Card(values[k], suites[j], color));
                }
                if (color.matches("Black")) {
                    color = "Red";
                } else {
                    color = "Black";
                }
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getFirstCard() {
        return firstCard;
    }

    public void setFirstCard(int firstCard) {
        this.firstCard = firstCard;
    }
    
    public Card getCard(){
        this.firstCard++;
        return this.cards.get(firstCard - 1);
    }
    
    public ArrayList<Card> cardsNotUsed(){
        ArrayList<Card> notUsed = new ArrayList<>();
        for(int i = this.firstCard; i < this.getCards().size(); i++){
            notUsed.add(cards.get(i));
            cards.remove(i);
        }
        return notUsed;
    }
    
    public void cleanDeck(){
        for(int i = this.firstCard; i < this.getCards().size(); i++){
            this.getCards().remove(i);
        }
    }
    
    public void replaceNotUsed(ArrayList<Card> moreCards){
        //cleanDeck();
        this.getCards().addAll(this.firstCard, moreCards);
    }
    
    public void shuffle(){
        ArrayList<Card> notUsed = cardsNotUsed();
        Collections.shuffle(notUsed);
        replaceNotUsed(notUsed);
    }
    
    @Override
    public String toString() {
        String s = "";
        int i = 1;
        for (Card card : cards) {
            s += "[" + i +"] " +card.toString() + "\n";
            i++;
        }
        return s;
    }
    
    
}
