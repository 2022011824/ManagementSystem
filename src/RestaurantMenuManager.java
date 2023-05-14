import java.util.Scanner;

import restaurantmenus.DefaultMenus;
import restaurantmenus.MenuKind;
import restaurantmenus.MenusInput;
import restaurantmenus.RestaurantMenu;
import restaurantmenus.Setmenus;
import restaurantmenus.Sidemenus;
import java.util.ArrayList;

public class RestaurantMenuManager {
	ArrayList<MenusInput> restaurantMenus = new ArrayList<MenusInput>();
	Scanner input;
	RestaurantMenuManager(Scanner input){
		this.input = input;
	}
	
	public void addMenu() { 
		int kind = 0;
		MenusInput menusInput;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			System.out.println("1. Set");
			System.out.println("2. Steak");
			System.out.println("3. Pilaf");
			System.out.println("4. Pasta");
			System.out.println("5. Side");
			System.out.print("Select num Restaurant menu Kind between 1~5: ");
			kind = input.nextInt();
			if (kind == 1) {
				menusInput = new Setmenus(MenuKind.Set);
				menusInput.getUserInput(input);
				restaurantMenus.add(menusInput);
				break;
			}
			else if(kind == 2) {
				menusInput = new DefaultMenus(MenuKind.Steak);
				menusInput.getUserInput(input);
				restaurantMenus.add(menusInput);
				break;
			}
			else if(kind == 3) {
				menusInput = new DefaultMenus(MenuKind.Pilaf);
				menusInput.getUserInput(input);
				restaurantMenus.add(menusInput);
				break;
			}
			else if(kind == 4) {
				menusInput = new DefaultMenus(MenuKind.Pasta);
				menusInput.getUserInput(input);
				restaurantMenus.add(menusInput);
				break;
			}
			else if(kind == 5) {
				menusInput = new Sidemenus(MenuKind.Side);
				menusInput.getUserInput(input);
				restaurantMenus.add(menusInput);
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
			MenusInput menusInput = restaurantMenus.get(i);
			if(menusInput.getName().equals(menuName)) {
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
						menusInput.setName(name);
					}
					else if (num == 2){
						System.out.print("Restaurant Menu price: ");
						int price = input.nextInt();
						menusInput.setPrice(price);
					}
					else if (num == 3){
						System.out.print("Restaurant Menu spicy: ");
						int spicy = input.nextInt();
						menusInput.setSpicy(spicy);
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
