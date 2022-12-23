package org.vijay.java8;

import java.math.BigDecimal;

public class Staff {
	
	private String name;
    private int age;
    private BigDecimal salary;
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
	public BigDecimal getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	Staff(String name, int age, BigDecimal salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}

}
