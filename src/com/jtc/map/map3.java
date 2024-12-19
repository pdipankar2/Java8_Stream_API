package com.jtc.map;

import java.util.stream.Stream;

public class map3 {
	public static void main(String[] args) {
		
	
Employee e1=new Employee("Robin", 44, 64564.0);
Employee e2=new Employee("Roshon", 27, 54564.0);
Employee e3=new Employee("Karina", 35, 44564.0);
Employee e4=new Employee("Abdul", 33, 24564.0);
Employee e5=new Employee("Tushar", 22, 34564.0);

Stream<Employee> emp = Stream.of(e1,e2,e3,e4,e5);

/*
 * emp.filter(a->a.age<25 && a.salary<35000) .forEach(s->System.out.println(s));
 */

emp.filter(e->e.salary >=50000.00)
.forEach(e->System.out.println(e));
	}

}
class Employee{
	
	String name;
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}