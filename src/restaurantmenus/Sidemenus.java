package restaurantmenus;
import java.util.Scanner;


public class Sidemenus extends RestaurantMenu implements MenusInput {
	
	public Sidemenus(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant menu name: ");
		input.nextLine();
		String name = input.nextLine();
		this.name = name;
		
		System.out.println("Restaurant menu price(Won): ");
		int price = input.nextInt();
		this.price = price;
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("Is this menu spicy? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Spicy Level(1~5): ");
				int spicy = input.nextInt();
				this.spicy = spicy;
			}
			else if(answer == 'n' || answer == 'N') {
				this.spicy = 0;
			}
			else {
				
			}
		}
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Set:
			skind = "Set";
			break;
		case Steak:
			skind = "Steak";
			break;
		case Pilaf:
			skind = "Pilaf";
			break;
		case Pasta:
			skind = "Pasta";
			break;
		case Side:
			skind = "Side";
			break;
		default:
		}
		System.out.println("---------------------");
		System.out.println("kind:"+skind+"\nmain:" +name+ "\nprice:"+price +"\nspicy:"+spicy);
		System.out.println("---------------------");
	}
}
