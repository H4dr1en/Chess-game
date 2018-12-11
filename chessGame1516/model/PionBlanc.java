package model;

public class PionBlanc extends Pion {

	public PionBlanc(Couleur couleur_de_piece, Coord coord) {
		super(couleur_de_piece, coord);
		this.direction = 1;
	}
}
