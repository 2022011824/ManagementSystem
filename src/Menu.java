import java.util.InputMismatchException;
import java.util.Scanner;

import exception.PriceRormatException;

public class Menu {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		RestaurantMenuManager restaurantMenuManager = new RestaurantMenuManager(input);
		
		selecttMenu(input, restaurantMenuManager);
	}
	
	public static void selecttMenu(Scanner input, RestaurantMenuManager restaurantMenuManager) {
		int num = -1; 
		while(num != 5) { 
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					restaurantMenuManager.addMenu();
					break;
				case 2:
					restaurantMenuManager.deleteMenu(); 
					break;
				case 3:
					restaurantMenuManager.editMenu(); 
					break;
				case 4:
					restaurantMenuManager.viewMenus(); 
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num =  -1;
			} catch (PriceRormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void showMenu() {
		System.out.println("*Restaurant Menu Management Menu");
		System.out.println("1. Add restaurant menu");
		System.out.println("2. Delete restaurant menu");
		System.out.println("3. Edit restaurant menu");
		System.out.println("4. View restaurant menu");
		System.out.println("5. Exit");
		System.out.print("Select one number 1-5:");
		
	}
}
