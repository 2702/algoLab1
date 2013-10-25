package lab2;

import java.util.ArrayList;
import java.util.List;

import util.Point;
import lab2.intersectStrategy.CrossIntersect;
import lab2.intersectStrategy.InlineIntersect;
import lab2.intersectStrategy.JoinIntersect;
import lab2.intersectStrategy.TIntersect;

public class Task1Solution {
	List<IntersectCheckStrategy> strategies = new ArrayList<IntersectCheckStrategy>();
	List<Pair> checkedFragments = new ArrayList<Pair>();
	
	
	public Task1Solution()
	{
		strategies.add(new CrossIntersect());
		strategies.add(new InlineIntersect());
		strategies.add(new JoinIntersect());
		strategies.add(new TIntersect());
	}
	
	public long calculateIntersections(int[][] tmp)
	{
		long counter = 0;
		for (int[] point1 : tmp)
		{
			for (int[] point2 : tmp)
			{
				for (int[] point3 : tmp)
				{
					for (int[] point4 : tmp)
					{
						Point a1 = new Point(point1[0], point1[1]);
						Point a2 = new Point(point2[0], point2[1]);
						Point b1 = new Point(point3[0], point3[1]);
						Point b2 = new Point(point4[0], point4[1]);
						Pair pair = new Pair(a1,  b1);
						if (!checkedFragments.contains(pair) && !a1.equals(a2) && !b1.equals(b2))
						{
							checkedFragments.add(pair);
							boolean is = checkIntersection(a1, a2, b1, b2);
							if (is)
							{
								counter++;
								System.out.println(String.valueOf(counter));
							}
							
						}
					}
				}
			}
		}
		return counter;
	}
	
	private boolean checkIntersection(Point a1, Point a2, Point b1, Point b2)
	{
		boolean result = false;
		for (IntersectCheckStrategy strategy : strategies)
		{
			result = strategy.checkIntersection(a1, a2, b1, b2);
			if (result == true)
			{
				return true;
			}
		}
		return false;
	}
	
	class Pair
	{
		Point a;
		Point b;
		
		public Pair(Point a, Point b)
		{
			this.a = a;
			this.b = b;
		}
		
		public boolean equals(Pair other)
		{
			return (a.equals(other.a) && b.equals(other.b))
					|| (b.equals(other.a) && a.equals(other.b));
					
		}
	}
}
