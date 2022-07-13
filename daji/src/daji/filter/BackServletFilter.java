package daji.filter;

import java.io.IOException;
import org.apache.commons.lang.StringUtils;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BackServletFilter implements Filter{
	public void destroy(){}
	
	@Override
	public void doFilter(ServletRequest sreq, ServletResponse sres, FilterChain fc) 
	throws IOException,ServletException{
		HttpServletRequest hsreq=(HttpServletRequest) sreq;
		HttpServletResponse hsres=(HttpServletResponse) sres;
		String context=hsreq.getContextPath();
		String uri=hsreq.getRequestURI();
		uri=StringUtils.remove(uri, context);
		if(uri.startsWith("admin_")){
			String servletPath=StringUtils.substringBetween(uri, "_", "_");
			String method=StringUtils.substringAfterLast(uri, "_");
			hsreq.setAttribute("method", method);
			sreq.getRequestDispatcher("/"+servletPath).forward(hsreq, hsres);
			return;
		}
		fc.doFilter(hsreq, hsres);
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter init");
	}
	

}
