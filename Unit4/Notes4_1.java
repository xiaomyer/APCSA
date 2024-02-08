import java.util.Arrays;

public class Notes4_1 
{
	public static void main(String[] args)
	{
		//an array is a collection of items that are 
		//the same type (ints, doubles, Strings, objects, etc.)

		//to create a new array:
		//datatype[] arrayName = new datatype[number of elements];
		//for example:
		String[] words = new String[4]; 
		
		//to store something in an array:
		//arrayName[index] = thing you want to save; 
		//for example: 
		words[0] = "Andy";
		words[1] = "Myer";
		words[2] = "Catherine";
		words[3] = "Harrison"; 
		
		//using words[4] would go out of bounds
		
		//this accesses and prints the values at index 1 and 3
		System.out.println("Hi " + words[1] + " and " + words[3]);
		
		//this will overwrite whatever was in words[0] previously
		words[0] = "Nikos"; 
		
		//this adds onto whatever is stored in words[0]
		words[0] += " Panagos";
		
		//to print an array, you can use this command:
		System.out.println(Arrays.toString(words));
		
		//Since the words array is filled with strings, you can 
		//call string methods on the elements:
		System.out.println(words[3].charAt(2)); 
		
		//print the length of an array - note there is no () at the end! 
		System.out.println(words.length);

		//Create a new array of ints. Again, the format is 		
		//datatype[] arrayName = new datatype[number of elements];
		int[] scores = new int[5];
		
		//fill the array with some numbers
		scores[0] = 5;
		scores[1] = 7;
		scores[2] = 3;
		scores[3] = 9;
	
		
		//the last score becomes the sum of the first two:
		scores[4] = scores[0] + scores[1];
		
		//to print an array, you can use this command:
		System.out.println(Arrays.toString(scores)); 
	}
}