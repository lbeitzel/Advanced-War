package model;
    
    //heart ('\u2665'),
    //diamond ('\u2666'),
    //club ('\u2663'),
    //spade ('\u2660')


public class Card {

    public Suit suit;

    public Card(Suit s){
        this.suit = s;

    }

    public Suit getSuit() {
        return suit;
    }

    public static void main(String [] args) {
        Card c = new Card(new Suit("\u1F0B1","Hearts"));
        System.out.println(c.suit.getUnicode());
    }

}

