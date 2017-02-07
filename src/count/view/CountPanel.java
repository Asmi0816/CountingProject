package count.view;
import javax.swing.*;
import count.controller.CountController;
import java.awt.Dimension;
import java.awt.event.*;


public class CountPanel extends JPanel
{
	private CountController baseController;
	private SpringLayout baseLayout;
	private JButton fibButton;
	private JButton factButton;
	private JTextField inputField;
	private JTextArea userArea;
	
	
	
	public CountPanel(CountController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.fibButton = new JButton("Fib Button");
		this.factButton = new JButton("Fact Button");
		this.inputField = new JTextField(20);
		
		this.userArea = new JTextArea(12, 10);
	
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(factButton);
		this.add(fibButton);
		this.add(inputField);
		this.add(userArea);
		
		userArea.setEditable(false);
		userArea.setWrapStyleWord(true);
		userArea.setLineWrap(true);
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, fibButton, 0, SpringLayout.SOUTH, factButton);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 90, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -6, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, factButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userArea, 3, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, userArea, 0, SpringLayout.WEST, fibButton);
		baseLayout.putConstraint(SpringLayout.EAST, userArea, 0, SpringLayout.EAST, factButton);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -10, SpringLayout.EAST, this);
	}
	
	public void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent click)
			 {
				 userArea.setText(baseController.transferFactorial(inputField.getText()));
				
			 }
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent click)
			 {
				 userArea.setText(baseController.iterativeFibinacci(inputField.getText()));
				 System.out.println("Now the rucurcive time");
				 userArea.setText(baseController.transferFibinacci(inputField.getText()));
			 }
		});
	}
}
