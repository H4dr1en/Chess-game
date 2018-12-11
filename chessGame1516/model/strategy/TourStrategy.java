package model.strategy;

public class TourStrategy implements PieceStrategy {	
	
	//create an object of SingleObject
	private static TourStrategy instance = new TourStrategy();

	//make the constructor private so that this class cannot be
	//instantiated
	private TourStrategy(){}

	//Get the only object available
	public static TourStrategy getInstance() {
		return instance;
	}

	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal,
			boolean isCatchOk, boolean isCastlingPossible) {
		
		boolean ret = false;
		
		if ((yFinal == yInit) || (xFinal == xInit)) {
			ret = true;
		}
		
		return ret;
	}

}
