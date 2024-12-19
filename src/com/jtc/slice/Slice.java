package com.jtc.slice;

import java.util.Arrays;
import java.util.List;

public class Slice {
	
	public static void main(String[] args) {
		
		List<String> java = Arrays.asList("spring", "hibernet", "jdbc","servlet","ms");

		
		java.stream().limit(2).forEach(c->System.out.println(c));
		
	}

}
