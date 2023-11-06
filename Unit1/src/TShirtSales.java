import java.util.Scanner;
public class TShirtSales {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many t-shirts do you want to buy?");
		int numOfTShirtsToBuy = keyboard.nextInt();
		int numOfTShirtsProcessed = 0;
		double totalPrice = 0;
		while (numOfTShirtsToBuy != numOfTShirtsProcessed) {
			System.out.printf("Enter the price of shirt %d: ", numOfTShirtsProcessed + 1);
			double price = keyboard.nextDouble();
			if (price < 1 || price > 99) {
				System.out.println("Invalid price. Enter a price between 1 and 99!");
				continue;
			}
			totalPrice += price;
			numOfTShirtsProcessed++;
		}
		System.out.println("Do you have a 20% off coupon? (answer 'true' or 'false')");
		boolean hasCoupon = keyboard.nextBoolean();
		if (hasCoupon) {
			totalPrice *= 0.8;
		}
		System.out.printf("Your total is $%f", totalPrice);
	}
}
