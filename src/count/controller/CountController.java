package count.controller;
import count.view.CountFrame;
import javax.swing.JOptionPane;
import count.model.Recursion;
import count.model.*;



public class CountController 
{
	private CountFrame baseFrame;
	private Recursion mathTool;
	private Timer mathTimer;
	
	public void start()
	{
		this.mathTool = new Recursion();
		baseFrame = new CountFrame(this);
		mathTimer = new Timer();
	}
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The Factorial of " + input + " is ";
		
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Double.parseDouble(input));
			
		}
		
		mathTimer.stopTimer();
		
		factorialInfo += "\n" + mathTimer.toString();
		
		factorialInfo += "\nThe iterative Factorial of " + input + " is " ;
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateIterativeFact(Integer.parseInt(input));
			
		}
		
		mathTimer.stopTimer();
		
		factorialInfo += "\n" + mathTimer.toString();
		return factorialInfo;
		
	}
	
	
	
	public String transferFibinacci(String input)
	{
		String fibinacci = "";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibinacci += mathTool.calculateFibinacci(Double.parseDouble(input));
		}
		
		mathTimer.stopTimer();
		fibinacci += "\n" + mathTimer;
		
		
		fibinacci = "\n The irative time";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibinacci += mathTool.calculateIterativeFib(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		fibinacci += "\n" + mathTimer;
		return fibinacci;
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
