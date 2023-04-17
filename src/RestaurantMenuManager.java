import java.util.Scanner;
import java.util.ArrayList;

public class RestaurantMenuManager {
	ArrayList<RestaurantMenu> restaurantMenus = new ArrayList<RestaurantMenu>();
	Scanner input;
	RestaurantMenuManager(Scanner input){
		this.input = input;
	}
	public void addMenu() { 
		RestaurantMenu restaurantMenu = new RestaurantMenu();
		System.out.println("Restaurant menu type(pasta/pizza/side): ");
		input.nextLine();
		restaurantMenu.type = input.nextLine();
		System.out.println("Restaurant menu name: ");
		restaurantMenu.name = input.nextLine();
		System.out.println("Restaurant menu price(Won): ");
		restaurantMenu.price = input.nextInt();
		restaurantMenus.add(restaurantMenu);
	}
	
	public void deleteMenu() { 
		System.out.println("Restaurant menu name: ");
		input.nextLine();
		String menuName = input.nextLine();
		int index = -1;
		for(int i =0; i<restaurantMenus.size();i++) {
			if (restaurantMenus.get(i).name.equals(menuName)) {
				index = i;
				break;
			}
		}
		if (index>=0) {
			restaurantMenus.remove(index);
			System.out.println("the"+menuName+ "is deleted.");
		}
		else {
			System.out.println("the restaurant menu has not been registered.");
			return;
		}
	}
	
	public void viewMenu() { 
		for (int i=0; i<restaurantMenus.size();i++) {
			restaurantMenus.get(i).printInfo();
		}
	}
}
