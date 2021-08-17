package be.projet_jee.pojo;

import java.util.*;

public class Administrateur extends Utilisateur {
	private Client client = new Client();
	private List<Client> clientsList = new ArrayList<Client>();
	private Facture facture = new Facture();
	private List<Facture> facturesList = new ArrayList<Facture>();
	private TypeDePanne typeDePanne = new TypeDePanne();
	private List<TypeDePanne> typeDePannesList = new ArrayList<TypeDePanne>();
	private Piece piece = new Piece();
	private List<Piece> piecesList = new ArrayList<Piece>();
	
	// Getters & Setters
	
	public List<Client> getClientsList() {
		return clientsList;
	}

	public void setClientsList(List<Client> clientsList) {
		this.clientsList = clientsList;
	}
	
	public void addClient(Client client) 
	{
			this.clientsList.add(client);
	}
	
	public void removeClient(Client client)
	{
		this.clientsList.remove(client);
	}
	
	public List<Facture> getFacturesList() {
		return facturesList;
	}

	public void setFacturesList(List<Facture> facturesList) {
		this.facturesList = facturesList;
	}
	
	public void addFacture(Facture facture) 
	{
			this.facturesList.add(facture);
	}
	
	public void removeFacture(Facture facture)
	{
		this.facturesList.remove(facture);
	}
	
	public List<TypeDePanne> getTypeDePannesList() {
		return typeDePannesList;
	}

	public void setTypeDePannesList(List<TypeDePanne> typeDePannesList) {
		this.typeDePannesList = typeDePannesList;
	}
	
	public void addTypeDePanne(TypeDePanne typeDePanne) 
	{
			this.typeDePannesList.add(typeDePanne);
	}
	
	public void removeTypeDePanne(TypeDePanne typeDePanne)
	{
		this.typeDePannesList.remove(typeDePanne);
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
	
	public Administrateur() {}
	
}
