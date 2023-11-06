import java.util.Scanner;

public class Slope {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter x1: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter y1: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter x2: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter y2: ");
		int y2 = keyboard.nextInt();
		
		double slope = ((double) y2 - y1) / ((double) x2 - x1);
		System.out.printf("The slope of a line containing the points (%d, %d) and (%d, %d) is %f", x1, y1, x2, y2, slope);
	}
}
