package be.projet_jee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.projet_jee.pojo.*;

public class UtilisateurDAO extends DAO<Utilisateur> {

	public UtilisateurDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Utilisateur obj) {
		// TODO Auto-generated method stub
		PreparedStatement stmt;
		String query = "Insert into jee_Utilisateur (id, nom, prenom, adresse, email, mot_de_passe, type_utilisateur) VALUES (?, ?, ?, ?, ?)";
		try {
			stmt = connect.prepareStatement(query);
			stmt.setString(1, obj.getNom());
			stmt.execute();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Utilisateur obj) {
		return false;
	}

	@Override
	public boolean update(Utilisateur obj) {
		return false;
	}

	@Override
	public Utilisateur find(int id) {
		Utilisateur u = null;
		return u;
	}

	@Override
	public Utilisateur find(String email, String mdp) {
		Utilisateur u = null;
		String querry = "SELECT * FROM JEE_UTILISATEUR WHERE EMAIL='" + email + "' and mot_de_passe='" + mdp + "'";
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery(querry);
			if (result.first()) {
				// CHECK DISCRIMINATOR
				if(result.getString("type_utilisateur").equals("Client")) {

					u = new Client();
					u.setId(result.getInt("id"));
					u.setNom(result.getString("nom"));
					u.setPrenom(result.getString("prenom"));
					u.setEmail(result.getString("email"));
					u.setMot_de_passe(result.getString("mot_de_passe"));
					u.setType_utilisateur(result.getString("type_utilisateur"));
				}
				else if (result.getString("type_utilisateur").equals("Administrateur")) {

					u = new Administrateur();
					u.setId(result.getInt("id"));
					u.setNom(result.getString("nom"));
					u.setPrenom(result.getString("prenom"));
					u.setEmail(result.getString("email"));
					u.setMot_de_passe(result.getString("mot_de_passe"));
					u.setType_utilisateur(result.getString("type_utilisateur"));
				}
				else if (result.getString("type_utilisateur").equals("Garagiste")) {

					u = new Garagiste();
					u.setId(result.getInt("id"));
					u.setNom(result.getString("nom"));
					u.setPrenom(result.getString("prenom"));
					u.setEmail(result.getString("email"));
					u.setMot_de_passe(result.getString("mot_de_passe"));
					u.setType_utilisateur(result.getString("type_utilisateur"));
				}
				// SET des informations
			}
			return u;
		}
		catch (SQLException e)
		{
			return null;
		}
	}

	@Override
	public List<Utilisateur> getAll() {
		
		return null;
	}
}
