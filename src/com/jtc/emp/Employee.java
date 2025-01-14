package com.jtc.emp;

public class Employee {

	
	  private int id;
	    private String name;
	    private int age;
	    private double salary;
	    private String department;
	    private String gender;

	    // Constructor
	    public Employee(int id, String name, int age, double salary, String department, String gender) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	        this.department = department;
	        this.gender = gender;
	    }

		@Override
		public String toString() {
			return "Employe [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
					+ department + ", gender=" + gender + "]";
		}

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
	    
	    
}
