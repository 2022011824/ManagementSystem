package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import manager.*;
import javax.swing.JButton;
import gui.MenuAdder;
import gui.RestaurantMenuView;
import gui.WindowFrame;

public class MenuAddCancelListener implements ActionListener {
	
	WindowFrame frame;
	
	public MenuAddCancelListener(WindowFrame frame) {
		this.frame = frame; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	}
}