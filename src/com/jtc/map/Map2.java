package com.jtc.map;

import java.util.Arrays;
import java.util.List;

public class Map2 {
public static void main(String[] args) {
	
	
	List<String> name = Arrays.asList("Ashok","Asmita","sruti","tapas");

	name.stream().filter(a->a.startsWith("A"))
	.map(n->n +"-"+n.length()).forEach(n->System.out.println(n));
     
}
}
