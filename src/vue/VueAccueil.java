package vue;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controleur.Profil;

public class VueAccueil extends JPanel{
	
	public VueAccueil(Profil unProfil){
			
		this.setBounds(100,50,250,200);
		this.setBackground(Color.CYAN);
		this.setLayout(null);
		
		JTextArea titre = new JTextArea("Bienvenue M. \n"+"Nom: "+unProfil.getNom()+"\n"+"Prénom: "+unProfil.getPrenom());
		titre.setEditable(false);
		titre.setBounds(20,50,150,50);
		titre.setBackground(Color.CYAN);
		this.add(titre);
		
		this.setVisible(true);
	
	}
}
