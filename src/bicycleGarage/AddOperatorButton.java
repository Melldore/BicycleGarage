package bicycleGarage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class AddOperatorButton extends JButton implements ActionListener{

	public AddOperatorButton(){
		super("Lägg till Operatörskonto");
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
}