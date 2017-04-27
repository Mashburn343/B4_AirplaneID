import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AirplaneQuestions extends JFrame {

	JLabel engineType = new JLabel("Engine Type");
	JComboBox<String> type = new JComboBox<String>();

	JLabel engineNumber = new JLabel("Number of Engines");
	JComboBox<String> number = new JComboBox<String>();

	JLabel engineLocation = new JLabel("Location of engine(s)");
	JComboBox<String> location = new JComboBox<String>();
	
	JButton submitButton = new JButton("Submit");

	//test
	
	// Ask questions about the airplane you are looking at:
	// 1. "What type of engine (Propeller or Jet?"
	// 2. "How many engines (1,2,3,5)?"
	// 3. "Location of engine(s) (nose, body, wings, tail)?"

	public void populateStrings(){
		
		type.addItem("Jet");
		type.addItem("Propeller");
		
	}
	
	public void createGUI() {

		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		engineType.setPreferredSize(new Dimension (150,25));
		constraints = new GridBagConstraints();
		constraints.gridx = 0 ;
		constraints.gridy = 0 ;
		constraints.insets = new Insets(10,0,0,0);
		add(engineType, constraints);
		
		engineNumber.setPreferredSize(new Dimension (150,25));
		constraints = new GridBagConstraints();
		constraints.gridx = 1 ;
		constraints.gridy = 0 ;
		constraints.insets = new Insets(10,0,0,0);
		add(engineNumber, constraints);
		
		engineLocation.setPreferredSize(new Dimension (150,25));
		constraints = new GridBagConstraints();
		constraints.gridx = 2 ;
		constraints.gridy = 0 ;
		constraints.insets = new Insets(10,0,0,0);
		add(engineLocation, constraints);
		
		type.setPreferredSize(new Dimension (150,25));
		constraints = new GridBagConstraints();
		constraints.gridx = 0 ;
		constraints.gridy = 1 ;
		constraints.insets = new Insets(10,10,10,10);
		add(type, constraints);
		
		number.setPreferredSize(new Dimension (150,25));
		constraints = new GridBagConstraints();
		constraints.gridx = 1 ;
		constraints.gridy = 1 ;
		constraints.insets = new Insets(10,10,10,10);
		add(number, constraints);
		
		location.setPreferredSize(new Dimension (150,25));
		constraints = new GridBagConstraints();
		constraints.gridx = 2 ;
		constraints.gridy = 1 ;
		constraints.insets = new Insets(10,10,10,10);
		add(location, constraints);
		
		submitButton.setSize(125,25);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.insets = new Insets(10,10,10,10);
		add(submitButton, constraints);
		
		type.addItem("Proppeller");
		type.addItem("Jet");
		
		number.addItem("1");
		number.addItem("2");
		number.addItem("3");
		number.addItem("4");
		
		location.addItem("Nose");
		location.addItem("Body");
		location.addItem("Tail");
		location.addItem("Wings");
		
		
		//pack();
		setTitle("Airplane ID");
		setSize(600, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
