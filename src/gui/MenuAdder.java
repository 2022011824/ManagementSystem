package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import listeners.MenuAddCancelListener;
import listeners.MenuAdderListener;

import javax.swing.JTextField;
import manager.Menu;
import manager.RestaurantMenuManager;

public class MenuAdder extends JPanel {
	
	WindowFrame frame;
	RestaurantMenuManager restaurantMenuManager;
	
	public MenuAdder(WindowFrame frame, RestaurantMenuManager restaurantMenuManager) {
		this.frame = frame;
		this.restaurantMenuManager = restaurantMenuManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new MenuAdderListener(fieldName, fieldPrice, fieldSpicy, restaurantMenuManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new MenuAddCancelListener(frame));
		
		labelSpicy.setLabelFor(fieldSpicy);
		panel.add(labelSpicy); 
		panel.add(fieldSpicy);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}