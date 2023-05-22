package restaurantmenus;

import java.util.Scanner;

import exception.PriceRormatException;

public abstract class RestaurantMenu implements MenusInput {
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

	public void setPrice(int price) throws PriceRormatException {
		if (price%10 != 0) {
			throw new PriceRormatException();
		}
		this.price = price;
	}

	public int getSpicy() {
		return spicy;
	}

	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
	public abstract void printInfo();
	

	public void setMenuName(Scanner input) {
		System.out.print("Restaurant main menu name: ");
		input.nextLine();
		String name = input.nextLine();
		this.setName(name);
	}
	
	public void setMenuPrice(Scanner input) {
		int price = -1;
		while(price%10 != 0) {
			System.out.print("Restaurant Menu price: ");
			price = input.nextInt();
			try {
				this.setPrice(price);
			}
			catch (PriceRormatException e) {
				System.out.println("Incorrect Price Format. put the price that contains 0");
			}
		}
	}
	
	public void setMenuSpicy(Scanner input) {
		System.out.print("Restaurant Menu spicy(Lv.1~5): ");
		int spicy = input.nextInt();
		this.setSpicy(spicy);
	}
	
	public String getkindString() {
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
		return skind;
	}
}