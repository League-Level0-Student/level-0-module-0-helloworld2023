package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Practice_Coding_Exam {
	
	public static void main(String[] args) {
		Robot hello = new Robot();
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw? (Red, Green, or Blue)");
		if (color.equalsIgnoreCase("red")) {
			hello.setPenColor(255,0,0);
		}
		else if (color.equalsIgnoreCase("green")) {
			hello.setPenColor(0,255,0);
		}
		else if (color.equalsIgnoreCase("blue")) {
			hello.setPenColor(0,0,255);
		}
		String shape = JOptionPane.showInputDialog("How many squares would you like the robot to draw?");
		int shapes = Integer.parseInt(shape);
		hello.penDown();
		hello.setSpeed(10);
		hello.setPenWidth(10);
		for (int i = 0; i < shapes; i++) {
		for (int h = 0; h < 4; h++) {
			hello.move(50);
			hello.turn(90);
			}
		hello.penUp();
		hello.turn(90);
		hello.move(80);
		hello.turn(270);
		hello.penDown();
		}
	}
}
