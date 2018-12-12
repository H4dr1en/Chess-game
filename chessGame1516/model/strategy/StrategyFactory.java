package model.strategy;

public class StrategyFactory {
	
	private StrategyFactory() { }
	
	public static PieceStrategy getStrategy(int col) throws Exception{
		switch(col) {
		
			case 0: case 7:
				return TourStrategy.getInstance();
			case 2: case 5:
				return FouStrategy.getInstance();
			case 1: case 6:
				return CavalierStrategy.getInstance();
			default:
				throw new Exception("Invalid col:" + col);			
		}
	}
}
