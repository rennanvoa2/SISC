package br.com.cereaissul.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cereaissul.sisc.analise.AnaliseDeCompra;
import br.com.cereaissul.sisc.analise.AnaliseDeVenda;
import br.com.cereaissul.sisc.parametros.ParamCompra;

@Controller
public class PlanilhaController {
	@RequestMapping("adicionarNovoParamCompra")
	public String novoParamCompra(ParamCompra novoParamCompra, HttpSession session) {
		session.setAttribute("novoParamCompra", novoParamCompra);
		AnaliseDeCompra analise = new AnaliseDeCompra(novoParamCompra);
		session.setAttribute("analise", analise);

		return "forward:adicionaNovoParamVenda";
	}

	@RequestMapping("adicionaNovoParamVenda")
	public String novoParamVenda(HttpSession session) {
		ParamCompra compra = (ParamCompra) session.getAttribute("novoParamCompra");
		AnaliseDeCompra analise = (AnaliseDeCompra) session.getAttribute("analise");
		AnaliseDeVenda venda = new AnaliseDeVenda(compra, analise);
		session.setAttribute("venda", venda);
		return "Planilha/analise";
	}

	@RequestMapping("parametrosDeCompra")
	public String parametrosDeCompra() {
		return "Planilha/parametrosDeCompra";
	}

	@RequestMapping("recebeParamPlanilha")
	public String calculaCustos() {
		return "";
	}
}
