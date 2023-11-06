import java.util.Scanner;

public class Notes1_6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Example 1: a while loop repeats as long as the condition is true
		int num = 40;
//		while (num >= 0) { // the thing in parentheses is called the condition
//			System.out.println(num);
//			num -= 2;
//		}
//		for (int countTo10 = 0; countTo10 <= 10; countTo10++) {
//			System.out.println(countTo10);
//		}
//		
//		int countTo10 = 0;
//		while (countTo10 <= 10) {
//			System.out.println(countTo10);
//			countTo10 += 1;
//		}
		
		// Practice 3
//		int num3 = 100;
//		while (num3 >= 0) {
//			System.out.println(num3);
//			num3 -= 5;
//		}
		
		// Example 4: allow the user to control when the loop stops (different style than example 4)
		int input = 0;
		while (input >= 0) {
			System.out.println("Enter a number to see its square root, or enter a negative number to quit");
			input = keyboard.nextInt();
			if (input >= 0) System.out.println(Math.sqrt(input));
		}
		System.out.println("exit");

		// Example 5: allow the user to control when the loop stops (different style than example 4)
		input = 0;
		while (input >= 0) {
			System.out.println("Enter a number to see its square root, or enter a negative number to quit");
			input = keyboard.nextInt();
			if (input < 0) break;
			System.out.println(Math.sqrt(input));
		}
		System.out.println("exit");
		
		// Practice 6: generate and print a random number 1-10. keep doing this UNTIL you generate a 7.
		int randomNumber = 0;
		while (randomNumber != 7) {
			randomNumber = (int) (Math.random() * 10 + 1);
			System.out.println(randomNumber);
		}
		
		// Example 7
		int count = 1;
		int sum = 0;
		
		while (count <= 10) {
			sum += count;
			count++;
		}
		System.out.printf("The sum is %d\n", sum);

		// Example 8
		sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("The sum is %d\n", sum);
		
		// Example 9: using a "do while" loop
		int roll;
		do {
			roll = (int) (Math.random() * 6) + 1;
			System.out.printf("You rolled a %d\n", roll);
		} while (roll != 6);
		
		// Practice 10: Find the average weight for a group of alligators 
		double totalWeightOfAlligators = 0;
		System.out.print("Enter how many alligators are in your group: ");
		int numberOfAlligators = keyboard.nextInt();
		for (int i = 0; i < numberOfAlligators; i++) {
			System.out.printf("How much does alligator %d weigh?: ", i + 1);
			int weight = keyboard.nextInt();
			totalWeightOfAlligators += weight;
		}
		System.out.printf("The average weight of the %d alligators is %f", numberOfAlligators, totalWeightOfAlligators/numberOfAlligators);
	}

}
