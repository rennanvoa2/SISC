package br.com.cereaissul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RelatoriosController {
	@RequestMapping("relatorios")
	public String relatorios() {
		return "relatorios/relatorios";
	}
	@RequestMapping("listaContratosDeCompra")
	public String listaContratosDeCompra() {
		return "relatorios/lista-contratos-de-compra";
	}
	@RequestMapping("listaContratosDeVenda")
	public String listaContratosDeVenda() {
		return "relatorios/lista-contratos-de-venda";
	}
}
