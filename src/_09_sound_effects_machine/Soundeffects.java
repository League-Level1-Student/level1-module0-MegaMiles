package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Soundeffects implements ActionListener {
	public static void main(String[] args) {
		Soundeffects hi = new Soundeffects();
		hi.HIIII();
	}

	public void HIIII() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JButton button = new JButton();
		panel.add(button);
		frame.add(panel);
		button.addActionListener(this);
		
		JButton jeff = new JButton();
		panel.add(jeff);
		jeff.addActionListener(this);
		
		JButton hi = new JButton();
		panel.add(hi);
		hi.addActionListener(this);
		
		JButton yo = new JButton();
		panel.add(yo); 
		yo.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
