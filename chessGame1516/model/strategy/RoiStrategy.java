package model.strategy;

public class RoiStrategy implements PieceStrategy {	
	
	//create an object of SingleObject
	private static RoiStrategy instance = new RoiStrategy();

	//make the constructor private so that this class cannot be
	//instantiated
	private RoiStrategy(){}

	//Get the only object available
	public static RoiStrategy getInstance() {
		return instance;
	}

	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal,
			boolean isCatchOk, boolean isCastlingPossible) {
		
		boolean ret = false;
		
		if ((Math.abs(yFinal - yInit) <= 1)
				&& (Math.abs(xFinal - xInit) <= 1)) {
			ret = true;
		}		
		
		return ret;
	}

}
