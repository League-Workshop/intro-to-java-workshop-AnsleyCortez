package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String input = JOptionPane.showInputDialog("Do you know how to write a code?");
		// 2. If they say "yes", tell them they will rule the world.
JOptionPane.showMessageDialog(null, "You will rule the world!");
		// 3. Otherwise, wish them good luck washing dishes.
JOptionPane.showMessageDialog(null, "If not, good luck washing dishes!");
	}
}

