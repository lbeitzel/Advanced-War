package controllers;

import models.*;



import java.util.ArrayList;
//heart ('\u2665'),
//diamond ('\u2666'),
//club ('\u2663'),
//spade ('\u2660')

/**
 * Created by paulharrington on 7/25/17.
 */

public class GameRunner {

    static final int NUMPLAYERS = 2;

    private Suit suits[];

    private Deck cards;

    private Player players[];


    public GameRunner(){
        this.suits = this.makeSuits();

        this.cards = new Deck(this.suits);

        this.initPlayers(this.cards);
    }

    private Player[] initPlayers(Deck cards){

        Deck deckOne = cards.createSubDeck(cards.numCards / NUMPLAYERS);

        this.players[] = { new Player("Lucas", deckOne), new Player("Paul", cards) };

    }

    private Suit[] makeSuits(){
        Suit suits[] = {
                new Suit("\u2665", "Hearts"),
                new Suit("\u2660", "Spades"),
                new Suit("\u2666", "Diamonds"),
                new Suit("\u2663", "Clubs"),
        };
        return suits;
    }
}
