package util;

import java.util.Random;

public class RandomPointFactory {
	
	private static final int RANGE = 100;
	private static final int OFFSET = 50;
	
	public static Point createRandomPoint()
	{
		Random random = new Random();
		return new Point(random.nextInt(RANGE - OFFSET), random.nextInt(RANGE - OFFSET));
	}
}
