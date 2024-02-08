import java.util.Arrays;

public class Notes4_3 
{
	/*
	 * Main idea: arrays are objects.
	 * This means that when you send one as a parameter,
	 * the parameter is an ALIAS of the original. 
	 * So if you change one of them, it changes the other. 
	 * Here, changing the value at arr[0] also affects nums[0]
	 */
	
	public static void main(String[] args)
	{
		int[] nums = {4, 4, 4};
		doSomething(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void doSomething(int[] arr)
	{
		arr[0] += 1; 
	}

}
