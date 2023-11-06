import java.util.Scanner;

public class NarcissisticNumbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a 'narcissistic' number");
		int input = keyboard.nextInt();
		int inputCopy = input;
		int sumOfDigitsToNthPower = 0;
		int nDigits = getNumberOfDigits(input);
		while (true) {
			int digit = (inputCopy /= 10) % 10; // % 10 gets last digit of number, / 10 (floored) chops one digit off the end
			if (digit == 0) break;
			sumOfDigitsToNthPower += Math.pow(digit, nDigits);
		}
		if (input == sumOfDigitsToNthPower) {
			System.out.printf("%d is a narcissistic number!", input);
		} else {
			System.out.printf("%d is not a narcissistic number", input);
		}
	}
	private static int getNumberOfDigits(int number) {
		if (number == 0) return 0;
		return (int) (Math.log10(number) + 1);
	}
}
