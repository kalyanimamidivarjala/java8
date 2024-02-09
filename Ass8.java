package com.sathya.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ass8 {
//clonabel,serialisation,deserialisation..
	//java 9 to 11 features
	public static void main(String[] args) {
		List<Student8> stu=Arrays.asList(
				new Student8(2301, "Kalyani", 99.0f, 86.3f, 88.0f),
				new Student8(2301, "Ramya", 89.0f, 89.3f, 85.0f),
				new Student8(2301, "anu", 9.0f, 6.3f, 78.0f),
				new Student8(2301, "pooja", 89.0f, 85.3f, 89.0f));
		//to add the marks
		List<Float> ss= stu.stream()
		.map(s->(s.getMaths()+s.getScience()+s.getScience()))
		.collect(Collectors.toList());
		System.out.println(ss);
		//print marks>150
		ss.stream()
		.filter(s1->s1>150)
		.forEach(s1->System.out.println(s1));
		//print marks average>50
		ss.stream()
		.map(s2->s2/3)
		.filter(s2->s2>50)
		.forEach(s2->System.out.println(s2));

	}
}


