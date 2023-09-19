import java.util.Scanner;

public class Paycheck {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your hourly wage? Answer: ");
		float hourlyWage = keyboard.nextFloat();
		System.out.println("How many hours did you work? Answer: ");
		float hoursWorked = keyboard.nextFloat();
		int tax = 0;
		while (tax < 5 || tax > 30) {
			tax = (int) Math.round(Math.random() * 100); // Math.round returns long, so we cast to int
		}
		float totalPaycheck = hourlyWage * hoursWorked;
		double taxPercent = tax / 100.0; // you must divide by a float here or Java will round to int
		double taxSubtracted = taxPercent * totalPaycheck;
		System.out.println(String.format("Your randomly generated tax rate is %d", tax));
		System.out.println(String.format("Your total paycheck is $%f", totalPaycheck));
		System.out.println(String.format("After taking out $%f in taxes you will take home $%f", taxSubtracted, totalPaycheck - taxSubtracted));
		keyboard.close();
	}
}
