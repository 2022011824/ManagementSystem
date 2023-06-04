package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RestaurantMenuView extends JFrame {
	
	public RestaurantMenuView(){
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("KIND");
		model.addColumn("NAME");
		model.addColumn("PRICE");
		model.addColumn("SPICY");
		model.addColumn("DRICK");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}