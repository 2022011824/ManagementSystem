
public class RestaurantMenu {
	String type;
	String name;
	int price;
	
	public RestaurantMenu() {
	}
	
	public RestaurantMenu(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public RestaurantMenu(String type, String name, int price) {
		this.type = type;
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("Restaurant menu type:"+type+"\nRestaurant menu name:"+name+" \nRestaurant menu price:"+price);
	}
}
