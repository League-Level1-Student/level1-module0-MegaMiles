package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot sob = new Robot();
	public void run() {
	sob.setSpeed(100);
	sob.setY(450);
	sob.setX(50);
	sob.penDown();	
for (int i = 0; i < 10; i++) {
	builder();
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	 void builder() {
	sob.move(300);	
	sob.turn(90);	
	sob.move(50);	
	sob.turn(90);	
	sob.move(300);
	sob.turn(-90);
	sob.setPenColor(Color.green);
	sob.move(30);
	sob.setPenColor(Color.black);
	sob.turn(-90);
	 }





}
