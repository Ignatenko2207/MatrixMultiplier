package solutions.softwaredevelopers;

import java.util.concurrent.CopyOnWriteArrayList;

public class MultiplicationMatrixStarter {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> matrixList = new CopyOnWriteArrayList<>(); 
		int[][] matrix = { 
				{ 3, 5, 3, 8 }, 
				{ 6, 2, 1, 3 }, 
				{ 3, 7, 8, 6 }, 
				{ 4, 7, 1, 9 } };
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				matrixList.add(matrix[i][j]);
			}
		}
		(new Thread(new MultiplierImpl(matrixList))).start();
		
	}
}
