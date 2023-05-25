import java.util.InputMismatchException;
import java.util.Scanner;
import exception.PriceRormatException;
import log.EventLogger;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Menu {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		RestaurantMenuManager restaurantMenuManager = getObject("restaurantMenuManager.ser");
		if(restaurantMenuManager == null) {
			restaurantMenuManager = new RestaurantMenuManager(input);
		}
		
		selecttMenu(input, restaurantMenuManager);
		putObject(restaurantMenuManager, "restaurantMenuManager.ser");
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
					logger.log("add a restaurant menu");
					break;
				case 2:
					restaurantMenuManager.deleteMenu();
					logger.log("delete a restaurant menu");
					break;
				case 3:
					restaurantMenuManager.editMenu();
					logger.log("edit a restaurant menu");
					break;
				case 4:
					restaurantMenuManager.viewMenus();
					logger.log("view a list of restaurant menu");
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