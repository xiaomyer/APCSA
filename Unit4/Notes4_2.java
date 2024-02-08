import java.util.Arrays;

public class Notes4_2
{
	public static void main(String[] args)
	{
		//initializer list: creates and fills the array all at once
		int[] nums = {3, 6, 3, 8, 9, 4};
		
		//count how many 3's are in the array
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 3)
				count++;
		}
		System.out.println("There are " + count + " 3's in the array");	
		
		//Practice:
		
		//1. Count how many even numbers are in the array.
		
		
		//2. Find the sum of all the elements in the array.
		int sum = 0;
		for (int n : nums) {
			sum += n;
		}
		System.out.println(sum);
		
		//3. Create a new array of the same length as nums.
		//Fill it with all the values from nums that are divisible by 3.
		//Any unused spaces should remain as 0's at the END of the array.
		//Example: if nums is {3, 5, 3, 8, 9, 3} 
		//then the new array should be {3, 3, 9, 3, 0, 0};
		int[] nums2 = new int[nums.length];
		int count2 = 0;
		for (int n : nums) {
			if(n % 3 == 0) {
				nums2[count2] = n;
				count2++;
			}
		}
		System.out.println(Arrays.toString(nums2));
		
		
	}
}
