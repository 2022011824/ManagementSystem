package restaurantmenus;

import java.util.Scanner;

public class Sidemenus extends RestaurantMenu {
	
	public Sidemenus(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuPrice(input);
		setMenuSpicyYN(input);
	}
	
	public void setMenuSpicyYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("Is this menu spicy? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setMenuSpicy(input);
			}
			else if(answer == 'n' || answer == 'N') {
				this.spicy = 0;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println("---------------------");
		System.out.println("kind:"+skind+"\nmain:" +name+ "\nprice:"+price +"\nspicy:"+spicy);
		System.out.println("---------------------");
	}
}
