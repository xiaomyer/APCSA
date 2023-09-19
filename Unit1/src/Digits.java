import java.util.Scanner;

public class Digits {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a three digit integer: ");
		int threeDigitInteger = keyboard.nextInt();
		if (threeDigitInteger > 999) {
			System.out.println("That's not a three digit integer!");
			return;
		}
		String threeDigitString = String.valueOf(threeDigitInteger);
		String[] threeDigitArray = threeDigitString.split("");
		System.out.println("Here are the number's digits starting from the right:");
		for (int i = threeDigitArray.length - 1; i >= 0; i--) {
			System.out.println(threeDigitArray[i]);
		}
	}
}
