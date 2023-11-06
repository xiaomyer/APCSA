
public class TriangleArea {

	public static void main(String[] args) {
		System.out.println(triangleArea(6, 8, 10, true) + triangleArea(14, 10, 5, false));
	}

	private static double triangleArea(int a, int b, int c, boolean isRight) {
		if (isRight) return 0.5 * a * b;
		return heronsFormula(a, b, c);
	}
	
	private static double heronsFormula(int a, int b, int c) {
		double s = (double) (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
