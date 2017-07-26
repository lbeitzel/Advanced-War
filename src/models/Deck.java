package models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	String suits[] = {"\u2660", "\u2663", "\u2665", "\u2666"};
	String values[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
						"J", "Q", "K"};
	ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		this.makeDeck();
	}
	public void makeDeck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deck.add(new Card(suits[i], values[j]));
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	public String toString() {
		return deck.toString();
	}
}
