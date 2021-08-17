package be.projet_jee.pojo;

import java.util.*;

public class Facture {

	// Attributes/Variables
	
	private int id;
	private double prixTotal;
	private TypeDePanne typeDePanne;
	private List<TypeDePanne> typeDePannesList = new ArrayList<TypeDePanne>();
	private Voiture voiture;
	
	// Getters & Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	
	public List<TypeDePanne> getTyepDePannesList() {
		return typeDePannesList;
	}
	public void setTyepDePannesList(List<TypeDePanne> tyepDePannesList) {
		this.typeDePannesList = tyepDePannesList;
	}
		
	public void addTypeDePanne(TypeDePanne typeDePanne) 
	{
			this.typeDePannesList.add(typeDePanne);
	}
	
	public void removeTypeDePanne(TypeDePanne typeDePanne)
	{
		this.typeDePannesList.remove(typeDePanne);
	}
	
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	// Constructor

	public Facture() {}
	
	public Facture(int id, double prixTotal, Voiture voiture) 
	{
		this.id = id;
		this.prixTotal = prixTotal;
		this.voiture = voiture;
	}
	
	// Methodes
	
}