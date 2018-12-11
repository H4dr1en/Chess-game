package launcher.localLauncher;

import java.util.Observer;

import model.ChessGame;
import vue.ChessGameCmdLine;
import controler.ChessGameControler;
import controler.ChessGameControlers;



/**
 * @author francoise.perrin
 * Lance l'exécution d'un jeu d'échec en mode console.
 */
public class LauncherCmdLine {
	
	public static void main(String[] args) {		
		
		ChessGame model = new ChessGame();	
		ChessGameControlers controler = new ChessGameControler(model);
		ChessGameCmdLine vue = new ChessGameCmdLine(controler);
		
		model.attach(vue);
		
		//new ChessGameCmdLine(controler);
	
		vue.go();
	}

}
