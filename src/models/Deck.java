package models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private String values[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
							   "J", "Q", "K"};
	private ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
	}
	
	public Deck(Suit suits[]) {
		deck = new ArrayList<Card>();
		this.makeDeck(suits);
		this.shuffle();
	}
	public void makeDeck(Suit suits[]) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deck.add(new Card(suits[i], values[j]));
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	public void addCard(Card card) {
		deck.add(card);
	}
	public Deck createSubDeck(int size) {
		Deck subDeck = new Deck();
		for(int i = 0; i < size; i++) {
			subDeck.addCard(deck.remove(0));
		}
		return subDeck;
	}
	public int numCards() {
		return deck.size();
	}
	@Override
	public String toString() {
		return deck.toString();
	}
}
