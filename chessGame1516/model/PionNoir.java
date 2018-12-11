package model;

public class PionNoir extends Pion {

	public PionNoir(Couleur couleur_de_piece, Coord coord) {
		super(couleur_de_piece, coord);
		this.direction = -1;
	}
}
