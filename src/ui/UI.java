package ui;

import javax.swing.*;

public class UI extends JFrame {
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JLabel label = new JLabel();
		add(label);
		pack();
		setVisible(true);
	}
}
