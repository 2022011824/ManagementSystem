package restaurantmenus;

import java.util.Scanner;

public class DefaultMenus extends RestaurantMenu {
	
	public DefaultMenus(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuPrice(input);
		setMenuSpicy(input);
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println("---------------------");
		System.out.println("kind:"+skind+"\nmain:" +name+ "\nprice:"+price +"\nspicy:"+spicy);
		System.out.println("---------------------");
	}
}