package br.com.cereaissul.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.cereaissul.contrato.ContratoDeVenda;
import br.com.cereaissul.factory.ConnectionFactory;

public class ContratosDeVendaDao {
	private Connection connection;

	public ContratosDeVendaDao() {
		try {
		this.connection = new ConnectionFactory().getConnection();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public ContratosDeVendaDao(Connection connection) {
		this.connection = connection;
	}
	public void adiciona(ContratoDeVenda contrato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("insert into contratosVenda "
					+ "(nomeCliente, produto, quantidadeKg, dataNegociacao, valor) " + "values (?,?,?,?,?)");
			stmt.setString(1, contrato.getNomeCliente());
			stmt.setString(2, contrato.getProduto());
			stmt.setLong(3, contrato.getQuantidadeKg());
			stmt.setDate(4, new Date(contrato.getDataNegociacao().getTimeInMillis()));
			stmt.setDouble(5, contrato.getValor());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<ContratoDeVenda> getLista() {
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from contratosVenda");
			List<ContratoDeVenda> contratos = new ArrayList<>();
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ContratoDeVenda contrato = new ContratoDeVenda();
				contrato.setId(rs.getLong("id"));
				contrato.setNomeCliente(rs.getString("nomeCliente"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNegociacao"));
				contrato.setDataNegociacao(data);
				contrato.setProduto(rs.getString("produto"));
				contrato.setQuantidadeKg(rs.getLong("quantidadeKg"));
				contrato.setValor(rs.getDouble("valor"));
				contratos.add(contrato);
			}
			rs.close();
			stmt.close();
			return contratos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
