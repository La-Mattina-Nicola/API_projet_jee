package be.projet_jee.pojo;


import java.sql.*;
import java.sql.Date;
import java.util.*;

public class TypeDePanne {

	// Atributes/Variables
	
	private int id;
	private String nom;
	private double prix;
	private Date temps;
	private Piece piece;
	private List<Piece> piecesList = new ArrayList<Piece>();
	
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
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Date getTemps() {
		return temps;
	}
	public void setTemps(Date temps) {
		this.temps = temps;
	}
	
	public List<Piece> getPiecesList() {
		return piecesList;
	}
	public void setPiecesList(List<Piece> piecesList) {
		this.piecesList = piecesList;
	}
	
	public void addPiece(Piece piece) 
	{
			this.piecesList.add(piece);
	}
	
	public void removePiece(Piece piece)
	{
		this.piecesList.remove(piece);
	}
	
	// Constructor
	
	public TypeDePanne() {}
	
	public TypeDePanne(int id, String nom, double prix, Date temps) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.temps = temps;
	}
	
	// Methodes
}