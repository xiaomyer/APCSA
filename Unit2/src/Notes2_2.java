public class Notes2_2 
{
	public static void main(String[] args) 
	{
		int sum = approx(3, "labrador") + approx(13, "chihuahua") + approx(1, "labrador");
		System.out.println(sum); 
		
		System.out.println(factorial(5) + factorial(8));
		
	}

	
	
	
	//estimate the weight of an animal based on its breed, age
	public static int approx(int age, String breed)
	{
		if(breed.equals("labrador"))
		{
			if(age < 2)
				return 40; 
			else
				return 60; 
		}
		
		if(breed.equals("chihuahua"))
		{
			if(age < 2)
				return 4; 
			else
				return 10; 
		}
		
		return 0;
	}
	
	
	//write a method that computes and returns the factorial of an integer
	public static int factorial (int num)
	{
		int product = 1; 
		
		for(int i = num; i > 0; i--)
		{
			product *= i; 
		}
		
		return product; 
	}
}