package br.com.cereaissul.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.cereaissul.contrato.ContratoDeCompra;
import br.com.cereaissul.factory.ConnectionFactory;

public class ContratosDeCompraDao {
	private Connection connection;

	public ContratosDeCompraDao() {
		try {
		this.connection = new ConnectionFactory().getConnection();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public ContratosDeCompraDao(Connection connection) {
		this.connection = connection;
	}
	public void adiciona(ContratoDeCompra contrato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("insert into contratos "
					+ "(nomeProdutor, produto, quantidadeKg, dataNegociacao, valor) " + "values (?,?,?,?,?)");
			stmt.setString(1, contrato.getNomeProdutor());
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

	public List<ContratoDeCompra> getLista() {
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from contratos");
			List<ContratoDeCompra> contratos = new ArrayList<>();
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ContratoDeCompra contrato = new ContratoDeCompra();
				contrato.setId(rs.getLong("id"));
				contrato.setNomeProdutor(rs.getString("nomeProdutor"));
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

//	public long retornaMaior() {
//		try {
//		PreparedStatement stmt = connection.prepareStatement("select MAX(id) from contratos");
//		ResultSet rs = stmt.executeQuery();
//		long valor = 0;
//		if(rs.next()) {
//			valor = rs.getLong("max(id)");
//		}
//		stmt.close();
//		rs.close();
//		return valor;
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//		
//	}

	public ContratoDeCompra retornaMaior() {
		try {
		PreparedStatement stmt = connection.prepareStatement("SELECT id, nomeProdutor, produto, quantidadeKg, dataNegociacao, valor FROM CONTRATOS WHERE ID = (SELECT MAX(ID) FROM CONTRATOS)"); 
		ResultSet rs = stmt.executeQuery();
		ContratoDeCompra contrato = new ContratoDeCompra();
		if(rs.next()) {
			contrato.setId(rs.getLong("id"));
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNegociacao"));
			contrato.setDataNegociacao(data);
			contrato.setNomeProdutor(rs.getString("nomeProdutor"));
			contrato.setProduto(rs.getString("produto"));
			contrato.setQuantidadeKg(rs.getLong("quantidadeKg"));
			contrato.setValor(rs.getDouble("valor"));
		}
		stmt.close();
		rs.close();
		return contrato;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
