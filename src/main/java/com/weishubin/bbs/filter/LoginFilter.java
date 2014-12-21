package com.weishubin.bbs.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.weishubin.bbs.util.R;

/**
 * Login check 
 */
public class LoginFilter implements Filter {
	
	private static Logger logger = LoggerFactory.getLogger(LoginFilter.class);
	
	private String loginUrl;
	
	private String loginActionUrl;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest r, ServletResponse p,
			FilterChain chain) throws IOException, ServletException {
		
		logger.debug("login filter");
		
		HttpServletRequest request = (HttpServletRequest) r;
		HttpServletResponse resp  = (HttpServletResponse) p;
		
		String path = request.getServletPath();
		HttpSession session = request.getSession();
		
		logger.debug("path:" + path);
		
		boolean isLogin = session.getAttribute(R.USER_ID) != null;
		if (!path.equals(loginUrl) && !path.equals(loginActionUrl) && !isLogin) {
			logger.debug("not login, redirect");
			resp.sendRedirect(request.getContextPath() + loginUrl);
		} else {
			logger.debug("login");
			chain.doFilter(r, p);
		}
	}
	
	

	public void init(FilterConfig config) throws ServletException {
		loginUrl = config.getInitParameter("loginUrl");
		loginActionUrl = config.getInitParameter("loginActionUrl");
		
		logger.info("loginUrl from web.xml:" + loginUrl);
		logger.info("loginActionUrl from web.xml:" + loginActionUrl);
	}
}
