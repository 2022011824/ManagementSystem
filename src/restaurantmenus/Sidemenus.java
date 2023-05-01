package restaurantmenus;

import java.util.Scanner;

public class Sidemenus extends RestaurantMenu {
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant menu name: ");
		input.nextLine();
		String name = input.nextLine();
		this.setName(name);
		
		System.out.println("Restaurant menu price(Won): ");
		int price = input.nextInt();
		this.setPrice(price);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("Is this menu spicy? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Spicy Level(1~5): ");
				int spicy = input.nextInt();
				this.setSpicy(spicy);
			}
			else if(answer == 'n' || answer == 'N') {
				this.setSpicy(0);
			}
			else {
				
			}
		}
	}
}
