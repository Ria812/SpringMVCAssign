package com.shop;

public class Product{
	

	String pid,pname,color,price,quantity;
	public Product(){
		
	}
	public Product(String pid, String pname, String color, String price, String quantity){
		this.pid=pid;
		this.pname= pname;
		this.color = color;
		this.price= price;
		this.quantity =quantity;
	}
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", color=" + color + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}
