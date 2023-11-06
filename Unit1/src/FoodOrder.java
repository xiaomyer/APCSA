import java.util.Scanner;

public class FoodOrder {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choose a menu item to add to your total:"
				+ "\n Press 1 for Pizza ($3)"
				+ "\n Press 2 for Burger($5)"
				+ "\n Press 3 for Drink($1)"
				+ "\n Press 0 to quit and see your total.\n");
		
		int total = 0;
		int pizzaPrice = 3;
		int burgerPrice = 5;
		int drinkPrice = 1;
		
		while (true) {
			int input = keyboard.nextInt();
			if (input == 0) break; // quit if 0
			if (input == 1) {
				total += pizzaPrice;
				System.out.printf("You bought a pizza for $%d\n", pizzaPrice);
			}
			else if (input == 2) {
				total += burgerPrice;
				System.out.printf("You bought a burger for $%d\n", burgerPrice);
			}
			else if (input == 3) {
				total += drinkPrice;
				System.out.printf("You bought a drink for $%d\n", drinkPrice);
			}
		}
		
		System.out.printf("Your total is $%d!", total);

	}

}
