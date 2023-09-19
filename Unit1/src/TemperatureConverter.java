import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which temperature unit are you inputting? (F or C)");
		String unit = keyboard.nextLine();
		double temperature;
		if (unit.equals("F")) {
			System.out.println("Enter temperature in Fahrenheit:");
			temperature = keyboard.nextDouble();
			System.out.println(String.format("%fºF is equal to %fºC", temperature, degreesFtodegreesC(temperature)));
			return;
		} else if (unit.equals("C")) {
			System.out.println("Enter temperature in Celsius:");
			temperature = keyboard.nextDouble();
			System.out.println(String.format("%fºC is equal to %fºF", temperature, degreesCtodegreesF(temperature)));
		}

	}
	
	private static double degreesFtodegreesC(double degreesF) {
		return (5.0 / 9.0) * (degreesF - 32.0);
	}
	
	private static double degreesCtodegreesF(double degreesC) {
		return ((9.0 / 5.0) * degreesC) + 32.0;
	}

}
