package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controleur.Client;
import modele.ModeleClient;

public class VueClient extends JPanel implements ActionListener{
	
	private JLabel titre = new JLabel("Liste des Clients");
	private JTable tableClients;
	
	public VueClient(){
		
		this.setBounds(100,50,250,200);
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		this.titre.setBounds(20,10,150,50);
		this.add(this.titre);
		String titres[] = {"Id Client","Nom","Prénom","Mail","Adresse"};
		
		this.tableClients = new JTable(this.extraireClients(),titres);
		JScrollPane uneScroll = new JScrollPane(this.tableClients);
		uneScroll.setBounds(10,40,300,200);
		this.add(uneScroll);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	//remplir les clients
	
	public Object[][] extraireClients(){
		
		ArrayList<Client> lesClients = ModeleClient.selectAll();
		Object [][] donnees = new Object[lesClients.size()][5];
		int i = 0;
		for (Client unClient: lesClients){
			
			donnees[i][0] = unClient.getIdClient();
			donnees[i][1] = unClient.getNom();
			donnees[i][2] = unClient.getPrenom();
			donnees[i][3] = unClient.getMail();
			donnees[i][4] = unClient.getAdresse();
			i++;
		}
		return donnees;
	}
}
