package mistrzYoda;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame window1 = new JFrame("System zarządzania Jedi");
		ImageIcon imgicon = new ImageIcon("src/main/resources/yoda.jpg");

		MyJPanel panel = new MyJPanel();

		window1.add(panel);
		window1.setIconImage(imgicon.getImage());
		window1.setLocation(200, 20);
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window1.setVisible(true);
		window1.pack();

	}

}