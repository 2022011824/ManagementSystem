package restaurantmenus;

import java.util.Scanner;

public interface MenusInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setPrice(int price);
	
	public void setSpicy(int spicy);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);

}
 