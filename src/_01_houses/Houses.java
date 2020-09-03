package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot sob = new Robot();
	public void run() {
	sob.setSpeed(100);
	sob.setY(450);
	sob.setX(50);
	sob.penDown();
	Random lol = new Random();
for (int i = 0; i < 10; i++) {
	int yay = lol.nextInt(3);
	if (yay==0) {
		drawpointyroof("small",Color.BLUE);	}
	
	if (yay==1) {
		drawpointyroof("medium",Color.RED);	
	}
	if (yay==2) {
		drawFlatroof("large",Color.GREEN);	
	}
}
	}
	int househeight = 100;
	 void drawpointyroof(String height, Color c) {
	if (height.equals("small")) {
	 househeight = 60;	
	}
	if (height.equals("medium")) {
		 househeight = 120;	
		}
	if (height.equals("large")) {
		 househeight = 250;	
		}
	sob.setRandomPenColor();
	sob.move(househeight);	
	sob.turn(45);	
	sob.move(30);	
	sob.turn(90);
	sob.move(30);
	sob.turn(45);
	sob.move(househeight);
	sob.turn(-90);
	sob.setPenColor(Color.green);
	sob.move(30);
	sob.setPenColor(Color.black);
	sob.turn(-90);
	 }
	 void drawFlatroof(String height, Color c) {
			if (height.equals("small")) {
			 househeight = 60;	
			}
			if (height.equals("medium")) {
				 househeight = 120;	
				}
			if (height.equals("large")) {
				 househeight = 250;	
				}
			sob.setRandomPenColor();
			sob.move(househeight);	
			sob.turn(90);	
			sob.move(50);	
			sob.turn(90);
			sob.move(househeight);
			sob.turn(-90);
			sob.setPenColor(Color.green);
			sob.move(30);
			sob.setPenColor(Color.black);
			sob.turn(-90);
			 }
}
