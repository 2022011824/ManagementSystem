package restaurantmenus;

import java.util.Scanner;
import exception.PriceRormatException;

public interface MenusInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setPrice(int price) throws PriceRormatException;
	
	public void setSpicy(int spicy);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);

	public void setMenuName(Scanner input) throws PriceRormatException;
	
	public void setMenuPrice(Scanner input);
	
	public void setMenuSpicy(Scanner input);
}
 