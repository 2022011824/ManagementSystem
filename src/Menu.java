import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		RestaurantMenuManager restaurantMenuManager = new RestaurantMenuManager(input);
		
		int num = -1; 
		
		while(num != 5) { 
			System.out.println("*Restaurant Menu Management Menu");
			System.out.println("1. Add restaurant menu");
			System.out.println("2. Delete restaurant menu");
			System.out.println("3. Edit restaurant menu");
			System.out.println("4. View restaurant menu");
			System.out.println("5. Exit");
			System.out.print("Select one number 1-5:");
			num = input.nextInt();
			
			
			if(num == 1) 
				restaurantMenuManager.addMenu(); 
			if(num == 2) 
				restaurantMenuManager.deleteMenu(); 
			if(num == 3)
				restaurantMenuManager.editMenu(); 
			if(num == 4)
				restaurantMenuManager.viewMenus(); 
			if(num == 5) 
				continue; 
		}
	}		
}
