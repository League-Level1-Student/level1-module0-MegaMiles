package _08_jack_in_the_box;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JackInTheBox implements ActionListener {
int num = 0;
	public static void main(String[] args) {
JackInTheBox wohoo = new JackInTheBox();
wohoo.setup();


}

private void showPicture(String fileName) {
    try {
        JLabel imageLabel = createLabelImage(fileName);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(imageLabel);
        frame.setVisible(true);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private JLabel createLabelImage(String fileName) {
	try {
            URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
	       System.err.println("Could not find image " + fileName);
	       return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
            }
        } catch (Exception e) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
}
public void setup() {
	JFrame yay = new JFrame();
	yay.setVisible(true);
	JButton button = new JButton();
	yay.add(button);
	yay.pack();
	button.addActionListener(this);	
}

@Override
public void actionPerformed(ActionEvent e) {
	num ++;
	if (num == 5) {
		showPicture("jackInTheBox.png");
	}
	
}







}