/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Angelica Figueroa Muñiz
 */
public class Card {
    
    private String value;
    private String figure;
    private String color;
    
    public Card(){
        this.value = "0";
        this.figure = "x";
        this.color = "White";
    }
    
    public Card(String value, String figure, String color){
        this.value = value;
        this.figure = figure;
        this.color = color;
    }
    
    public void copyCard(Card card){
        this.value = card.getValue();
        this.figure = card.getFigure();
        this.color = card.getColor();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            Card c = (Card) obj;
            return c.getValue().matches(this.getValue());
        }else{
            return false;
        }
    }
        
    @Override
    public String toString() {
        return "I'm a card with a value of : " + value + " , my figure is : " 
                + figure + " and my color is: " + color;
    }
    
}
