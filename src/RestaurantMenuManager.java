import java.util.Scanner;

public class RestaurantMenuManager {
	RestaurantMenu restaurantMenu;
	Scanner input;
	RestaurantMenuManager(Scanner input){
		this.input = input;
	}
	public void addMenu() { //함수 addMenu 정의
		restaurantMenu = new RestaurantMenu();
		System.out.println("Restaurant menu type(pasta/pizza/side): ");
		input.nextLine();
		restaurantMenu.type = input.nextLine();
		//Restaurant menu type(pasta/pizza/side)을 문자열 변수 menuType에 대입
		System.out.println("Restaurant menu name: ");
		restaurantMenu.name = input.nextLine();
		//Restaurant menu name을 문자열 변수 menuName에 대입
		System.out.println("Restaurant menu price(Won): ");
		restaurantMenu.price = input.nextInt();
		//Restaurant menu price를 정수형 변수 menuPrice에 대입
	}
	
	public void deleteMenu() { //함수 deletMenu 정의
		System.out.println("Restaurant menu name: ");
		input.nextLine();
		String menuName = input.nextLine();
		//Restaurant menu name을 문자열 변수 menuName에 대입
		if (restaurantMenu == null) {
			System.out.println("the restaurant menu has not been registered.");
			return;
		}
		menuName = restaurantMenu.name;
		if(restaurantMenu.name == menuName) {
			restaurantMenu = null;
			System.out.println("the restaurant menu is delete.");
		}
	}
	
	public void viewMenu() { //함수 viewFullMenu 정의
		System.out.println("Restaurant menu name:");
		input.nextLine();
		String menuName = input.nextLine();
		menuName = restaurantMenu.name;
		if(restaurantMenu.name == menuName) {
			restaurantMenu.printInfo();
		}
	}
}
