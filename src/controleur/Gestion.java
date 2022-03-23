package controleur;

import javax.swing.JFrame;

import vue.Background;
import vue.Connexion;

public class Gestion {
	
	public static Connexion uneConnexion;
	
	public Gestion(){
		
		/*Background background = new Background();
		
		JFrame f = new JFrame();
		f.add(background);
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);*/
		uneConnexion = new Connexion();
		uneConnexion.rendreVisible(true);
	}

	public static void main(String[] args) {
		
		/*Background background = new Background();
		
		JFrame f = new JFrame();
		f.add(background);
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);*/
		new Gestion();
		
	}
	
	public static void rendreVisible(boolean valeur){
		
		uneConnexion.rendreVisible(valeur);
	}
}
