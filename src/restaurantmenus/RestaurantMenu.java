package restaurantmenus;

import java.util.Scanner;

public class RestaurantMenu {
	protected MenuKind kind = MenuKind.Steak; 
	protected String name;
	protected int price;
	protected int spicy;
	
	public RestaurantMenu() {
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
	public MenuKind getKind() {
		return kind;
	}

	public void setKind(MenuKind kind) {
		this.kind = kind;
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
		System.out.println("Restaurant menu name:"+name+" \nprice:"+price+"\nspicy:"+spicy);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant menu name: ");
		input.nextLine();
		String name = input.nextLine();
		this.setName(name);
		
		System.out.println("Restaurant menu price(Won): ");
		int price = input.nextInt();
		this.setPrice(price);
		
		System.out.println("Restaurant menu spicy(Lv.1~5): ");
		int spicy = input.nextInt();
		this.setSpicy(spicy);
	}
}
