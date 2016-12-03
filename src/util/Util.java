package util;

import java.util.Random;

public class Util {

	private static Random random = new Random();
	
	public static double randDouble(double max) {
		double number = (random.nextDouble() * max);
		
		return random.nextBoolean() == true ? number : - number;
	}
}
