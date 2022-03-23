package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Profil;

public class Modele {
	
	public static ArrayList<Profil> selectAll(){
		
		ArrayList<Profil> lesProfils = new ArrayList<Profil>();
		String requete ="Select * from profil ; ";
		try {
			Bdd uneBdd = new Bdd("localhost","ppe2","root","");
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next()){
				
				String login = unRes.getString("login");
				String mail = unRes.getString("mail");
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String mdp = unRes.getString("mdp");
				String statut = unRes.getString("statut");
				String adresse = unRes.getString("adresse");
				Profil unProfil = new Profil(login, mail, nom, prenom, mdp, statut, adresse);
				lesProfils.add(unProfil);
			}
			unStat.close();
			unRes.close();
			uneBdd.seDeconnecter();
		} catch (SQLException exp) {
			System.out.println("Erreur d'execution de la requete: "+requete);
		}
		return lesProfils;
	}
	public static void insert(Profil unProfil){
		
		String requete ="insert into profil (login, mail, nom, prenom, mdp, statut, adresse)"
				+ " values( '"+unProfil.getLogin()+"',"
				+unProfil.getMail()+"','"
				+unProfil.getNom()+"',"
				+unProfil.getPrenom()+","
				+unProfil.getMdp()+","
				+unProfil.getStatut()+","
				+unProfil.getAdresse()+"); ";
		try {
			Bdd uneBdd = new Bdd("localhost","ppe2","root","");
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();
		} catch (SQLException exp) {
			
			System.out.println("Erreur d'execution requete: "+requete);
		}
	}
	
	public static void delete(String mail){
		
		String requete = "delete from profil where mail = '"+mail+"';";
		try {
			Bdd uneBdd = new Bdd("localhost","ppe2","root","");
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();
		} catch (SQLException exp) {
			
			System.out.println("Erreur d'execution requete: "+requete);
		}
	}
	
	public static Profil selectWhere (String login, String mdp){
		
		String requete = "select * from profil where login='"+login+"' and mdp = '"+mdp+"' ;";
		Profil unProfil = null;
		try {
			Bdd uneBdd = new Bdd("localhost","ppe2","root","");
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			if (unRes.next()){
				
				String mail = unRes.getString("mail");
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String statut = unRes.getString("statut");
				String adresse = unRes.getString("adresse");
				unProfil = new Profil(login, mail, nom, prenom, mdp, statut, adresse);
			}
			uneBdd.seDeconnecter();
			unStat.close();
			unRes.close();
			
		} catch (SQLException exp) {
			
			System.out.println("Erreur d'execution requete: "+requete);
		}
		return unProfil;
	}
	
	
}
