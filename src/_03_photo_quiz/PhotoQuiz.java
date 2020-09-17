package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String yay = "https://www.sideshow.com/storage/product-images/904599/iron-man-mark-lxxxv__silo.png";
		// 2. create a variable of type "Component" that will hold your image
Component yayay;
		// 3. use the "createImage()" method below to initialize your Component
yayay = createImage(yay);
		// 4. add the image to the quiz window
quizWindow.add(yayay);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String yayyayyayyay = JOptionPane.showInputDialog("Is this Mark 63?");
		// 7. print "CORRECT" if the user gave the right answer
if (yayyayyayyay.equalsIgnoreCase("No")) {
JOptionPane.showMessageDialog(null,"CORRECT CONGRADULATIONS!!!!!!");	
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null,"INCORECT Go study more iron man");	
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(yayay);
		// 10. find another image and create it (might take more than one line
		// of code)
String Hi = "https://www.sideshow.com/storage/product-images/903421/iron-man_marvel_silo.png";
		// 11. add the second image to the quiz window
Component bob;
bob = createImage(Hi);

quizWindow.add(bob);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String Jeff = JOptionPane.showInputDialog("Is this suit of armour nicknamed the bleeding edge armour?");
		// 14+ check answer, say if correct or incorrect, etc.
if (Jeff.equalsIgnoreCase("Yes")) {
JOptionPane.showMessageDialog(null,"You got it correct CONGRADULATIONS!!!!!!!!!!!!");
}
else {
	JOptionPane.showMessageDialog(null,"You got it wrong booooo go study more iron man boooooooooooo");	
}
}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
