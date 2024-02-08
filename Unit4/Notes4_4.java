import java.util.*;

//arrays of objects
public class Notes4_4 
{
	public static void main(String[] args)
	{
		//create an array of 6 Flamingos. 
		//Leave the first one null
		//the rest are a mix of pink/red/orange

		Flamingo[] flock = new Flamingo[6];
		//flock[0] is null
		flock[1] = new Flamingo("pink"); 
		flock[2] = new Flamingo("red"); 
		flock[3] = new Flamingo("orange"); 
		flock[4] = new Flamingo("pink"); 
		flock[5] = new Flamingo("pink"); 
		
		//a shortcut for this: flock = {null, new Flamingo("pink"), new Flamingo("red"), ...}
		
		//this will print the array using the toString method from Flamingo
		System.out.println(Arrays.toString(flock)); 
		

		//tell all flamingos to raise one leg
		for(int i = 0; i < flock.length; i++)
		{
			if(flock[i] != null) //this avoids the null pointer exception
				flock[i].raiseLeg(); 
		}
		
		
		
		//tell all pink flamingos to lower one leg
		for (Flamingo f : flock) {
			if(f == null) continue;
			if(f.getColor().equals("pink")) {
				f.lowerLeg();
			}
		}
		
	}
}
