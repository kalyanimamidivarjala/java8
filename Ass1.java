package com.sathya.java8;
@FunctionalInterface
interface Person{
	void eat();
}
public class Ass1  {

	public static void main(String[] args) {
		
		Person p=()->System.out.println("I like Biriyani");
		p.eat();
	}

	

}
