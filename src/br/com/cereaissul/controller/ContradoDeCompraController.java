package br.com.cereaissul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cereaissul.DAO.ContratosDeCompraDao;
import br.com.cereaissul.contrato.ContratoDeCompra;

@Controller
public class ContradoDeCompraController {
	@RequestMapping("codigoDeCompra")
	public String compra(@ModelAttribute("contrato") ContratoDeCompra contrato) {
		ContratosDeCompraDao dao = new ContratosDeCompraDao();
		dao.adiciona(contrato);
		return "ContratosDeCompra/contrato-adicionado";
	}
	
	@RequestMapping("novoContratoDeCompra")
	public String contratoDeCompra() {
		return "ContratosDeCompra/contrato-de-compra";
	}


}
