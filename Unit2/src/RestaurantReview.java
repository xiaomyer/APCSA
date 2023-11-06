
public class RestaurantReview {

	public static void main(String[] args) {
//		System.out.println(calculateReview(true, true, true)); // 5
//		System.out.println(calculateReview(true, false, true)); // 4
//		System.out.println(calculateReview(true, true, false)); // 4
//		System.out.println(calculateReview(true, false, false)); // 3
//		System.out.println(calculateReview(false, true, true)); // 2
//		System.out.println(calculateReview(false, false, true)); // 1
//		System.out.println(calculateReview(false, true, false)); // 1
//		System.out.println(calculateReview(false, false, false)); // 0
		
		System.out.println((calculateReview(true, true, true) + calculateReview(true, false, true) + calculateReview(false, true, true)) / 3.0);
	}
	
	private static int calculateReview(boolean goodFood, boolean goodAtmosphere, boolean fairPrices) {
		if (goodFood && goodAtmosphere && fairPrices) return 5;
		else if (goodFood && (goodAtmosphere || fairPrices)) return 4;
		else if (goodFood && (!goodAtmosphere && !fairPrices)) return 3;
		else if (!goodFood && (goodAtmosphere && fairPrices)) return 2;
		else if (!goodFood && (goodAtmosphere || fairPrices)) return 1;
		else return 0;
	}

}
