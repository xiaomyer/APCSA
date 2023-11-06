import java.util.Scanner;

public class CloserInteger {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int first = keyboard.nextInt();
		int second = keyboard.nextInt();
		int third = keyboard.nextInt();
		if (Math.abs(second - first) == Math.abs(third - first)) {
			System.out.printf("%d is equally as close to %d as %d", second, first, third);
		} else if (Math.abs(second - first) < Math.abs(third - first)) {
			System.out.printf("%d is closer to %d than %d", second, first, third);
		} else {
			System.out.printf("%d is closer to %d than %d", third, first, second);
		}
	}

}
