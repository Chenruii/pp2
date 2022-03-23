package controleur;

public class Client {
	
	private int idClient;
	private String nom, prenom, mail, adresse;
	
	public Client(){
		
		this.idClient = 0;
		this.nom =this.prenom=this.adresse=this.mail="";
	}
	public Client(int idClient, String nom, String prenom, String adresse, String mail){
		
		this.idClient = idClient;
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.adresse=adresse;
	}
	public Client(String nom, String prenom, String adresse, String mail){
		
		this.idClient = 0;
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.adresse=adresse;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
