 package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.PriceRormatException;
import manager.RestaurantMenuManager;
import restaurantmenus.*;

public class MenuAdderListener implements ActionListener {
	JTextField fieldName;
	JTextField fieldPrice;
	JTextField fieldSpicy;
	
	RestaurantMenuManager restaurantMenuManager;
	
	public MenuAdderListener(JTextField fieldName, 
			JTextField fieldPrice, 
			JTextField fieldSpicy,
			RestaurantMenuManager restaurantMenuManager) {
		this.fieldName = fieldName;
		this.fieldPrice = fieldPrice;
		this.fieldSpicy = fieldSpicy;
		this.restaurantMenuManager = restaurantMenuManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print("\n");
		MenusInput menus = new DefaultMenus(MenuKind.Steak); 
		try {
			menus.setName(fieldName.getName());
			menus.setPrice(Integer.parseInt(fieldPrice.getText()));
			menus.setSpicy(Integer.parseInt(fieldSpicy.getText()));
			restaurantMenuManager.addMenu(menus);
			putObject(restaurantMenuManager, "restaurantMenuManager.ser");
			menus.printInfo();
		} catch (NumberFormatException | PriceRormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(RestaurantMenuManager restaurantMenuManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(restaurantMenuManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
