package com.jtc.groupbye;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeTest {

	
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

			/*
			 * // Printing employee list for (Employee employee : employees) {
			 * System.out.println(employee); }
			 */
	        
	        Map<String, List<Employee>> country = employees.stream().collect(Collectors.groupingBy(c->c.getCountry()));
	   
	        System.out.println(country);
	 
	   
	 }
}

 class Employee {
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

