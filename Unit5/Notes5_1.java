package Unit5;

import javax.print.StreamPrintService;

public class Notes5_1 
{
	public static void main(String[] args)
	{		
		//A regular array is "one-dimensional" because it can be written in a single row.
		//Here are three examples of one-dimensional 
		//arrays:
		int[] row0 = {3, 7, 6, 4};
		int[] row1 = {1, 8, 9, 2};
		int[] row2 = {5, 0, 3, 8};

		//A two-dimensional array is an array where each element 
		//is actually a one dimensional array. We use TWO SETS of 
		//square brackets for two-dimensional arrays. For example, 
		//we can store all of the rows above into a two-dimensional 
		//array, like this:
		int[][] grid = {row0, row1, row2};

		//Another way we could've done this all 
		//at once is by writing this single line:
		int[][] grid2 = {{3, 7, 6, 4}, {1, 8, 9, 2}, {5, 0, 3, 8}};

		//To access a single element in a two-dimensional array, 
		//you need to write arrayName[row][column]. Row and column 
		//numbers both start at 0, just like with one-dimensional arrays.
		//For example, to get the number in row 1, column 0, you'd write:
		System.out.println("The element in row 1, column 0 is " + grid[1][0]);

		//To get the number of rows in grid, that's just the length of grid:
		System.out.println("The number of rows in grid is " + grid.length);

		//The number of columns is the number of elements in one of the rows. 
		//So if we just look at row0 and look at how long that row is, 
		//that's the number of columns:
		System.out.println("The number of columns in grid is " + grid[0].length);

		//A two-dimensional array can be traversed (a.k.a. "looped through") 
		//using nested for loops: 
		for(int r = 0; r < grid.length; r++) //loops through rows
		{
			for(int c = 0; c < grid[0].length; c++) //loops through the columns
			{
				System.out.print(grid[r][c] + " ");
			}
			System.out.println(); 
		}

		//You can also declare a two-dimensional array without giving values. This example 
		//has 4 rows and 5 columns. Since no values are stored yet, they default to zero.  
		int[][] grid3 = new int[4][5];

		//Practice
		//Create a 2D array called matrix that contains these values:
		//4 9 1 0
		//5 5 6 3
		//8 2 1 4
		int[][] matrix = 
        {{4, 9, 1, 0}, 
        {5, 5, 6, 3}, 
        {8, 2, 1, 4}}; 
		
				
		//1. Print the sum of all values in the middle row
        int sum1 = 0;
        for (int c = 0; c < matrix[1].length; c++) {
            sum1 += matrix[1][c];
        }
        System.out.println(sum1);
		
		
		//2. Print the sum of all values in the last column
		int sum2 = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (c == 3) {
                    sum2 += matrix[r][c];
                }
            }
        }
        System.out.println(sum2);
				
		//3. Find the smallest number in the matrix and print it
		int smallest = matrix[0][0];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] < smallest) {
                    smallest = matrix[r][c];
                }
            }
        }
        System.out.println(smallest);
	}
}