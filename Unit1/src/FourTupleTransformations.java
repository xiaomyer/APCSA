import java.util.Scanner;

public class FourTupleTransformations {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tuple of 4 positive integers, separated by spaces");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		int d = keyboard.nextInt();
		int[] tuple = {a, b, c, d};
		int distanceFromZero = 0;
		while (tuple[0] + tuple[1] + tuple[3] + tuple[3] != 0) { // i know im supposed to use if and && but it's SO LONG
			tuple = transform(tuple);
			distanceFromZero++;
		}
		
		System.out.printf("Distance from zero of (%d, %d, %d, %d) is %d", a, b, c, d, distanceFromZero);
	}
	private static int[] transform(int[] tuple) {
		// return {a-b, b-c, c-d, d-a}
		int[] transformed = {Math.abs(tuple[0]-tuple[1]), Math.abs(tuple[1] - tuple[2]), Math.abs(tuple[2] - tuple[3]), Math.abs(tuple[3]-tuple[0])};
		return transformed;
	}
}
