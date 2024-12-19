package com.jtc.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		// Adding employees
		employees.add(new Employee(1, "Alice", 28, 70000, "HR", "Female"));
		employees.add(new Employee(2, "Bob", 32, 80000, "Finance", "Male"));
		employees.add(new Employee(3, "Charlie", 25, 60000, "IT", "Male"));
		employees.add(new Employee(4, "Diana", 30, 75000, "Marketing", "Female"));
		employees.add(new Employee(5, "Edward", 29, 71000, "Sales", "Male"));
		employees.add(new Employee(6, "Fiona", 27, 68000, "HR", "Female"));
		employees.add(new Employee(7, "George", 35, 90000, "Finance", "Male"));
		employees.add(new Employee(8, "Hannah", 24, 65000, "IT", "Female"));
		employees.add(new Employee(9, "Ian", 31, 77000, "Marketing", "Male"));
		employees.add(new Employee(10, "Jane", 26, 69000, "Sales", "Female"));
		employees.add(new Employee(11, "Kevin", 34, 85000, "HR", "Male"));
		employees.add(new Employee(12, "Laura", 29, 72000, "Finance", "Female"));
		employees.add(new Employee(13, "Mike", 33, 80000, "IT", "Male"));
		employees.add(new Employee(14, "Nina", 28, 70000, "Marketing", "Female"));
		employees.add(new Employee(15, "Oscar", 30, 75000, "Sales", "Male"));
		employees.add(new Employee(16, "Paula", 27, 68000, "HR", "Female"));
		employees.add(new Employee(17, "Quincy", 36, 91000, "Finance", "Male"));
		employees.add(new Employee(18, "Rachel", 25, 64000, "IT", "Female"));
		employees.add(new Employee(19, "Steve", 29, 71000, "Marketing", "Male"));
		employees.add(new Employee(20, "Tina", 32, 80000, "Sales", "Female"));

		/*
		 * for (Employee employee : employees) { System.out.println(employee); }
		 */

		Optional<Employee> max = employees.stream().collect(Collectors.maxBy(Comparator.comparing(a -> a.getSalary())));

		System.out.println("max salary:" + max.get().getSalary());

		Optional<Employee> min = employees.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.getSalary())));
		System.out.println("min sal:-" + min.get().getSalary());

		Double avg = employees.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
		System.out.println(avg);
	}
}
