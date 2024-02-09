package com.sathya.java8;

import java.util.List;

public class Ass9 {

	public static void main(String[] args) {
		List<Bootle> bootles=List.of(new Bootle("Milton", "Red", 654.89, "India"),
				new Bootle("Kelli", "Green", 604.89, "India"),
				new Bootle("Ravayaz", "Orangr", 454.89, "SouthAfrica"),
				new Bootle("Sanco", "Ash", 651.89, "Srilanka"));
		bootles.stream()
			.filter(color->color.getColor().equals("Red"))
			.forEach(color->System.out.println("Red color bottel"+color));
		bootles.stream()
				.filter(p->p.getPrice()>100)
				.forEach(p->System.out.println(p));
		bootles.stream()
		
		.forEach(p->System.out.println(p));
		
		

	}

}
