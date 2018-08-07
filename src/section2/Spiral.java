package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Robot = new Robot();
		// 5. Set your robot's pen down
		Robot.penDown();
		// 3. Set the robot to go at max speed (100)
		Robot.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {

			// 7. Change the pen color to random
			Robot.setPenColor(Color.PINK);
			Robot.move(i*5);
			// 2. Turn the robot 360/7 degrees to the right
			Robot.turn(360 / 7);
			// 8. Set the pen width to i
			Robot.setPenWidth(i);
		}
	}
}