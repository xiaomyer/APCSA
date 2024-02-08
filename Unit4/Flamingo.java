
public class Flamingo 
{
	private String color; //can be pink, red, or orange
	private int legs; //how many legs the flamingo is using to stand
	
	
	public Flamingo(String c) 
	{
		color = c; 
		legs = (int)(Math.random()*2 + 1); //either a 1 or a 2
	}
	
	public void raiseLeg()
	{
		if(legs == 2)
			legs = 1; 
	}
	
	public void lowerLeg()
	{
		if(legs == 1)
			legs = 2; 
	}
	
	public String getColor()
	{
		return color; 
	}
	
	public String toString()
	{
		return "Color: " + color + " Legs: " + legs;
	}
}
