package launcher.localLauncher;

import java.awt.Dimension;
import javax.swing.JFrame;

import vue.ChessGameGUI;
import Observable.IObserver;
import model.ChessGame;
import controler.ChessGameControler;
import controler.ChessGameControlers;



/**
 * @author francoise.perrin
 * Lance l'exécution d'un jeu d'échec en mode graphique.
 * La vue (ChessGameGUI) observe le modèle (ChessGame)
 * les échanges passent par le contrôleur (ChessGameControlers)
 * 
 */
public class LauncherGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ChessGame chessGame = new ChessGame();	
		ChessGameControlers chessGameControler = new ChessGameControler(chessGame);
		Dimension dim = new Dimension(700, 700);
		JFrame frame = new ChessGameGUI("Jeu d'échec", chessGameControler,  dim);
		
		chessGame.attach((IObserver) frame);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(600, 10);
		frame.setPreferredSize(dim);
		frame.pack();
		frame.setVisible(true);
	}
}
