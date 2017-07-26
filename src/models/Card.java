package models;
    
    //heart ('\u2665'),
    //diamond ('\u2666'),
    //club ('\u2663'),
    //spade ('\u2660')


public class Card {

    public Suit suit;
    public String value;

    public Card(Suit suit, String value){
        this.suit = suit;
        this.value = value;

    }

    public Suit getSuit() {
        return suit;
    }
    public String getValue() {
    	return value;
    }
    @Override
    public String toString() {
    	return "|" + getSuit().getUnicode() + getValue() + "|";
    }

    public static void main(String [] args) {
        Card c = new Card(new Suit("\u2665","Hearts"), "10");
        System.out.print(c);
    }

}

