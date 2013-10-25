package lab2.intersectStrategy;

import util.Point;

public class CrossIntersect extends AbstractIntersectChecker{

	@Override
	public boolean checkIntersection(Point a1, Point a2, Point b1, Point b2) {
		return arePointsOnBothSides(a1, a2, b1, b2) && arePointsOnBothSides(b1, b2, a1, a2);
	}

}
