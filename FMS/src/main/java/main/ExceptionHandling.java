package main;

public class ExceptionHandling extends Exception {
	String message;
	public ExceptionHandling(String message)
	{
		super(message);
		
		
	}

}
class ChoiceFlight
{
	public static void choice(int ch) throws ExceptionHandling{
		if(ch<=0 || ch>=7)
		{
			throw new ExceptionHandling("not a valid choice");
		}
	}
}

class ChoiceScheduledFlight
{
	public static void choice(int ch) throws ExceptionHandling{
		if(ch<=0 || ch>=8)
		{
			throw new ExceptionHandling("not a valid choice");
		}
	}
}


