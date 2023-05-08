import java.util.Scanner;

import restaurantmenus.MenuKind;
import restaurantmenus.RestaurantMenu;
import restaurantmenus.Setmenus;
import restaurantmenus.Sidemenus;
import java.util.ArrayList;

public class RestaurantMenuManager {
	ArrayList<RestaurantMenu> restaurantMenus = new ArrayList<RestaurantMenu>();
	Scanner input;
	RestaurantMenuManager(Scanner input){
		this.input = input;
	}
	
	public void addMenu() { 
		int kind = 0;
		RestaurantMenu restaurantMenu;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			System.out.println("1. Set");
			System.out.println("2. Steak");
			System.out.println("3. Pilaf");
			System.out.println("4. Pasta");
			System.out.println("5. Side");
			System.out.print("Select num Restaurant menu Kind between 1~5: ");
			kind = input.nextInt();
			if (kind == 1) {
				restaurantMenu = new Setmenus(MenuKind.Set);
				restaurantMenu.getUserInput(input);
				restaurantMenus.add(restaurantMenu);
				break;
			}
			else if(kind == 2) {
				restaurantMenu = new RestaurantMenu(MenuKind.Steak);
				restaurantMenu.getUserInput(input);
				restaurantMenus.add(restaurantMenu);
				break;
			}
			else if(kind == 3) {
				restaurantMenu = new RestaurantMenu(MenuKind.Pilaf);
				restaurantMenu.getUserInput(input);
				restaurantMenus.add(restaurantMenu);
				break;
			}
			else if(kind == 4) {
				restaurantMenu = new RestaurantMenu(MenuKind.Pasta);
				restaurantMenu.getUserInput(input);
				restaurantMenus.add(restaurantMenu);
				break;
			}
			else if(kind == 5) {
				restaurantMenu = new Sidemenus(MenuKind.Side);
				restaurantMenu.getUserInput(input);
				restaurantMenus.add(restaurantMenu);
				break;
			}
			else {
				System.out.print("Select num Restaurant menu Kind between 1~5 ");
			}
		}
	}
	
	public void deleteMenu() { 
		System.out.println("Restaurant menu name: ");
		input.nextLine();
		String menuName = input.nextLine();
		int index = -1;
		for(int i =0; i<restaurantMenus.size();i++) {
			if (restaurantMenus.get(i).getName().equals(menuName)) {
				index = i;
				break;
			}
		}
		if (index>=0) {
			restaurantMenus.remove(index);
			System.out.println("the "+menuName+ " is deleted.");
		}
		else {
			System.out.println("the restaurant menu has not been registered.");
			return;
		}
	}
	
	public void editMenu() {
		System.out.println("Restaurant menu name: ");
		input.nextLine();
		String menuName = input.nextLine();
		for (int i = 0; i<restaurantMenus.size();i++) {
			RestaurantMenu restaurantMenu = restaurantMenus.get(i);
			if(restaurantMenu.getName().equals(menuName)) {
				int num = -1;
				while(num != 4) {
					System.out.println("** Restaurant Menu Info Edit Menu **");
					System.out.println("1. Edit Name");
					System.out.println("2. Edit Price");
					System.out.println("3. Edit Spicy");
					System.out.println("4. Exit");
					System.out.println("Select onr number between 1 - 4: ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Restaurant Menu name: ");
						String name = input.nextLine();
						restaurantMenu.setName(name);
					}
					else if (num == 2){
						System.out.print("Restaurant Menu price: ");
						int price = input.nextInt();
						restaurantMenu.setPrice(price);
					}
					else if (num == 3){
						System.out.print("Restaurant Menu spicy: ");
						int spicy = input.nextInt();
						restaurantMenu.setSpicy(spicy);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewMenus() { 
		System.out.println("# of registered restaurant menus: "+ restaurantMenus.size());
		for (int i=0; i<restaurantMenus.size();i++) {
			restaurantMenus.get(i).printInfo();
		}
	}
}
