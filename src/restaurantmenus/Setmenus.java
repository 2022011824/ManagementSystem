package restaurantmenus;

import java.util.Scanner;

import exception.PriceRormatException;

public class Setmenus extends RestaurantMenu {
	protected String mainMenuName;
	protected String drinkMenuName;
	public Setmenus(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuPrice(input);
		setMenuSpicy(input);
		setMenuDrinkYN(input);
		}
	
	public void setMenuDrinkYN(Scanner input) {
		String answer = "none";
		String drink = "none";
		
		while(!answer.equals("Ade") && !answer.equals("ade") && !answer.equals("Coke")&& !answer.equals("Coke")  ) {
			System.out.println("Which drink would you like on the set menu? (Ade or Coke)");
			input.nextLine();
			answer = input.nextLine();
			try {
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
			catch(PriceRormatException e) {
				System.out.println("Incorrect Price Format. put the price that contains 0");
			}
		}
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println("---------------------");
		System.out.println("kind:"+skind+"\nmain:" +name+ "\ndrink:"+ drink+ "\nprice:"+price +"\nspicy:"+spicy);
		System.out.println("---------------------");
	}
}
