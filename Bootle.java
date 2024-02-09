package com.sathya.java8;

public class Bootle {
 private String name;
 private String color;
 private double price;
 private String madein;
public Bootle(String name, String color, double price, String madein) {
	super();
	this.name = name;
	this.color = color;
	this.price = price;
	this.madein = madein;
}
@Override
public String toString() {
	return "Bootle [name=" + name + ", color=" + color + ", price=" + price + ", madein=" + madein + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getMadein() {
	return madein;
}
public void setMadein(String madein) {
	this.madein = madein;
}
 
}
