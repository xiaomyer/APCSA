
public class Notes4_5
{
	public static void main(String[] args)
	{	
		//this is a normal for loop
		for(int i = 3; i < 8; i++)
		{
			System.out.print(i);
		}
		
		System.out.println("\n\n");
		//this just creates two new empty lines of space between patterns
					
		
		//this is a nested for loop.
		//it will first complete the inner loop (with c going 1, 2, 3)
		//the outer loop says "do the entire inner loop
		//again" for a total of four times (because r goes 1, 2, 3, 4)
		for(int r = 1; r < 5; r++)
		{
			for(int c = 1; c < 3; c++)
			{
				System.out.print(c + " ");	
			}			
			System.out.println();
		}
		System.out.println("\n\n");
		
		
		//another example, this time c counts down
		for(int r = 1; r < 5; r++)
		{
			for(int c = 9; c > 5; c--)
			{
				System.out.print(c + " ");	
			}			
			System.out.println();
		}	

        int max = 4;
        for (int k = 1; k <= max; k++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(k + " ");
            }
            System.out.print("\n");
        }
	}
}
