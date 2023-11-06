
public class CircleArea {

	public static void main(String[] args) {
		System.out.println((circleArea(5) + circleArea(9) + circleArea(14)) / 3);
	}
	
	private static double circleArea(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}
