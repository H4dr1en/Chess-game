package model;

import java.util.ArrayList;
import java.util.List;

import Observable.IObservable;
import Observable.IObserver;

public class ChessGame implements BoardGames, IObservable {
	
	protected Echiquier echiquier;
	
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	public ChessGame() {
		this.echiquier = new Echiquier();
	}

	@Override
	public boolean move(int xInit, int yInit, int xFinal, int yFinal) {
		
		if(!this.echiquier.isMoveOk(xInit, yInit, xFinal, yFinal)) {
			return false;			
		}
		
		if(this.echiquier.move(xInit, yInit, xFinal, yFinal)) {
			this.echiquier.switchJoueur();
			this.notifyObservers();
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isEnd() {		
		return this.echiquier.isEnd();
	}

	@Override
	public String getMessage() {
		return this.echiquier.getMessage();
	}

	@Override
	public Couleur getColorCurrentPlayer() {
		return this.echiquier.getColorCurrentPlayer();
	}

	@Override
	public Couleur getPieceColor(int x, int y) {
		return this.echiquier.getPieceColor(x,y);
	}
	
	
	
	public String toString() {
		return this.echiquier.toString() + this.getMessage();
	}
	
	

	@Override
	public void attach(IObserver o) {
		this.observers.add(o);
		o.update(this.echiquier.getPiecesIHM());
	}

	@Override
	public boolean detach(IObserver o) {
		return this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (IObserver o : this.observers) {
			o.update(this.echiquier.getPiecesIHM());
		}				
	}

	public List<Coord> getPossibleMoves(Coord initCoord) {
		return this.echiquier.getPossibleMoves(initCoord);
	}

}
