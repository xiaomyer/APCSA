import java.util.Scanner;

public class AddEmUp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double sum = 0;
		System.out.println("Enter numbers to be added up, and enter a 0 to view result and exit");
		while (true) {
			double input = keyboard.nextDouble();
			if (input == 0.0) break;
			sum += input;
		}
		System.out.printf("Your sum was %f\n", sum);
	}
}
