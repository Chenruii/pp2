package controleur;

public class Profil {

	private String login, mail, nom , prenom, mdp, statut, adresse;
	
	public Profil(String login, String mail, String nom, String prenom, String mdp, String statut, String adresse){
		
		this.login = login;
		this.mail = mail;
		this.nom = nom; 
		this.prenom = prenom;
		this.mdp = mdp;
		this.statut = statut;
		this.adresse = adresse;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
