import java.util.Scanner;

public class Notes1_5 
{
	public static void main(String[] args) 
	{ 
		Scanner keyboard = new Scanner(System.in);
		
		//boolean expressions are either true or false
		//inequality symbols:  <   >    <=   >= 
		//equal to: 	==
		//not equal to: != 
		//don't use a single equals sign, that means "store this value" 
		
		
		//Example 1: Print a boolean expression to see 
		//how it evaluates to true or false: 
		System.out.println(3 < 5); 
		System.out.println(8 == 10); 
		
		
		//Example 2: generate a random integer from 0-19 and 
		//print some info about it
		int x = (int)(Math.random() * 20); 	
		if(x < 10)
			System.out.println("The number is " + x + " and it's less than 10." );
		if(x % 2 == 0)
			System.out.println("The number is " + x + " and it's even."); 
		
			
		//Example 3: Ask the user if they're hungry, print a response 
		//based on their answer of 1 (yes) or 0 (no)
//		System.out.println("Are you hungry? 1 for yes, 0 for no");
//		int hungry = keyboard.nextInt(); 		
//		if(hungry == 1)
//			System.out.println("Go eat a sandwich"); 
//		else
//			System.out.println("Okay I'll ask again later");
		
		
		//Example 4: Ask the user how old they are and print 
		//a response based on their age: 
//		System.out.println("How old are you?");
//		int age = keyboard.nextInt(); 
		
//		if(age > 65)
//			System.out.println("Enjoy your retirement!");
//		else if (age > 40)
//			System.out.println("Get that bread.");
//		else if (age >= 25)
//			System.out.println("You can rent a car!");
//		else if (age >= 18)
//			System.out.println("You can go to the casino!");
//		else
//			System.out.println("Go to school!"); 
		
		
		//Practice: 
		
		//1. create a variable called die which stores a random integer 1 - 6
		//print whether the number you "rolled" is even or odd. 
		//also print if it's greater than 3, less than 3, or equal to 3
		int die = (int) (Math.random() * 6 + 1);
		System.out.printf("The number I rolled was a %d, which is %s!\n", die, die % 2 == 0 ? "even" : "odd");
		if (die > 3) System.out.println("The roll was greater than 3");
		else if (die < 3) System.out.println("The roll was less than 3");
		else if (die == 3) System.out.println("The roll was equal to 3");
		
		
		//2. create a variable called average which stores an integer entered by the user
		//print whether they got an A, B, C, D, or F letter grade
		System.out.print("What is your grade average (out of 100)?: ");
		int average = keyboard.nextInt();
		char grade;
		if (average < 65) grade = 'F';
		else if (average < 70) grade = 'D';
		else if (average <= 79) grade = 'C';
		else if (average <= 89) grade = 'B';
		else grade = 'A';
		System.out.printf("Your letter grade is %c", grade);
	}
}