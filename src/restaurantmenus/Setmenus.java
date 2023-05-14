package restaurantmenus;
import java.util.Scanner;


public class Setmenus extends RestaurantMenu implements MenusInput {
	protected String mainMenuName;
	protected String drinkMenuName;
	public Setmenus(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant main menu name: ");
		input.nextLine();
		String name = input.nextLine();
		this.setName(name);
		
		System.out.println("Restaurant main menu price(Won): ");
		int price = input.nextInt();
		this.setPrice(price);
		
		System.out.println("Restaurant menu spicy(Lv.1~5): ");
		int spicy = input.nextInt();
		this.setSpicy(spicy);
		
		String answer = "none";
		String drink = "none";
		
		while(!answer.equals("Ade") && !answer.equals("ade") && !answer.equals("Coke")&& !answer.equals("Coke")  ) {
			System.out.println("Which drink would you like on the set menu? (Ade or Coke)");
			input.nextLine();
			answer = input.nextLine();
			if(answer.equals("Ade")||answer.equals("ade")) {
				System.out.println("What kind of ade do you want?(Remon/Cherry): ");
				drink = input.nextLine();
				drinkMenuName = drink + " ade";
				this.setDrink(drinkMenuName);
				this.setPrice(price+2000);
			}
			else if(answer.equals("Coke")||answer.equals("coke")) {
				drinkMenuName = "Coke";
				this.setDrink(drinkMenuName);
				this.setPrice(price+1500);
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
		System.out.println("kind:"+skind+"\nmain:" +name+ "\ndrink:"+ drink+ "\nprice:"+price +"\nspicy:"+spicy);
		System.out.println("---------------------");
	}

}
