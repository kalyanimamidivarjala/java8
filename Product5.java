package com.sathya.java8;

public class Product5 {
	private int pid;
	private String pname;
	private double pcost;
	public Product5(int pid, String pname, double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Product Details [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	
}
