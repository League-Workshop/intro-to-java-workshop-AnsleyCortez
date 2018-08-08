package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot Liv  = new Robot ();
	void go() {
		// 4. Make the robot move as fast as possible
Liv.setSpeed(100);
		// 5. Set the pen width to 5
Liv.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i < 4; i++) {
			// 7. Set to random
	Liv.setPenColor(Color.CYAN) ;
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
Liv.turn(90);
	}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		Liv.penDown();
		for (int j = 0; j < 3; j++) {
			Liv.move(100);
			Liv.turn(360/4);
		}
	
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



