package br.com.cereaissul.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.cereaissul.factory.ConnectionFactory;

public class PlanilhaDao {
	private final Connection connection;

	public PlanilhaDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public PlanilhaDao(Connection connection) {
		this.connection = connection;
	}

}
