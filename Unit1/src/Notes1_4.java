import java.util.Random;
import java.util.Scanner;

public class Notes1_4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// assignment operators
		int x = 10;
		x = x + 2;
		// this is the same as
		x += 2;
		// works for all operations
		x -= 2;
		x *=2;
		x /= 2;
		x %= 2;
		
		// there is also a shortcut for adding/subtracting 1
		x++;
		x--;
		
		// casting: a way of converting between data types
		// put the type to convert to in parentheses in front of the variable/expression
		System.out.println((int) 5.2);
		System.out.println((double) 3);
		
		int a = 7;
		int b = 2;
		System.out.println((double) a / b); // prints 3.5
		
		// generating random numbers 
		// Math.random() is [0, 1)
		System.out.println(Math.random());
		System.out.println(Math.random() * 6); // [0, 6)
		System.out.println((int) (Math.random() * 6)); // [0, 5]
		System.out.println((int) (Math.random() * 6 + 1)); // [1, 6]
		// random integer from 3 to 10
		System.out.println((int) (Math.random() * 8 + 3));
		// formula
		// (int) (Math.random() * (max - min + 1) + min);
		Random r = new Random();
		System.out.println(r.nextInt(10)); // 0 to 10
		System.out.println(r.nextInt(3, 10)); // 3 to 10
		
	}

}
