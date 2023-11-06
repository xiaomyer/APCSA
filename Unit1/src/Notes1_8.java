import java.util.*;
public class Notes1_8 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);	
		
		System.out.println("How much does your elephant weigh?");
		int weight = keyboard.nextInt();
		
		//logical operators:   	&& means "and" so both pieces must be true
		//						|| means "or" so at least one piece must be true
		//						! means "not" which flips the value (true/false)
		
		if(weight < 260 || weight > 15000)	//at least one of these must be true
			System.out.println("Your elephant is not at a healthy weight");
		
		if(weight > 260 && weight < 15000)	//both of these must be true
			System.out.println("This is a healthy elephant");
	
		
		//short circuit evaluation: Java will stop executing a control statement
		//as soon as it can determine an answer
		
		int x = 0; 
		
		if(x != 0 && 10/x < 2)
			System.out.println("Hooray!"); 
		
		//boolean variables are either true or false
		boolean isRaining = false;
		boolean hasUmbrella = true; 	
		
		if(isRaining && hasUmbrella)
			System.out.println("You will stay dry");
		
		if(isRaining && !hasUmbrella)
			System.out.println("You will be soggy"); 
		
		System.out.println("Do you have rainboots? (true or false?)");
		boolean hasRainboots = keyboard.nextBoolean(); 

		if(!isRaining && hasRainboots)
			System.out.println("You're overprepared!");
		
	}
}