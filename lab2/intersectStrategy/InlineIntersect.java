package lab2.intersectStrategy;

import util.Point;

public class InlineIntersect extends AbstractIntersectChecker {

	@Override
	public boolean checkIntersection(Point a1, Point a2, Point b1, Point b2) {
		return allPointsAreInline(a1, a2, b1, b2)
				&& !segmentsAreDisjoint(a1, a2, b1, b2);
	}

	
	private boolean segmentsAreDisjoint(Point a1, Point a2, Point b1, Point b2) {
		return !pointIsOnTheSegment(a1, a2, b1)
				&& !pointIsOnTheSegment(a1, a2, b2);
	}

	
	// min(x1, x2) <= x3 <= max(x1, x2) oraz min(y1, y2)<= y3 <= max(y1, y2) 
	private boolean pointIsOnTheSegment(Point ref1, Point ref2, Point point)
	{
		return Math.min(ref1.getX(), ref2.getX()) <= point.getX()
				&& point.getX() <= Math.max(ref1.getX(), ref2.getX())
				&& Math.min(ref1.getY(), ref2.getY()) <= point.getY() 
				&& point.getY() <= Math.max(ref1.getY(), ref2.getY()); 
	}

	private boolean allPointsAreInline(Point a1, Point a2, Point b1, Point b2)
	{
		return positionSolver.calculatePosition(a1, a2, b1) == 0
				&& positionSolver.calculatePosition(a1, a2, b2) == 0;
	}
}
