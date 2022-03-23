package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controleur.Gestion;
import controleur.Profil;

public class General extends JFrame implements ActionListener{
	
	private JMenuBar uneBarre = new JMenuBar();
	private JMenu menuFichier = new JMenu("Fichier");
	private JMenu menuGestion = new JMenu("Gestion");
	private JMenu menuAide = new JMenu("Aide");
	
	private JMenuItem itemProfil = new JMenuItem("Profil");
	private JMenuItem itemModifier = new JMenuItem("Modifier");
	private JMenuItem itemQuitter = new JMenuItem("Quitter");
	private JMenuItem itemLister = new JMenuItem("Lister Clients");
	
	private VueClient uneVueClient = new VueClient();
	private VueAccueil uneVueAcceuil;
	
	public General(Profil unProfil){
		
		this.setBounds(200,200,500,400);
		this.setLayout(null);
		this.setResizable(false);
		this.uneVueAcceuil =new VueAccueil(unProfil);
		this.add(uneVueAcceuil);
		/*this.add(uneVueClient);*/
		this.uneBarre.add(this.menuFichier);
		this.uneBarre.add(this.menuGestion);
		this.uneBarre.add(this.menuAide);
		this.menuFichier.add(itemProfil);
		this.menuFichier.add(itemModifier);
		this.menuFichier.add(itemQuitter);
		this.menuGestion.add(itemLister);
		this.setJMenuBar(this.uneBarre);
		
		this.itemLister.addActionListener(this);
		this.itemQuitter.addActionListener(this);
		this.setVisible(true);
	
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.itemQuitter){
			
			Gestion.rendreVisible(true);
			this.setVisible(false);
			
		}
		else if(e.getSource()==this.itemLister){
			//rendre visible panel Clients
			this.add(uneVueClient);
			uneVueAcceuil.setVisible(false);
			uneVueClient.setVisible(true);
		}
	}
}