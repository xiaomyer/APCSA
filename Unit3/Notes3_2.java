public class Notes3_2
{
	public static void main(String[] args)
	{		
		String phrase = "Greta Van Fleet"; 
		
		//Each character in a string is given a position, 
		//starting at 0. These numbers are called "indexes"
		
		//   G  r  e  t  a     V  a  n     F  l  e  e  t
		//   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14
		
		
		
		
		//the length of a string is however many characters are 
		//in it, including spaces.  
		System.out.println(phrase.length());
		
		
		
		
		//a "substring" is a piece of a string where the parameters 
		//are a start and ending index. You get the piece up to 
		//but NOT including the ending index.  
		System.out.println(phrase.substring(6, 8));
		
		
		
				
		
		//If you only give one parameter, it treats it as the 
		//starting index and automatically goes all the way to the end
		System.out.println(phrase.substring(10)); 
		
		
		
		
		
		
		
		
		//Here's how to get a single letter 
		System.out.println(phrase.substring(6, 7));
		
		
		
		
		
		
		
				
		//another way to get a single letter is using the "charAt" command.
		//The input is the index of whatever letter you want.
		//Note there is no "ending" value because chars are always just
		//a single letter

		System.out.println(phrase.charAt(11));
		
		
		
		
		
		
		
		
		
		//Be careful about adding two chars together - you'll get the ASCII values!

		System.out.println(""+ phrase.charAt(0) + phrase.charAt(14));
		
		//keep the "" in the front to actually put the letters together
		//instead of printing the ASCII values
		
		
		
		
		
		
		
		
		//practice: 
		String veggie = "peas and carrots"; 
			
		//print just the first word
		System.out.println(veggie.split(" ")[0]);
		
		//print just the second word 
		System.out.println(veggie.split(" ")[1]);

		//print just the letter d using two different methods 
		System.out.println("d");
		System.out.println('d');
		
		//print the first and last chars together (so "ps")
		System.out.println(veggie.substring(0, 1) + veggie.substring(veggie.length() - 1));
		
		//print first letter of first word, and everything except the first letter of the third word
		System.out.println(veggie.substring(0, 1) + veggie.substring(10));

		//print the last 3 letters. Assume you don't know what the phrase is
		System.out.println(veggie.substring(veggie.length() - 3));
	
	}
}