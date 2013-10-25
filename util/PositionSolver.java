package util;

public class PositionSolver {

	public int calculatePosition(Point refPointA, Point refPointB, Point pointC)
	{
		int determinant = calculateSimplifiedDeterminant(refPointA.getX(), refPointB.getX(), pointC.getX(), refPointA.getY(), refPointB.getY(), pointC.getY());
		if (determinant > 0)
			return 1;
		else if (determinant < 0)
			return -1;
		else
			return 0;
	}
	
	private int calculateSimplifiedDeterminant(int x1, int x2, int x3, int y1, int y2, int y3)
	{
		return x1 * (y2 - y3) - y1 * (x2 - x3) + x2* y3 - x3 * y2;
	}
}
