package lab2;

public class Task1Driver {
	public static void main (String [] args)
	{
//		int[][] tmp = { { 62, 79 }, { 44, 76 }, { 66, 98 }, { 18, 15 }, { 44, 67 }, { 88, 11 }, { 46, 55 }, 
//				{ 26, 95 }, { 6, 91 }, { 87, 25 }, { 52, 86 }, { 39, 50 }, { 32, 94 }, { 70, 71 }, { 5, 56 }, { 94, 44 },
//				 { 53, 24 }, { 47, 66 }, { 62, 11 }, { 91, 80 }, { 76, 60 }, { 97, 23 }, { 68, 3 }, { 14, 97 }, { 11, 17 },
//				 { 98, 0 }, { 49, 86 }, { 37, 69 }, { 45, 88 }, { 88, 73 },
//								{ 82, 11 }, { 71, 96 }, { 88, 39 }, { 37, 92 }, { 69, 87 }, { 45, 9 }, 
//				{ 11, 97 }, { 51, 15 }, { 46, 95 }, { 57, 34 }, { 10, 27 }, { 67, 18 }, { 31, 22 }, { 32, 82 }, { 23, 64 },
//				 { 79, 14 }, { 30, 45 }, { 49, 61 }, { 76, 94 }, { 78, 26 }, { 39, 50 }, { 68, 39 }, { 11, 46 }, { 69, 29 },
//				 { 17, 83 }, { 98, 35 }, { 16, 83 }, { 54, 89 }, { 99, 1 }, { 94, 34 },
//								{ 99, 27 }, { 21, 41 }, { 21, 69 }, { 59, 25 }, { 41, 95 }, { 78, 4 }, { 17, 32 },
//				 { 38, 10 }, { 74, 78 }, { 40, 19 }, { 88, 0 }, { 90, 27 }, { 29, 99 }, { 53, 3 }, { 9, 52 }, { 7, 60 }, 
//				{ 28, 62 }, { 56, 32 }, { 25, 16 }, { 65, 41 }, { 11, 19 }, { 73, 54 }, { 55, 81 }, { 49, 17 }, { 90, 31 },
//				 { 30, 87 }, { 99, 13 }, { 68, 43 }, { 13, 7 }, { 94, 94 },
//								{ 63, 45 }, { 49, 65 }, { 85, 24 }, { 54, 70 }, { 89, 28 }, { 17, 80 }, { 22, 1 },
//				 { 20, 4 }, { 24, 78 }, { 49, 88 }, { 24, 87 }, { 64, 0 }, { 99, 70 }, { 21, 10 }, { 8, 37 }, { 11, 60 }, 
//				{ 15, 31 }, { 6, 80 }, { 78, 75 }, { 15, 74 }, { 30, 55 }, { 13, 58 }, { 57, 87 }, { 78, 6 }, { 72, 10 }, 
//				{ 12, 81 }, { 0, 71 }, { 55, 90 }, { 59, 36 }, { 29, 38 },
//								{ 25, 15 }, { 70, 0 }, { 73, 46 }, { 26, 38 }, { 94, 69 }, { 77, 22 }, { 2, 52 },
//				 { 33, 44 }, { 6, 27 }, { 15, 60 }, { 64, 14 }, { 4, 69 }, { 34, 50 }, { 38, 48 }, { 44, 22 }, { 20, 27 }, 
//				{ 42, 47 }, { 26, 5 }, { 40, 50 }, { 43, 59 }, { 63, 52 }, { 57, 13 }, { 8, 76 }, { 79, 82 }, { 48, 46 },
//				 { 87, 35 }, { 67, 12 }, { 37, 10 }, { 38, 53 }, { 85, 84 },
//								};
		int[][] tmp = { { 62, 79 }, { 44, 76 }, { 66, 98 }, { 18, 15 }, { 44, 67 }, { 88, 11 }, { 46, 55 }, 
				{ 26, 95 }, { 6, 91 }, { 87, 25 }, { 52, 86 }, { 39, 50 }, { 32, 94 }, { 70, 71 }, { 5, 56 }, { 94, 44 },
				 { 53, 24 }, { 47, 66 }, { 62, 11 }, { 91, 80 }
								};

		System.out.println("Intersections: " + String.valueOf(new Task1Solution().calculateIntersections(tmp))); 
	}
	
	
}
