package lab1;

import java.util.ArrayList;
import java.util.List;

public class Task2Solution {
	
	private List<Point> sl = new ArrayList<Point>();

	private List<Point> sc = new ArrayList<Point>();
	private List<Point> sr = new ArrayList<Point>();
	
	Solver solver = new Solver();
	
	public void splitSets(Point refPointA, Point refPointB, List<Point> points)
	{
		clearLists();
		extractPoints(refPointA, refPointB, points);
		
	}

	private void extractPoints(Point refPointA, Point refPointB,
			List<Point> points) {
		for (Point point : points)
		{
			int result = solver.calculatePosition(refPointA, refPointB, point);
			if (result == 1)
				sl.add(point);
			else if (result == -1)
				sr.add(point);
			else
				sc.add(point);
		}
	}

	private void clearLists() {
		sl.clear();
		sc.clear();
		sr.clear();
	}

	public List<Point> getSl() {
		return sl;
	}

	public List<Point> getSc() {
		return sc;
	}

	public List<Point> getSr() {
		return sr;
	}

}
