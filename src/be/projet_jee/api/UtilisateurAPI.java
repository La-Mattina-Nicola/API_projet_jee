package be.projet_jee.api;
import java.sql.Connection;
import java.sql.SQLException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import be.projet_jee.dao.ApiConnexion;
import be.projet_jee.dao.UtilisateurDAO;
import be.projet_jee.pojo.Utilisateur;
import be.projet_jee.pojo.*;

@Path("/Utilisateur")
public class UtilisateurAPI extends RestApplication {
	
	private Connection conn;	
	private Response response;
	
	
	@Path("test")
	@GET
	public String test() {
		return "TEST";
	}
	
	@Path("Connexion")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUtilisateur(
			@FormParam("email") String email,
			@FormParam("mdp") String mdp) {
		
		conn = ApiConnexion.getInstance();
		System.out.println(conn.toString());
		Utilisateur u = new UtilisateurDAO(conn).find(email, mdp);
		if(u != null)
			response = Response.status(Response.Status.OK).entity(u).build();
		else
			response = Response.status(Response.Status.NO_CONTENT).entity(null).build();
		System.out.println(response.toString());
		
		return response;
	}

}
