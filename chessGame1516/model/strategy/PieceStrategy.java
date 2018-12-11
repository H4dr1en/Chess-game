package model.strategy;

public interface PieceStrategy {
	
	boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible);

}
