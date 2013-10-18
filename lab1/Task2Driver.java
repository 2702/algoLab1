package lab1;

import java.util.ArrayList;
import java.util.List;

public class Task2Driver {
	private static final int POINTS_QUANTITY = 100;
	
	public static void main (String [] args)
	{
		List<Point> points = new ArrayList<Point>();
		for (int i = 0; i < POINTS_QUANTITY; i++)
		{
			points.add(RandomPointFactory.createRandomPoint());
		}
		Task2Solution solution = new Task2Solution();
		Point refPointA = RandomPointFactory.createRandomPoint();
		Point refPointB = RandomPointFactory.createRandomPoint();
		solution.splitSets(refPointA, refPointB, points);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Reference points: ").append(refPointA).append(refPointB)
		.append("Entry points: ").append(points)
		.append("Sl: ").append(solution.getSl())
		.append("Sc: ").append(solution.getSc())
		.append("Sr: ").append(solution.getSr());
		System.out.println(sb.toString());
		
	}
}
