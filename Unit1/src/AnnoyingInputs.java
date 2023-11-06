import java.util.Scanner;

public class AnnoyingInputs {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, what's your name?");
		String name = keyboard.nextLine();
		System.out.println(String.format("Nice to meet you, %s! What's your age?", name));
		int age = keyboard.nextInt();
		System.out.println(String.format("Wow! You're %d?", age));
		
		System.out.println("What's your favorite number?");
		int favoriteNumber = keyboard.nextInt();
		System.out.println("What's your favorite food?");
//		keyboard.nextLine();
//		keyboard.skip("\n"); // this also works and makes more sense
		String food = keyboard.nextLine();
		System.out.println(String.format("So your favorites are %d and %s!", favoriteNumber, food));
	}
}
