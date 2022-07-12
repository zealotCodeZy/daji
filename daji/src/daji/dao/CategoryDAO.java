package daji.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daji.util.DBUtil;
import daji.bean.Category;;

public class CategoryDAO {
	
	public Category get(int id){
		Category bean=null;
		try(Connection c=DBUtil.getConnection();Statement s=c.createStatement();){
			String sql="select * from Category where id="+id;
			ResultSet rs=s.executeQuery(sql);
			if(rs.next()){
				bean=new Category();
				String name=rs.getString(2);
				bean.setId(id);
				bean.setName(name);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return bean;
	}
	
	public int getTotal(){
		int total=0;
		try(Connection c=DBUtil.getConnection();Statement s=c.createStatement();){
			String sql="select count(*) from Category";
			ResultSet rs=s.executeQuery(sql);
			if(rs.next()){
				total=rs.getInt(1);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return total;
	}
	
	public List<Category> list(int start, int count){
		List<Category> beans=new ArrayList<Category>();
		String sql="select * from Category order by id asc limit?,?";
		try(Connection c=DBUtil.getConnection();PreparedStatement ps=c.prepareStatement(sql);){
			ps.setInt(1, start);
			ps.setInt(2, count);
			ResultSet rs=ps.executeQuery(sql);
			if(rs.next()){
				Category bean=new Category();
				int id=rs.getInt(1);
				String name=rs.getString(2);
				bean.setId(id);
				bean.setName(name);
				beans.add(bean);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return beans;
	}
	
	public List<Category> list(){
		return list(0,Short.MAX_VALUE);
	}
	

}
