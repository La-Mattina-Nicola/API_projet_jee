package be.projet_jee.pojo;

public class Piece {
	
	// Attributes/Variables
	
	private int id;
	private String nom;
	private Double prix;
	private String typePiece;
	
	// Getters & Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public String getTypePiece() {
		return typePiece;
	}
	public void setTypePiece(String typePiece) {
		this.typePiece = typePiece;
	}
	
	// Constructor	

	public Piece() {}
	
	public Piece(int id, String nom, Double prix, String typePiece) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.typePiece = typePiece;
	}
	
	// Methodes
}