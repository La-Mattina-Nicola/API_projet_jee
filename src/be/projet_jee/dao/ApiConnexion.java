package be.projet_jee.dao;

import java.sql.*;

public class ApiConnexion {

	private static Connection conn = null;
	public static void setConnection(Connection conn) {
		ApiConnexion.conn = conn;
	}
	
	private String ip = "193.190.64.10";
	private String port = "1522";
	private String serviceName = "XEPDB1";
	private String chaineConnexion = "jdbc:oracle:thin:@//"+ip+":"+port+"/"+serviceName;
	
	private ApiConnexion() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(chaineConnexion, "STUDENT03_07", "Nico19101995");
		} catch (SQLException e) {
			System.out.println("******************* ERRRRRRRRREUUUUUUUUUUUUR" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("******************* ERRRRRRRRREUUUUUUUUUUUUR" + e.getMessage());
		}
	}

	public static Connection getInstance() {
		if (conn == null)
            new ApiConnexion();
		return conn;
	}
	
}
