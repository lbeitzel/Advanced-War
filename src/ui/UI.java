package ui;

import javax.swing.*;

import models.Deck;

public class UI extends JFrame {
	public UI() {
		Deck deck = new Deck();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		System.out.println("\u2666");
		deck.shuffle();
		JLabel label = new JLabel(deck.toString());
		add(label);
		pack();
		setVisible(true);
	}
}