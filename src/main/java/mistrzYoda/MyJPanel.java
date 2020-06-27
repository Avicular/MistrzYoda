package mistrzYoda;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class MyJPanel extends JPanel {
	public MyJPanel() {
		setLayout(null);
		String listaZ[] = { "Sith", "Jedi", "Vietnam", "Canada" };
		String listaMieczy[] = { "Czerwony", "Rozowy", "Niebieski", "Zielony" };

		JLabel label = new JLabel("Zakony Jedi");
		label.setBounds(210, 10, 100, 25);
		add(label);

		JList listaZakonow = new JList(listaZ);
		listaZakonow.setBounds(10, 50, 430, 300);
		listaZakonow.setSelectedIndex(0);
		add(listaZakonow);
		JLabel label2 = new JLabel("Rejestracja Zakonu Jedi");
		label2.setBounds(150, 360, 300, 25);
		add(label2);
		JLabel label3 = new JLabel("Nazwa:");
		label3.setBounds(20, 400, 100, 25);
		add(label3);
		JTextField text = new JTextField();
		text.setBounds(150, 400, 280, 25);
		add(text);
		JButton button = new JButton("Wybierz");
		button.setBounds(20, 430, 100, 25);
		add(button);
		JList listaJedi = new JList();
		listaJedi.setBounds(150, 450, 280, 100);
		listaJedi.setSelectedIndex(0);
		add(listaJedi);

		JTextField text2 = new JTextField("src/main/resources/tlo.jpg");
		text2.setEditable(false);
		text2.setBounds(150, 560, 280, 25);
		add(text2);
		JButton button1 = new JButton("Import");
		button1.setBounds(20, 540, 100, 25);
		add(button1);
		JButton button2 = new JButton("Export");
		button2.setBounds(20, 570, 100, 25);
		add(button2);
		JButton button3 = new JButton("Zarejestruj");
		button3.setBounds(170, 600, 120, 25);
		add(button3);
		JButton button4 = new JButton("Wyczysc");
		button4.setBounds(300, 600, 120, 25);
		add(button4);

		JLabel label4 = new JLabel("Jedi");
		label4.setBounds(650, 10, 100, 30);
		add(label4);

		JList listaJedi1 = new JList(listaZ);
		listaJedi1.setBounds(460, 50, 430, 300);
		listaJedi1.setSelectedIndex(0);
		add(listaJedi1);
		JLabel label5 = new JLabel("Rejestracja Jedi");
		label5.setBounds(620, 360, 300, 25);
		add(label5);
		JLabel label6 = new JLabel("Nazwa:");
		label6.setBounds(460, 400, 100, 25);
		add(label6);
		JTextField text1 = new JTextField();
		text1.setBounds(570, 400, 280, 25);
		add(text1);
		JLabel label7 = new JLabel("Kolor miecza:");
		label7.setBounds(460, 440, 100, 25);
		add(label7);
		JComboBox listaKolorowMieczy = new JComboBox(listaMieczy);
		listaKolorowMieczy.setBackground(new Color(211, 211, 211));
		listaKolorowMieczy.setBounds(570, 440, 280, 25);
		add(listaKolorowMieczy);
		JLabel label8 = new JLabel("Moc:");
		label8.setBounds(460, 480, 150, 25);
		add(label8);
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 1000, 500);
		slider.setMinorTickSpacing(50);
		slider.setMajorTickSpacing(200);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(570, 480, 280, 50);
		add(slider);
		JTextField text3 = new JTextField("src/main/resources/tlo.jpg");
		text3.setEditable(false);
		text3.setBounds(570, 560, 280, 25);
		add(text3);
		JButton button5 = new JButton("Import");
		button5.setBounds(460, 540, 100, 25);
		add(button5);
		JButton button6 = new JButton("Export");
		button6.setBounds(460, 570, 100, 25);
		add(button6);

		JLabel label9 = new JLabel("Strona mocy:");
		label9.setBounds(570, 532, 100, 25);
		add(label9);

		JRadioButton rb1 = new JRadioButton("Ciemna", false);
		rb1.setBounds(670, 530, 100, 30);
		add(rb1);
		JRadioButton rb2 = new JRadioButton("Jasna", false);
		rb2.setBounds(780, 530, 100, 30);
		add(rb2);
		if (rb1.isSelected())
			rb2.setSelected(false);
		else
			rb2.setSelected(true);

		JButton button7 = new JButton("Zarejestruj");
		button7.setBounds(580, 600, 120, 25);
		add(button7);
		JButton button8 = new JButton("Wyczysc");
		button8.setBounds(710, 600, 120, 25);
		add(button8);

//		Color tlo = new Color(211, 211, 211);
//		setBackground(tlo);

		Font font = new Font("Arial", Font.BOLD, 14);
		Font font2 = new Font("Arial", Font.BOLD, 12);
		for (Component comp : getComponents()) {
			if (comp instanceof JLabel) {
				((JLabel) comp).setFont(font);
			} else if (comp instanceof JButton) {
				((JButton) comp).setFont(font2);
				((JButton) comp).setBackground(new Color(211, 211, 211));
			} else if (comp instanceof JList) {
				((JList<?>) comp).setBorder(BorderFactory.createLineBorder(Color.black));
//			} else if (comp instanceof JCheckBox) {
//				((JCheckBox) comp).setFont(font);
//			} else if (comp instanceof JRadioButton) {
//				((JRadioButton) comp).setFont(font);
			}
		}

//        JLabel bg=new JLabel(new ImageIcon("src/main/resources/tlo.jpg"));
//        bg.setOpaque(true);
//        bg.setBounds(0,0,900,650);
//        add(bg);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(900, 650);
	}
}
