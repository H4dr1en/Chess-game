package model.strategy;

public class FouStrategy implements PieceStrategy {	
	
	//create an object of SingleObject
	private static FouStrategy instance = new FouStrategy();

	//make the constructor private so that this class cannot be
	//instantiated
	private FouStrategy(){}

	//Get the only object available
	public static FouStrategy getInstance() {
		return instance;
	}

	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal,
			boolean isCatchOk, boolean isCastlingPossible) {
		
		boolean ret = false;
		
		if (Math.abs(yFinal - yInit) == Math.abs(xFinal - xInit)) {
			ret  = true;
		}		
		
		return ret;
	}

}
