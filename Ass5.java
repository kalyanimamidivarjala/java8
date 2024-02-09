package com.sathya.java8;

import java.util.List;

public class Ass5 {

	public static void main(String[] args) {
		List<Product5>products=List.of(new Product5(101, "AC", 459000.76),
				new Product5(101, "Fan", 6543.76),
				new Product5(101, "Laptop", 49000.76),
				new Product5(101, "Phone", 49000.76));
		products.forEach(pd->System.out.println(pd));

	}

}
