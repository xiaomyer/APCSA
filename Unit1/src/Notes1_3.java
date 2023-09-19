import java.util.Scanner;

public class Notes1_3 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//to store decimal values, use a double:
		double num = 5.2;
		
		
		//----------mixed mode arithmetic--------
		//if you do math with two ints, the answer with be an int
		//if you do math with at least one double, the answer will be a double
		System.out.println(3 + 4.0); 
		System.out.println(1/2); 
		System.out.println(5/4); 
		System.out.println(1.0/2); 
				
		
		//----------modulus------------
		//"mod" for short, it computes the remainder after dividing
		System.out.println(7 % 2); 	//the remainder after doing 7 divided by 2 is 1
		System.out.println(16 % 5); //remainder is 1
		System.out.println(23 % 5); //remainder is 3
		System.out.println(14 % 7); //remainder is 0
		
		
		//----------other math operations------------
		System.out.println(Math.sqrt(9)); //square root 
		System.out.println(Math.abs(-5)); //absolute value
		System.out.println(Math.pow(3, 4)); //power (3 ^ 4)
		System.out.println(Math.PI);
		System.out.println(Math.max(9, 4)); //chooses the bigger one 
		//this is not a thing: Math.max(9, 4, 7); 
		System.out.println(Math.max(Math.max(9, 4) , 7));
		System.out.println(Math.cos(Math.PI/3));
		System.out.println(Math.floor(5.8)); //rounds down 
		System.out.println(Math.ceil(5.8)); //rounds up
		
		
		//------------Practice---------------------------	
		//1) Find the square root of 40. Store it as a double, then print it. 
		double sqrt40 = Math.sqrt(40);
		System.out.println(sqrt40);
		//2) Find the area of a circle that has a radius of 5. 
		System.out.println(Math.PI * Math.pow(5, 2));
		//3) Find the decimal value of 75 divided by 80. (use Eclipse to do the division for you)
		System.out.println(75 / 80.0);
		//4) Ask the user to enter 3 integers. Print whichever one is largest. 
		System.out.println("Enter 3 integers:");
		int int1 = keyboard.nextInt();
		int int2 = keyboard.nextInt();
		int int3 = keyboard.nextInt();
		System.out.println(String.format("The largest int out of those is %d", Math.max(int1, Math.max(int2, int3))));
		//5) Get the last digit of the number 9382
		System.out.println(9382 % 10);
		
	}
}