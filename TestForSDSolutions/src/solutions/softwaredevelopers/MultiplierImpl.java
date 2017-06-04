package solutions.softwaredevelopers;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiplierImpl implements Runnable {

	private long result;
	private static int row;
	private int[][] matrix;
	private static Logger logger = Logger.getLogger(MultiplierImpl.class.getName());

	@Override
	public void run() {
		result = 1;
		Runnable rowsMult = new Runnable() {
			public void run() {
				for (int n = 0; n < matrix[row].length; n++) {
					result *= matrix[row][n];
				}
			}
		};

		for (int i = 0; i < matrix.length; i++) {
			final Semaphore semaphore = new Semaphore(1);
			try {
				semaphore.acquire();
				new Thread(rowsMult).start();
				row = i;
				semaphore.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		logger.log(Level.INFO, "Result = " + result);
	}

	public MultiplierImpl(int[][] incomeMatrix) {
		this.matrix = incomeMatrix;
	}

}
