package model.strategy;

public class CavalierStrategy implements PieceStrategy {	
	
	//create an object of SingleObject
	private static CavalierStrategy instance = new CavalierStrategy();

	//make the constructor private so that this class cannot be
	//instantiated
	private CavalierStrategy(){}

	//Get the only object available
	public static CavalierStrategy getInstance() {
		return instance;
	}

	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal,
			boolean isCatchOk, boolean isCastlingPossible) {
		
		boolean ret = false;
		
		if ((Math.abs(xFinal - xInit) + Math.abs(yFinal - yInit)) == 3) {
			
			if ((Math.abs(xFinal - xInit)<3) && (Math.abs(yFinal - yInit)<3)) {
				ret  = true;
			}		
		}	
		
		return ret;
	}

}
