package daji.bean;
import java.util.Date;
//import java.util.List;

public class Product {
	private int id;
	private String name;
	private String subTitle;
	private float orignalPrice;
	private float promotePrice;
	private int stock;
	private Date createDate;
	private Category category;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getSubTitle(){
		return subTitle;
	}
	public void setSubTitle(String subTitle){
		this.subTitle=subTitle;
	}
	public float getOrignalPrice(){
		return orignalPrice;
	}
	public void setOrignalPrice(float orignalPrice){
		this.orignalPrice=orignalPrice;
	}
	public float getPromotePrice(){
		return promotePrice;
	}
	public void setPromotePrice(float promotePrice){
		this.promotePrice=promotePrice;
	}
	public int getStock(){
		return stock;
	}
	public void setStock(int stock){
		this.stock=stock;
	}
	public Date getCreateDate(){
		return createDate;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Category getCategory(){
		return category;
	}
	public void setCategory(Category category){
		this.category=category;
	}

}
