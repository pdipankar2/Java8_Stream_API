package com.jtc.employe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	
	 private int id;
	    private String name;
	    private int age;
	    private double salary;
	    private String department;
	    private String gender;
	    private String country;

	    // Constructor
	    public Employee(int id, String name, int age, double salary, String department, String gender, String country) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	        this.department = department;
	        this.gender = gender;
	        this.country = country;
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", salary=" + salary +
	                ", department='" + department + '\'' +
	                ", gender='" + gender + '\'' +
	                ", country='" + country + '\'' +
	                '}';
	    }
	}


class EmployeTest{
	
	 public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();

	        // Adding employees
	        employees.add(new Employee(1, "Alice", 28, 70000, "HR", "Female", "USA"));
	        employees.add(new Employee(2, "Bob", 32, 80000, "Finance", "Male", "UK"));
	        employees.add(new Employee(3, "Charlie", 25, 60000, "IT", "Male", "India"));
	        employees.add(new Employee(4, "Diana", 30, 75000, "Marketing", "Female", "Germany"));
	        employees.add(new Employee(5, "Edward", 29, 71000, "Sales", "Male", "Germany"));
	        employees.add(new Employee(6, "Fiona", 27, 68000, "HR", "Female", "France"));
	        employees.add(new Employee(7, "George", 35, 90000, "Finance", "Male", "Japan"));
	        employees.add(new Employee(8, "Hannah", 24, 65000, "IT", "Female", "Australia"));
	        employees.add(new Employee(9, "Ian", 31, 77000, "Marketing", "Male", "China"));
	        employees.add(new Employee(10, "Jane", 26, 69000, "Sales", "Female", "Australia"));
	        employees.add(new Employee(11, "Kevin", 34, 85000, "HR", "Male", "USA"));
	        employees.add(new Employee(12, "Laura", 29, 72000, "Finance", "Female", "India"));
	        employees.add(new Employee(13, "Mike", 33, 80000, "IT", "Male", "USA"));
	        employees.add(new Employee(14, "Nina", 28, 70000, "Marketing", "Female", "Italy"));
	        employees.add(new Employee(15, "Oscar", 30, 75000, "Sales", "Male", "India"));
	        employees.add(new Employee(16, "Paula", 27, 68000, "HR", "Female", "Netherlands"));
	        employees.add(new Employee(17, "Quincy", 36, 91000, "Finance", "Male", "Sweden"));
	        employees.add(new Employee(18, "Rachel", 25, 64000, "IT", "Female", "China"));
	        employees.add(new Employee(19, "Steve", 29, 71000, "Marketing", "Male", "Singapore"));
	        employees.add(new Employee(20, "Tina", 32, 80000, "Sales", "Female", "New Zealand"));
	
	 
	 
	 
	 //How many Male and femail employe avail able in Organization?
	        
	        Map<String, Long> count = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	        System.out.println(count);
	 
	 //How to print all the depertment name?
	 
		/*
		 * employees.stream()
		 * .map(e->e.getDepartment()).forEach(name->System.out.println(name));
		 */
	 
	 employees.stream().map(e->e.getDepartment())
	 .distinct().forEach(e->System.out.println(e));
	
	 
	 
	 
	 //Find avarage age of the all employe
	 
	 Map<String, Double> age = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
	 System.out.println(age);
	 
	 
	 //get height paid salary employe in orgination
	 
	 Optional<Employee> max = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	
    if(max.isPresent()) {
    	Employee e=max.get();
    	System.out.println(e);
    }
	 
    
    //count number of employe each depertment?
    
    
    Map<String, Long> emp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	System.out.println(emp);
	
	
	//what is the avg salary of each depertment?
	
	
	Map<String, Double> avgSal = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(avgSal);
	
	//get the youngest male employe in salse depertment?
	
	Optional<Employee> min = employees.stream()
	.filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Sales"))
	.min(Comparator.comparing(Employee::getAge));
	 
	if(min.isPresent()) {
		System.out.println(min.get());
	}
	
	
	//how many male and female employe in salse team
	
 Map<String, Long> em = employees.stream().filter(a->a.getDepartment().equals("Finance"))
.collect(Collectors.groupingBy(Employee::getGender ,Collectors.counting()));
	
	 System.out.println(em);
	//who is gating height salary?
	 
	 Optional<Employee> sal = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	 System.out.println(sal);
	 //what is the avg salary of male and female employe?
	 
	 //list down the name of each employe in in salse dept?
	 
	 //who is the oldest employe in the organization?
	 
	 //
	 
	 }
}
