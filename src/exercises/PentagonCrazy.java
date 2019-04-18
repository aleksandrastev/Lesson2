package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot robi = new Robot();
		robi.penDown();
		int sides = 5;
		int angle = 360/sides;
		robi.setSpeed(10);
				
		for (int i = 0; i < 200; i++) {
			robi.move(i);
			robi.turn(angle + 1);
			robi.setRandomPenColor();
			robi.setPenWidth(i);
		}
	}

	
	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}