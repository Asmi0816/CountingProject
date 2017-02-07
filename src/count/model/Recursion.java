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
	
	public double calculateFibinacci(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibinacci(currentNumber - 1) + calculateFibinacci(currentNumber - 2);
			
		}
	}
	
	public int calculateIterativeFib(int n)
	{
	        int x = 0, y = 1, z = 1;
	        for (int i = 0; i < n; i++) 
	        {
	            x = y;
	            y = z;
	            z = x + y;
	        }
	        return x;
	    
	}
	
	public long calculateIterativeFact(int num)
	{
		 long result = 1;
	        if(num == 0) 
	        {
	            return 1;
	        }
	        else 
	        {
	            for(int i = 2; i <= num; i++) 
	            {
	                result *= i;
	            }
	        }
	     return result;
	}
}
