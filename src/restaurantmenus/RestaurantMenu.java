package restaurantmenus;

import java.util.Scanner;

public class RestaurantMenu {
	protected MenuKind kind = MenuKind.Steak; 
	protected String name;
	protected int price;
	protected int spicy;
	protected String drink = "none";
	
	public RestaurantMenu() {
	}
	
	public RestaurantMenu(MenuKind kind) {
		this.kind = kind;
	}
	
	public RestaurantMenu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public RestaurantMenu(String name, int price, int spicy) {
		this.name = name;
		this.price = price;
		this.spicy = spicy;
	}
	
	public RestaurantMenu(MenuKind kind, String name, int price, int spicy) {
		this.kind = kind;
		this.name = name;
		this.price = price;
		this.spicy = spicy;
	}
	
	public RestaurantMenu(MenuKind kind, String name, int price, int spicy, String drink) {
		this.kind = kind;
		this.name = name;
		this.price = price;
		this.spicy = spicy;
		this.drink = drink;
	}
	public MenuKind getKind() {
		return kind;
	}

	public void setKind(MenuKind kind) {
		this.kind = kind;
	}
	
	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpicy() {
		return spicy;
	}

	public void setSpicy(int spicy) {
		this.spicy = spicy;
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
	
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant menu name: ");
		input.nextLine();
		String name = input.nextLine();
		this.name = name;
		
		System.out.println("Restaurant menu price(Won): ");
		int price = input.nextInt();
		this.price = price;
		
		System.out.println("Restaurant menu spicy(Lv.1~5): ");
		int spicy = input.nextInt();
		this.spicy = spicy;
	}
}