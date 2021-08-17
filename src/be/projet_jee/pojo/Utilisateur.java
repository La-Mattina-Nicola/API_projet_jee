package be.projet_jee.pojo;

import be.projet_jee.dao.DAO;

public abstract class Utilisateur {
	
	int id;
	String type_utilisateur;
	String nom;
	String prenom;
	
	String rue;
	int numero;
	String ville;
	int code_postal;
	
	String email;
	String mot_de_passe;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType_utilisateur() {
		return type_utilisateur;
	}
	public void setType_utilisateur(String type_utilisateur) {
		this.type_utilisateur = type_utilisateur;
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
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(int id, String type_utilisateur, String nom, String prenom, String rue, int numero, String ville,
			int code_postal, String email, String mot_de_passe) {
		super();
		this.id = id;
		this.type_utilisateur = type_utilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.numero = numero;
		this.ville = ville;
		this.code_postal = code_postal;
		this.email = email;
		this.mot_de_passe = mot_de_passe;
	}
}
