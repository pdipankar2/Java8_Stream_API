package com.jtc;

import java.util.Arrays;
import java.util.List;

public class MapOpreation {
public static void main(String[] args) {
	
	
	List<String> country = Arrays.asList("india","usa","china");
	
	country.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
}


}
