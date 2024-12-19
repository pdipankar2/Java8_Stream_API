package com.jtc.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {

		List<String> java = Arrays.asList("spring", "hibernet", "jdbc","servlet","ms");
		List<String> courses = Arrays.asList("Java", "python", "angular","html","js");

		
		Stream<List<String>> stream = Stream.of(java,courses);
	
		//stream.forEach(a->System.out.println(a));
		
		
		Stream<String> flatMap = stream.flatMap(a->a.stream());
		flatMap.forEach(a->System.out.println(a));
	}
}
