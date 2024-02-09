package com.sathya.java8;

import java.util.List;

public class Ass7 {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(11,12,13,14,15,16,1,18,19,20);
		numbers.stream()
				.filter(num->num%2==0)
				.forEach(num->System.out.println(num));

	}

}
