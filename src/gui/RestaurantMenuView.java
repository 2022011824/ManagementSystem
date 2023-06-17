package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manager.Menu;
import manager.RestaurantMenuManager;
import restaurantmenus.MenusInput;
import java.util.Vector;

public class RestaurantMenuView extends JPanel {
	
	WindowFrame frame;
	
	RestaurantMenuManager restaurantMenuManager;
	
	public RestaurantMenuView(WindowFrame frame,RestaurantMenuManager restaurantMenuManager){
		this.frame = frame;
		this.restaurantMenuManager = restaurantMenuManager;
		
		System.out.println("***"+ restaurantMenuManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("KIND");
		model.addColumn("NAME");
		model.addColumn("PRICE"); 
		model.addColumn("SPICY");
		model.addColumn("DRInK");
		
		for (int i=0; i<restaurantMenuManager.size(); i++) {
			Vector row = new Vector();
			MenusInput mi = restaurantMenuManager.get(i);
			row.add(mi.getKind());
			row.add(mi.getName());
			row.add(mi.getPrice());
			row.add(mi.getSpicy());
			row.add(mi.getDrink());
			model.addRow(row);
			
		}
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}