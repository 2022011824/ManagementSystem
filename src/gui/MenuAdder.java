package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import manager.Menu;
import manager.RestaurantMenuManager;

public class MenuAdder extends JPanel {
	
	WindowFrame frame;
	
	public MenuAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelKind = new JLabel("Add menu Kind: ", JLabel.TRAILING);
		JTextField fieldKind = new JTextField(10);
		labelKind.setLabelFor(fieldKind);
		panel.add(labelKind);
		panel.add(fieldKind);
		
		JLabel labelName = new JLabel("Main menu name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPrice = new JLabel("Main menu price: ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelSpicy = new JLabel("Main menu spicy(Lv.1~5):", JLabel.TRAILING);
		JTextField fieldSpicy = new JTextField(10);
		labelSpicy.setLabelFor(fieldSpicy);
		panel.add(labelSpicy); 
		panel.add(fieldSpicy);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}