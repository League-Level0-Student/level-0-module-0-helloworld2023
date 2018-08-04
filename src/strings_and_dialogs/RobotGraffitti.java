package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffitti {

	public static void main(String[] args) {

		Robot avery = new Robot();
		avery.setSpeed(100);
		avery.penDown();
		avery.turn(25);
		avery.move(200);
		avery.turn(180 - 50);
		avery.move(200);
		avery.turn(180);
		avery.move(100);
		avery.turn(300);
		avery.move(80);
		avery.hide();
	}

}
