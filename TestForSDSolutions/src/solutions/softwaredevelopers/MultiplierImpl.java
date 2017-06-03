package solutions.softwaredevelopers;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiplierImpl implements Runnable {

	private static Logger logger = Logger.getLogger(MultiplierImpl.class.getName());
	private CopyOnWriteArrayList<Integer> matrixList;

	@Override
	public void run() {
		long result = 1;
		for (int element : matrixList) {
			result *= element;
		}
		logger.log(Level.INFO, "Result = " + result);
	}

	public MultiplierImpl(CopyOnWriteArrayList<Integer> incomeMatrix) {
		this.matrixList = incomeMatrix;
	}

}
