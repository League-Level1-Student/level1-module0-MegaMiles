package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Soundeffects implements ActionListener {
	JButton button = new JButton();
	JButton jeff = new JButton();
	JButton hi = new JButton();
	JButton Koolboi = new JButton();
	public static void main(String[] args) {
		Soundeffects hi = new Soundeffects();
		hi.HIIII();
	}

	public void YOYo() {
		for (int i = 0; i < 1000000000; i++) {
			playSound("pizza.wav");
		}	
	}
	
	public void HIIII() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.add(panel);
		button.addActionListener(this);
		panel.add(button);
		button.setText("100");
		
		panel.add(jeff);
		jeff.addActionListener(this);
		jeff.setText("200");
		
		panel.add(hi);
		hi.addActionListener(this);
		hi.setText("300");
		
		panel.add(Koolboi);
		Koolboi.addActionListener(this);
		Koolboi.setText("PIZZA");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (button == e.getSource()) {
		playSound("hi.mp3");
	}
	else if (jeff == e.getSource()) {
		playSound("pizza.wav");
	}
	else if (hi == e.getSource()) {
		playSound("yay.wav");
	}
	else if (Koolboi == e.getSource()) {
		YOYo();
	}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}	
}
