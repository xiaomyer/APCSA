import java.util.Random;

public class RollingDice2 {
	public static void main(String[] args) {
		Random random = new Random();
		int roll1 = random.nextInt(1, 6);
		int roll2 = random.nextInt(1, 6);
		int roll3 = random.nextInt(1, 6);
		System.out.printf("Person 1 rolled a %d\n", roll1);
		System.out.printf("Person 2 rolled a %d\n", roll2);
		System.out.printf("Person 3 rolled a %d\n", roll3);
		System.out.printf("Smallest two added together equals %d", roll1 + roll2 + roll3 - Math.max(Math.max(roll1, roll2), roll3));
	}
}
