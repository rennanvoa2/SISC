package br.com.cereaissul.sisc.parametros;

public class ParamCompra {
	private long qtSacos;
	private double precoProdutor;
	private double valorDeVenda = 0;
	private String estadoSaidaMaterial;
	private String estadoFilial;
	private String atividadeCompra;
	private String proRural;
	private String funRural;
	private String tipoFreteCompra;
	private double valorFreteCompra = 0;
	private String pfOuPjCompra;
	private String material;
	private String estadoCliente;
	private String atividadeVenda;
	private String tipoFreteVenda;
	private double valorFreteVenda = 0;
	private String pfOuPjVenda;
	
	
	
	
	public double getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public double getPrecoProdutor() {
		return precoProdutor;
	}

	public void setPrecoProdutor(double precoProdutor) {
		this.precoProdutor = precoProdutor;
	}


	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public long getQtSacos() {
		return qtSacos;
	}

	public void setQtSacos(long qtSacos) {
		this.qtSacos = qtSacos;
	}

	public String getEstadoSaidaMaterial() {
		return estadoSaidaMaterial;
	}

	public void setEstadoSaidaMaterial(String estadoSaidaMaterial) {
		this.estadoSaidaMaterial = estadoSaidaMaterial;
	}

	public String getEstadoFilial() {
		return estadoFilial;
	}

	public void setEstadoFilial(String estadoFilial) {
		this.estadoFilial = estadoFilial;
	}

	public String getAtividadeCompra() {
		return atividadeCompra;
	}

	public void setAtividadeCompra(String atividade) {
		this.atividadeCompra = atividade;
	}

	public String getProRural() {
		return proRural;
	}

	public void setProRural(String proRural) {
		this.proRural = proRural;
	}

	public String getFunRural() {
		return funRural;
	}

	public void setFunRural(String funRural) {
		this.funRural = funRural;
	}

	public String getTipoFreteCompra() {
		return tipoFreteCompra;
	}

	public void setTipoFreteCompra(String tipo) {
		this.tipoFreteCompra = tipo;
	}

	public double getValorFreteCompra() {
		return valorFreteCompra;
	}

	public void setValorFreteCompra(double valorFreteCompra) {
		this.valorFreteCompra = valorFreteCompra;
	}


	public void setPfOuPjCompra(String pfOuPj) {
		this.pfOuPjCompra = pfOuPj;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public String getAtividadeVenda() {
		return atividadeVenda;
	}

	public void setAtividadeVenda(String atividadeVenda) {
		this.atividadeVenda = atividadeVenda;
	}

	public String getTipoFreteVenda() {
		return tipoFreteVenda;
	}

	public void setTipoFreteVenda(String tipoFreteVenda) {
		this.tipoFreteVenda = tipoFreteVenda;
	}

	public double getValorFreteVenda() {
		return valorFreteVenda;
	}

	public void setValorFreteVenda(double valorFreteVenda) {
		this.valorFreteVenda = valorFreteVenda;
	}

	public String getPfOuPjVenda() {
		return pfOuPjVenda;
	}

	public void setPfOuPjVenda(String pfOuPjVenda) {
		this.pfOuPjVenda = pfOuPjVenda;
	}

	public String getPfOuPjCompra() {
		return pfOuPjCompra;
	}
	
}
