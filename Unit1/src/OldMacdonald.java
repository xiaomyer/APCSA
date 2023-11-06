import java.util.Scanner;

public class OldMacdonald {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Howdy, partner! My bushels stores a whole 25000 bushels! Type in your orders, and I will see what I can do!");
		int capacity = 25000; // capacity given by problem
		int stored = 0; // start with 0 bushels
		while (true) {
			int input = keyboard.nextInt();
			if (input == 0) { // if you type 0, exit
				System.out.printf("Exiting program. You stored %d bushels!", stored);
				break;
			}
			if (capacity - input == 0) { // if there's no more space after subtracting your input, exit
				// notice that the above line does not save the subtraction operation to the variable
				// but just does it on the spot for the purpose of checking the condition
				System.out.println("No more space, partner!");
				break;
			}
			if (input > capacity) { // if your input is greater than your capacity, don't store anything and tell the user
				System.out.printf("I'm afraid I can't do that, buckaroo! I can only store %d more bushel(s)\n", capacity);
				continue; // go back to the start of the loop, NOT running anything under this line
			}
			capacity -= input;
			stored += input;
			System.out.printf("Roger that, partner! I can store %d more bushels\n", capacity);
		}

	}
}
