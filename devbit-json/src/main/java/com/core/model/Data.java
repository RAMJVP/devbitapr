package com.core.model;
public class Data{
    public double price;
    public String color;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Data [price=" + price + ", color=" + color + "]";
	}
    
    
    
}

