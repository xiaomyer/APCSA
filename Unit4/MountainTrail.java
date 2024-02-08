
import java.util.*;

public class MountainTrail 
{
	private int[] elevations;
	
	//write your constructor here:
	public MountainTrail(int[] elevations) {
        this.elevations = elevations;
    }
	
	
	//read directions for Part B in google doc and write solution in this method:
	public boolean isLevelTrailSegment(int start, int end)
	{
        int max = elevations[start];
        int min = elevations[start];
        for (int i = start; i <= end; i++) {
            if (elevations[i] > max) max = elevations[i];
            else if (elevations[i] < min) min = elevations[i];
        }
        return Math.abs(max - min) <= 10;
	}
	
	//read directions for Part C in google doc and write solution in this method:
	public boolean isDifficult()
	{
        int criteriaCounter = 0;
		for (int i = 0; i < elevations.length - 1; i++) {
            if (Math.abs(elevations[i] - elevations[i + 1]) >= 30) criteriaCounter++;
        }
        return criteriaCounter >= 3;
	}
	
	
	public static void main(String[] args)
	{
		int[] inputs = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100}; 

		
		
		//Part D
		//write the code here which would create a new MountainTrail object
		//then call the methods isLevelTrailSegment and isDifficult to print their results
        MountainTrail mountEverest = new MountainTrail(inputs);
        System.out.println(mountEverest.isLevelTrailSegment(7, 9));
        System.out.println(mountEverest.isLevelTrailSegment(2, 12));
        System.out.println(mountEverest.isDifficult());
	}

}