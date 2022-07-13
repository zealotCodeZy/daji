package daji.util;

public class Page {
	private int start;
	private int count;
	private int total;
	private String param;
	
	public int getStart(){
		return start;
	}
	public void setStart(int start){
		this.start=start;
	}
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count=count;
	}
	public int getTotal(){
		return total;
	}
	public void setTotal(int total){
		this.total=total;
	}
	public String getParam(){
		return param;
	}
	public void setParam(String param){
		this.param=param;
	}
	public Page(int start, int count){
		super();
		this.start=start;
		this.count=count;
	}
	public int totalPageNums(){
		int t=0;
		if(0== total % count){
			t= total/count;
		}else{
			t= total/count+1;
		}
		if(0==t)t=1;
		return t;
	}
	public boolean hasPrePage(){
		if(0==start)return false;
		else return true;
	}
	public boolean hasNextPage(){
		if(start+count<=(total-1))return true;
		else return false;
	}

}
