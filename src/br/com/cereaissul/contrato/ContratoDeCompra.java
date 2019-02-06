package br.com.cereaissul.contrato;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class ContratoDeCompra {
	private long id;
	private String nomeProdutor;
	private String produto;
	private long quantidadeKg;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataNegociacao;
	private double valor;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeProdutor() {
		return nomeProdutor;
	}
	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public long getQuantidadeKg() {
		return quantidadeKg;
	}
	public void setQuantidadeKg(long quantidadeKg) {
		this.quantidadeKg = quantidadeKg;
	}
	public Calendar getDataNegociacao() {
		return dataNegociacao;
	}
	public void setDataNegociacao(Calendar dataNegociacao) {
		this.dataNegociacao = dataNegociacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
