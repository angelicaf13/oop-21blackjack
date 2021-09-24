/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author Angelica Figueroa Muñiz
 */
public class Player {
    
    private String name;
    private int minScore;
    private int maxScore;
    private ArrayList<Card> cards;
    private int roundsWon;
    
    public Player(){
        this.name = "Jon Snow";
        this.minScore = 0;
        this.maxScore = 0;
        this.cards = new ArrayList<>();
        this.roundsWon = 0;
    }
    
    public Player(String name, int minScore, int maxScore, ArrayList<Card> cards, int roundsWon){
        this.name = name;
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.cards = cards;
        this.roundsWon = roundsWon;
    }
    
    public Player(String name){
        this.name = name;
        this.minScore = 0;
        this.maxScore = 0;
        this.cards = new ArrayList<>();
        this.roundsWon = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int score) {
        this.minScore = score;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getRoundsWon() {
        return roundsWon;
    }

    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }
    
    public String showCards(){
        String theCards = this.name + "'s cards are ";
        for (Card card : this.cards) {
            theCards += "[" + card.getValue() + " " + card.getFigure() + "]";
        }
        return theCards;
    }

    public String showCPUCards(){
        String theCards = this.name + "'s cards are ";
        theCards += "[" + cards.get(0).getValue() + " " + cards.get(0).getFigure() + "]";
        theCards += "[ closed ]";
        return theCards;
    }
    
    public void minScore(){
        int score = 0;
        for (Card card : cards) {
            if(card.getValue().matches("A")){
                score += 1;
            }else if(card.getValue().matches("J") 
                    || card.getValue().matches("K") 
                    || card.getValue().matches("Q") ){
                score += 10;
            }else{
                score += Integer.parseInt(card.getValue());
            }
        }
        this.minScore = score;
    }
    
    public void maxScore(){
        int score = 0;
        for (Card card : cards) {
            if(card.getValue().matches("A")){
                score += 11;
            }else if(card.getValue().matches("J") 
                    || card.getValue().matches("K") 
                    || card.getValue().matches("Q") ){
                score += 10;
            }else{
                score += Integer.parseInt(card.getValue());
            }
        }
        this.maxScore = score;
    }

    @Override
    public String toString() {
        return "My name is " + name + "and i've won " + roundsWon + "rounds";
    }
    
    
}
