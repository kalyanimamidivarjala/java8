package com.sathya.java8;

public class Customer {
	private String firstname;
	private String secondname;
	private String email;
	private Long mobile;
	public Customer(String firstname, String secondname, String email, Long mobile) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", secondname=" + secondname + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	
}
