import java.util.*;

public class Notes3_1 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		//a char is a single letter or character, use single quotes
		char first = 'k';
		char last = 't';
		
		//to check for a certain letter, use ==
		if(first == 'k')
			System.out.println("That's Ms. Thompson's first initial!");
		
		//a string is just a bunch of chars put together, use double quotes
		String animal = "armadillo"; 
		
		//to check for a certain word, use .equals
		if(animal.equals("armadillo"))
			System.out.println("That's my favorite animal!"); 
		
		//don't use == to compare Strings, that checks memory locations 
		//instead of the actual contents of the words
		
		//you'd expect this to print "kt" but it actually prints 223
		//this is the sum of the ASCII values of k and t
		System.out.println(first + last); 
		
		//you can "trick" java into treating it as a string by putting 
		//empty quotes in the front
		System.out.println("" + first + last); 
		
	}
}