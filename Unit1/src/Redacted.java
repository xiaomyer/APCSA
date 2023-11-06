import java.util.Scanner;

public class Redacted {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many inputs will you be giving?");
		int trials = keyboard.nextInt();
		for (int i = 0; i < trials; i++) {
			int input = keyboard.nextInt();
			System.out.printf("Output: %f\n", Math.sqrt(input) + 3);
		}
	}
}