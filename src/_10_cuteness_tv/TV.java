package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TV implements ActionListener {
	static JButton yoyo = new JButton();
	static JButton yeeet = new JButton();
	static JButton bruh = new JButton();
public static void main(String[] args) {

	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	frame.setVisible(true);
	
	TV yay = new TV();
	
	yay.addactionlistener();
	
frame.add(panel);
panel.add(yoyo);
yoyo.setText("Frog");

frame.add(panel);
panel.add(yeeet);
yeeet.setText("Duck");

frame.add(panel);
panel.add(bruh);
bruh.setText("Unicorns");
	
	
	
	
}
	
	
	
	
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	void addactionlistener() {
		yoyo.addActionListener(this);
		yeeet.addActionListener(this);
		bruh.addActionListener(this);
}






	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == yoyo) {
		showFrog();}
		if (e.getSource() == yeeet) {
			showDucks();}
			if (e.getSource() == bruh) {
				showFluffyUnicorns();}
	}	
	}	
	
		

