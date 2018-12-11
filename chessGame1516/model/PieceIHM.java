package model;

import model.Couleur;
import model.data.PieceIHMs;

public class PieceIHM implements PieceIHMs {
	
	Pieces piece;
	
	public PieceIHM (Pieces p) {
		this.piece = p;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.piece.getX();
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.piece.getY();
	}

	@Override
	public Couleur getCouleur() {
		// TODO Auto-generated method stub
		return this.piece.getCouleur();
	}

	@Override
	public String getNamePiece() {
		// TODO Auto-generated method stub
		return this.piece.getName();
	}
	
	public String toString() {
		return this.piece.toString();
	}
	
}
