public class Notes1_2 {
	public static void main(String[] args) {
		// this is an integer
		int x = 7;
		x *= 1000;
		
		// Strings hold words/characters/letters
		String name = "Brighton";
		
		System.out.println(name + " has " + x + " bananas.");
		
//		Make a new variable called temperature
//		set it to any integer you want
//		print a full sentence stating the temperature
		
		int temperature = 97;
		
//		System.out.println(String.format("The temperature outside is %dºF", temperature));
		System.out.println("The temperature outside is " + temperature + "ºF");
		
//		Make a new variable called food
//		set it to whatever your favorite food is
//		print a full sentence about it
		
		String favoriteFood = "chicken wings";
		
//		System.out.println(String.format("My favorite food is %s, especially with barbeque sauce!", food));
		System.out.println("My favorite food is " + favoriteFood + ", especially with barbeque sauce!");
	}
}
