package br.com.cereaissul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cereaissul.DAO.ContratosDeVendaDao;
import br.com.cereaissul.contrato.ContratoDeVenda;

@Controller
public class ContratoDeVendaController {
	@RequestMapping("codigoDeVenda")
	public String venda(@ModelAttribute("contrato") ContratoDeVenda contrato){
		ContratosDeVendaDao dao = new ContratosDeVendaDao();
		dao.adiciona(contrato);
		return "ContratosDeVenda/contrato-adicionado";
	}
	@RequestMapping("novoContratoDeVenda")
	public String contratoDeVenda() {
		return "ContratosDeVenda/contrato-de-venda";
	}
}