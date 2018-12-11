package controler;

import java.util.List;

import model.BoardGames;
import model.ChessGame;
import model.Coord;

public class ChessGameControler implements ChessGameControlers {
	
	ChessGame echec;
	
	public ChessGameControler(ChessGame cg) {
		this.echec = cg;
	}

	@Override
	public boolean move(Coord initCoord, Coord finalCoord) {		
		return this.echec.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
	}

	@Override
	public String getMessage() {
		return this.echec.getMessage();
	}

	@Override
	public boolean isEnd() {
		return this.echec.isEnd();
	}

	@Override
	public boolean isPlayerOK(Coord initCoord) {
		return this.echec.getColorCurrentPlayer() == this.echec.getPieceColor(initCoord.x, initCoord.y);
	}

	@Override
	public List<Coord> getPossibleMoves(Coord initCoord) {
		return this.echec.getPossibleMoves(initCoord);
	}
	
	

}
