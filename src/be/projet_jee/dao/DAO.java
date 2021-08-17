package be.projet_jee.dao;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> {
	protected Connection connect = null;

	public DAO(Connection conn) {
		this.connect = ApiConnexion.getInstance();
	}

	public abstract boolean create(T obj);
	public abstract boolean delete(T obj);
	public abstract boolean update(T obj);
	public abstract T find(int id);
	public abstract T find(String str1, String str2);
	public abstract List<T> getAll();
}