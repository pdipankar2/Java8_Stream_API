package com.jtc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameFilter {
	
	public static void main(String[] args) {
		
		/*
		 * List<String>names=Arrays.asList("Robin","tushar","Anupamap","Riddhi",
		 * "Anamika","deepika");
		 * 
		 * names.stream().filter(n->n.startsWith("R")).forEach(a->System.out.println(a))
		 * ;
		 */
		
		User u1=new User("Raju", 20);
		User u2=new User("Karim", 17);

		User u3=new User("Tapan", 15);
		User u4=new User("Rahaman", 66);
		User u5=new User("Naini", 33);
		User u6=new User("Dhanush", 22);
		User u7=new User("Ajik", 27);
		User u8=new User("jack", 44);
		
		Stream<User> filterstream = Stream.of(u1,u2,u3,u4,u5,u6,u7,u8);

	//	filterstream.filter(i->i.age<=20).forEach(i->System.out.println(i));
	
//apply two filter in the data
		
		filterstream.filter(i->i.age<=20 && i.name.startsWith("R"))
		.forEach(u->System.out.println(u));
	}

} 

class User{
	
	int age;
	String name;
	
	
	User(String name,int age){
		
		this.age=age;
		this.name=name;
	}


	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	
	
}
