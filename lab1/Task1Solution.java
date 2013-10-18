package lab1;

public class Task1Solution {
	
	private Solver solver = new Solver();
	
	public static void main(String[] args) {
		new Task1Solution().runApp();
	}
	
	public void runApp()
	{
		Point pointA = RandomPointFactory.createRandomPoint();
		Point pointB = RandomPointFactory.createRandomPoint();
		Point pointC = RandomPointFactory.createRandomPoint();
		
		int position = solver.calculatePosition(pointA, pointB, pointC);
		
		printResult(pointA, pointB, pointC, position);
	}
	
	private void printResult(Point pointA, Point pointB, Point pointC, int result)
	{	
		
		StringBuilder sb = new StringBuilder();
		sb.append(pointA)
		.append(pointB)
		.append(pointC)
		.append("Result: ")
		.append(result)
		.append(" position: ")
		.append(result == 1 ? "left" : (result == -1 ? "right" : "on the line"));

		System.out.println(sb.toString());
	}
	
}
