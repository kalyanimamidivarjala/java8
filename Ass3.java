package com.sathya.java8;



interface Service{
	public String voteCheck(String name,int age,String location);
}

public class Ass3 {

	public static void main(String[] args) {
		Service s1=( name, age, location)->{return (age>=18 && location.equals("Hyderabad")?"True":"false");};
		String s= s1.voteCheck("Kalayani", 22, "Hyderabad");
		String ss=s1.voteCheck("ramya", 21, "sirisilla");
		System.out.println(s);
		System.out.println(ss);
	}

}
