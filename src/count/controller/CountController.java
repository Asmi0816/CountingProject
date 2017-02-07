package count.controller;
import count.view.CountFrame;
import javax.swing.JOptionPane;
import count.model.Recursion;



public class CountController 
{
	private CountFrame baseFrame;
	private Recursion mathTool;
	
	public void start()
	{
		this.mathTool = new Recursion();
		baseFrame = new CountFrame(this);
	}
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The Factorial of " + input + " is ";
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Double.parseDouble(input));
			
		}
		return factorialInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			double test = Double.parseDouble(testValue);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}

		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid number >= 0");
			return false;
		}
	}
}
