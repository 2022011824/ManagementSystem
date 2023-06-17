package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import manager.*;
import javax.swing.JButton;
import gui.MenuAdder;
import gui.RestaurantMenuView;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		MenuAdder adder = frame.getMenuAdder();
		frame.setupPanel(adder);
	}
}