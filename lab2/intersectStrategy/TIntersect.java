package lab2.intersectStrategy;

import util.Point;

public class TIntersect extends AbstractIntersectChecker{

	@Override
	public boolean checkIntersection(Point a1, Point a2, Point b1, Point b2) {
		return (arePointsOnBothSides(a1, a2, b1, b2) &&  // B przecina i sprawdzamy czy ktorys z A lezy na nim
					(positionSolver.calculatePosition(b1, b2, a1) == 0  
					|| positionSolver.calculatePosition(b1, b2, a2) == 0) )
				||
				(arePointsOnBothSides(b1, b2, a1, a2) && ( // A przecina i sprawdzamy czy ktorys z B lezy na nim
						positionSolver.calculatePosition(a1, a2, b1) == 0
						|| positionSolver.calculatePosition(a1, a2, b2) == 0));
		
	}

}
