package daji.filter;
import java.io.IOException;

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
		
		
	}
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	

}
