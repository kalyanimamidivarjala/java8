package com.sathya.java8;

import java.util.Map;

public class Ass6 {

	public static void main(String[] args) {
		Map<Integer, Customer> cust=Map.of(1,new Customer("Mamidi", "Kalyani", "kalyani@gmail.com", 9123456991L),
				2,new Customer("Mamidi", "Hari", "hari@gmail.com", 9123446991L),
				3,new Customer("Mamidi", "Siri", "siri@gmail.com", 9122456991L),
				4,new Customer("Mamidi", "Yeshu", "yeshu@gmail.com", 8123456991L));
		
			cust.forEach((key,value)->System.out.println("s.no"+key+" "+value));
	}

}
