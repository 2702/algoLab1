package lab2.intersectStrategy;

import util.Point;
import util.PositionSolver;
import lab2.IntersectCheckStrategy;

public abstract class AbstractIntersectChecker implements IntersectCheckStrategy{
	protected PositionSolver positionSolver = new PositionSolver();
	
	@Override
	public abstract boolean checkIntersection(Point a1, Point a2, Point b1, Point b2);
	
	//a1 and a2 on both sides of REF
	protected boolean arePointsOnBothSides(Point ref1, Point ref2, Point a1, Point a2)
	{
		return positionSolver.calculatePosition(ref1, ref2, a1) * positionSolver.calculatePosition(ref1, ref2, a2) < 0; 
	}

}
