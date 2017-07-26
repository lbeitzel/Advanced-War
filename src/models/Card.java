package models;

public class Card {

    public Suit suit;

    public Card(Suit suit){
        this.suit = suit;

    }

    public Suit getSuit() {
        return suit;
    }

    public static void main(String [] args) {
        Card c = new Card(new Suit("\u1F0B1","Hearts"));
        System.out.println(c.suit.getUnicode());
    }

}

