public class Student
{
	private String name;
	private int test1, test2, test3; 
	
	public Student()
	{
		System.out.println("New student!");
	}

	public void setScore(int test, int score)
	{
		if(test == 1)
			test1 = score; 
		else if (test == 2)
			test2 = score;
		else 
			test3 = score; 
	}

	public double getAverage()
	{
		return (test1 + test2 + test3)/3.0;
	}
}
