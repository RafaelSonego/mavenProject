package br.com.rafaelsonego.mavenProject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	private static final Logger		log	= Logger.getLogger(AuthInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		try {
			log.info("AuthInterceptor: preHandle");
			return super.preHandle(request, response, handler);
		} catch (Exception ex) {
			log.error("Error");
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		try {
			log.info("AuthInterceptor: postHandle");
		} catch (Exception ex) {
			log.error("Error");
		}
	}
}
