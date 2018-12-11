package model.strategy;

public class ReineStrategy implements PieceStrategy {	
	
	//create an object of SingleObject
	private static ReineStrategy instance = new ReineStrategy();

	//make the constructor private so that this class cannot be
	//instantiated
	private ReineStrategy(){}

	//Get the only object available
	public static ReineStrategy getInstance() {
		return instance;
	}

	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal,
			boolean isCatchOk, boolean isCastlingPossible) {
		
		boolean ret = false;
		
		if (Math.abs(yFinal - yInit) == Math.abs(xFinal - xInit)
				|| ((yFinal == yInit) || (xFinal == xInit))) {
			ret =  true;
		}
		
		return ret;
	}

}
