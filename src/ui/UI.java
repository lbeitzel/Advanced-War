package ui;

import javax.swing.*;

import model.Deck;

public class UI extends JFrame {
	public UI() {
		Deck d = new Deck();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		System.out.println("\u2666");
		d.shuffle();
		JLabel label = new JLabel(d.toString());
		add(label);
		pack();
		setVisible(true);
	}
}
