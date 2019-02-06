package br.com.cereaissul.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cereaissul.DAO.JdbcUsuarioDao;
import br.com.cereaissul.usuario.Usuario;

@Controller
public class LoginController {
	@RequestMapping("loginForm")
	public String login() {
		return "login";
	}
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if(new JdbcUsuarioDao().existeUsuario(usuario) ) {
			session.setAttribute("usuarioLogado", usuario);
			return "index";
		}
		return "redirect:loginForm";
	}
	@RequestMapping("logout")
		public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginForm";
	}
	@RequestMapping("inicial")
	public String inicial() {
		return "index2";
	}
}
