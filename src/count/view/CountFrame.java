package count.view;
import count.controller.CountController;
import count.view.CountPanel;
import java.awt.Dimension;
import javax.swing.*;

import java.awt.Dimension;

import javax.swing.*;


public class CountFrame extends JFrame
{
	private CountController baseController;
	private CountPanel basePanel;
	
	
	public CountFrame(CountController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new CountPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("You got served sucker");
		this.setSize(new Dimension(500, 500));
		this.setResizable(false);
		this.setVisible(true);
	}
}
