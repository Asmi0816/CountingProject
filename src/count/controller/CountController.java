package count.controller;
import count.view.CountFrame;


public class CountController 
{
	private CountFrame baseFrame;
	
	public void start()
	{
		baseFrame = new CountFrame(this);
	}
}
