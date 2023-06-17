package restaurantmenus;

import java.util.Scanner;
import exception.PriceRormatException;

public interface MenusInput {
	
	public void setKind(MenuKind kind);
	
	public MenuKind getKind();
	
	public void setName(String name);
	
	public String getName();
	
	public void setPrice(int price) throws PriceRormatException;
	
	public int getPrice();
	
	public void setSpicy(int spicy);
	
	public int getSpicy();
	
	public String getDrink();

	public void printInfo();
	
	public void getUserInput(Scanner input);

	public void setMenuName(Scanner input) throws PriceRormatException;
	
	public void setMenuPrice(Scanner input);
	
	public void setMenuSpicy(Scanner input);
}
 