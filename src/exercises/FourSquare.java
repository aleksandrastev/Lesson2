package exercises;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	public static void main(String[] args) {
		
		Robot lisa = new Robot();
		lisa.penDown();
		lisa.setPenWidth(20);
		lisa.setSpeed(5);
		
		
		for (int i = 0; i < 4; i++) {
			lisa.setRandomPenColor();
			lisa.turn(90);
			
			for (int y = 0; y < 4; y++) {
				lisa.move(100);
				lisa.turn(90);
			}
		}
		
	}

}
