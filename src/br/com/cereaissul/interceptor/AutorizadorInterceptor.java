package br.com.cereaissul.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller)
			throws Exception {
		String uri = request.getRequestURI();
		if (uri.endsWith("loginForm") || uri.endsWith("efetuaLogin") || uri.contains("resources")
				|| uri.contains(".css") || uri.contains(".js") || uri.contains(".jpg") || uri.contains(".png")
				|| uri.contains(".ico") || uri.contains(".less") || uri.contains(".ttf") || uri.contains(".woff")
				|| uri.contains(".woff2") || uri.contains(".svg") || uri.contains(".otf") || uri.contains(".scss")
				|| uri.contains(".eot") || uri.contains(".map") || uri.contains(".tag") || uri.contains(".MF")) {
			return true;
		}
		if (request.getSession().getAttribute("usuarioLogado") != null) {
			return true;
		}
		response.sendRedirect("loginForm");
		return false;
	}
}
