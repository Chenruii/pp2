package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Client;

public class ModeleClient {
	public static ArrayList<Client> selectAll(){
		
		ArrayList<Client> lesClients = new ArrayList<Client>();
		String requete ="Select * from client ; ";
		try {
			Bdd uneBdd = new Bdd("localhost","ppe2","root","");
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next()){
				
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String mail = unRes.getString("mail");
				String adresse = unRes.getString("adresse");
				int idClient =unRes.getInt("idClient");
				Client unClient = new Client(idClient,nom, prenom, mail, adresse);
				lesClients.add(unClient);
			}
			unStat.close();
			unRes.close();
			uneBdd.seDeconnecter();
		} catch (SQLException exp) {
			System.out.println("Erreur d'execution de la requete: "+requete);
		}
		return lesClients;
	}
}
