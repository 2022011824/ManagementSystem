package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import exception.PriceRormatException;
import restaurantmenus.DefaultMenus;
import restaurantmenus.MenuKind;
import restaurantmenus.MenusInput;
import restaurantmenus.RestaurantMenu;
import restaurantmenus.Setmenus;
import restaurantmenus.Sidemenus;
public class RestaurantMenuManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6908573159063832509L;

	ArrayList<MenusInput> restaurantMenus = new ArrayList<MenusInput>();
	transient Scanner input;
	RestaurantMenuManager(Scanner input){
		this.input = input;
	}
	
	public void addMenu(String kind, String name, int price, int spicy ) {
		MenusInput menusInput = new DefaultMenus(MenuKind.Steak);
		menusInput.getUserInput(input);
		restaurantMenus.add(menusInput);
	}
	
	public void addMenu(MenusInput menusInput) {
		restaurantMenus.add(menusInput);
	}
	
	public void addMenu() { 
		int kind = 0;
		MenusInput menusInput;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				kind =  -1;
			}
		}
	}
	
	public void deleteMenu() { 
		System.out.println("Restaurant menu name: ");
		input.nextLine();
		String menuName = input.nextLine();
		int index = findIndex(menuName);
		removefromMenu(index, menuName);
	}
	
	public int findIndex(String menuName) {
		int index = -1;
		for(int i =0; i<restaurantMenus.size();i++) {
			if (restaurantMenus.get(i).getName().equals(menuName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromMenu(int index, String menuName) {
		if (index>=0) {
			restaurantMenus.remove(index);
			System.out.println("the "+menuName+ " is deleted.");
			return 1;
		}
		else {
			System.out.println("the restaurant menu has not been registered.");
			return -1;
		}
	}
	public void editMenu() throws PriceRormatException {
		System.out.println("Restaurant menu name: ");
		input.nextLine();
		String menuName = input.nextLine();
		for (int i = 0; i<restaurantMenus.size();i++) {
			MenusInput menusInput = restaurantMenus.get(i);
			if(menusInput.getName().equals(menuName)) {
				int num = -1;
				while(num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						menusInput.setMenuName(input);
						break;
					case 2:
						menusInput.setMenuPrice(input);
						break;
					case 3:
						menusInput.setMenuSpicy(input);
						break;
					default:
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
	
	public int size() {
		return restaurantMenus.size();
	}
	
	public MenusInput get(int index) {
		return (RestaurantMenu) restaurantMenus.get(index);
	}
	public void showEditMenu() {
		System.out.println("** Restaurant Menu Info Edit Menu **");
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Price");
		System.out.println("3. Edit Spicy");
		System.out.println("4. Exit");
		System.out.println("Select one number between 1 - 4: ");
	}
}