package restaurantmenus;

public abstract class RestaurantMenu {
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
	
	public abstract void printInfo(); 
}