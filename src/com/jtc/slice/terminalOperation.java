package com.jtc.slice;

import java.util.Optional;
import java.util.stream.Stream;

public class terminalOperation {
	public static void main(String[] args) {
		
		person p1 =new person("dipankar", "india");
		person p2 =new person("Jack", "usa");

		person p3 =new person("sukura", "japan");
		person p4 =new person("kim", "china");
		person p5 =new person("tarik", "uae");

		
		Stream<person> person = Stream.of(p1,p2,p3,p4,p5);
	
		
		
		
		
		
		/*
		 * boolean anyMatch = person.anyMatch(p->p.country.equals("china"));
		 * System.out.println(anyMatch);
		 * 
		 * boolean noMatch = person.noneMatch(p->p.country.equals("canada"));
		 * System.out.println(noMatch);
		 */
	
		System.out.println("=====================");
	  Optional<com.jtc.slice.person> first = person.filter(p->p.country.equals("india"))
	    .findFirst();
	
	if(first.isPresent()) {
		System.out.println(first.get());
	}
	
	 
	
	}

}
class person{
	
	String name;
	String country;
	
	public person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", country=" + country + "]";
	}
	
	
}