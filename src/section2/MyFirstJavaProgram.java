package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot LIV = new Robot();
		LIV.move(100);
		LIV.sparkle();
		LIV.setSpeed(100);
		LIV.penDown();
		LIV.setPenColor(Color.white);
		int sides = 5;
		int angle = 360 / sides;
		for (int i = 0; i < sides; i++) {
			LIV.move(100);
			LIV.turn(angle);

		}
	}
}