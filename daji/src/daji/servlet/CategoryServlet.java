package daji.servlet;

import java.util.List;

import daji.bean.Category;
import daji.util.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CategoryServlet extends BaseServlet {
	public String list(HttpServletRequest req, HttpServletResponse res, Page page){
		List<Category> cs=categoryDao.list(page.getStart(), page.getCount());
		int total=categoryDao.getTotal();
		page.setTotal(total);
		
		req.setAttribute("cs", cs);
		req.setAttribute("page", page);
		
		return "admin/listCategory.jsp";
	}

}