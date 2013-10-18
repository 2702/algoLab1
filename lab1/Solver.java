package lab1;

public class Solver {

	public int calculatePosition(Point pointA, Point pointB, Point pointC)
	{
		int determinant = calculateSimplifiedDeterminant(pointA.getX(), pointB.getX(), pointC.getX(), pointA.getY(), pointB.getY(), pointC.getY());
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
