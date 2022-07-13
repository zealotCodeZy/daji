package daji.servlet;

//import java.io.InputStream;

import java.lang.reflect.Method;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;

import daji.dao.CategoryDAO;
import daji.util.Page;

public abstract class BaseServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract String list(HttpServletRequest req, HttpServletResponse res, Page page);
	
	protected CategoryDAO categoryDao=new CategoryDAO();
	
	public void service(HttpServletRequest req, HttpServletResponse res){
		int start=0;
		int count=5;
		if(null!=req.getParameter("page.start")){
			start=Integer.parseInt(req.getParameter("page.start"));
		}
		if(null!=req.getParameter("page.count")){
			count=Integer.parseInt(req.getParameter("page.count"));
		}
		Page page=new Page(start,count);
		
		String method=(String)req.getAttribute("method");
		try {
			Method m=this.getClass().getMethod(method, javax.servlet.http.HttpServletRequest.class,
						javax.servlet.http.HttpServletResponse.class,Page.class);
			String redirect=m.invoke(this,req,res,page).toString();
			
			req.getRequestDispatcher(redirect).forward(req, res);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
