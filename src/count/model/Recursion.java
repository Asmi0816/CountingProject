package count.model;

public class Recursion
{
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber ==1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
}
