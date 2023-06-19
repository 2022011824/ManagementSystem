package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import gui.RestaurantMenuView;
import gui.WindowFrame;
import manager.RestaurantMenuManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		RestaurantMenuView restaurantMenuView = frame.getRestaurantMenuView();
		RestaurantMenuManager restaurantMenuManager = getObject("restaurantMenuManager.ser");
		restaurantMenuView.setRestaurantMenuManager(restaurantMenuManager);
		
		JButton b = (JButton) e.getSource();
		frame.getContentPane().removeAll();
		frame.getContentPane().add(restaurantMenuView);
		frame.revalidate();
		frame.repaint();
	}
	
	public static RestaurantMenuManager getObject(String fileName) {
		RestaurantMenuManager restaurantMenuManager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			restaurantMenuManager = (RestaurantMenuManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return restaurantMenuManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return restaurantMenuManager;
	}
}