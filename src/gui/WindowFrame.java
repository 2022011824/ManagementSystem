package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.RestaurantMenuManager;
import gui.RestaurantMenuView;

public class WindowFrame extends JFrame{
	
	RestaurantMenuManager restaurantMenuManager;
	
	MenuSelection menuSelection;
	MenuAdder menuAdder;
	RestaurantMenuView restaurantMenuView;
	

	public WindowFrame(RestaurantMenuManager restaurantMenuManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.restaurantMenuManager = restaurantMenuManager;
		this.menuSelection= new MenuSelection(this);
		this.menuAdder = new MenuAdder(this, this.restaurantMenuManager);
		this.restaurantMenuView = new RestaurantMenuView(this,this.restaurantMenuManager);
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public MenuAdder getMenuAdder() {
		return menuAdder;
	}

	public void setMenuAdder(MenuAdder menuAdder) {
		this.menuAdder = menuAdder;
	}

	public RestaurantMenuView getRestaurantMenuView() {
		return restaurantMenuView;
	}

	public void setRestaurantMenuView(RestaurantMenuView restaurantMenuView) {
		this.restaurantMenuView = restaurantMenuView;
	}
}
