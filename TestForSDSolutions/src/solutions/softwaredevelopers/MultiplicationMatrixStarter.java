package solutions.softwaredevelopers;

public class MultiplicationMatrixStarter {

	public static void main(String[] args) {
		
		int[][] matrix = { 
				{ 3, 5, 3, 8 }, 
				{ 6, 2, 1, 3 }, 
				{ 3, 7, 8, 6 }, 
				{ 4, 7, 1, 9 } };
		
		(new Thread(new MultiplierImpl(matrix))).start();
		
	}
}
