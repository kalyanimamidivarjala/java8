package com.sathya.java8;

public class Student8 {
	private int rollno;
	private String name;
	private float maths;
	private float science;
	private float social;
	public Student8(int rollno, String name, float maths, float science, float social) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.social = social;
	}
	@Override
	public String toString() {
		return "Student8 [rollno=" + rollno + ", name=" + name + ", maths=" + maths + ", science=" + science
				+ ", social=" + social + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public float getScience() {
		return science;
	}
	public void setScience(float science) {
		this.science = science;
	}
	public float getSocial() {
		return social;
	}
	public void setSocial(float social) {
		this.social = social;
	}
	

}
