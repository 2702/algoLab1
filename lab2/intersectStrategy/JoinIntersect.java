package lab2.intersectStrategy;

import lab2.IntersectCheckStrategy;
import util.Point;

public class JoinIntersect implements IntersectCheckStrategy{

	@Override
	public boolean checkIntersection(Point a1, Point a2, Point b1, Point b2) {
		return b1.equals(a1) || b1.equals(a2) || b2.equals(a1) || b2.equals(a2);
	}

}
