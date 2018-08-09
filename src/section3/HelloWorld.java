package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"Iris");
	String input = JOptionPane.showInputDialog("What is your favorite number?");
	JOptionPane.showMessageDialog(null, input);
	
}

}
