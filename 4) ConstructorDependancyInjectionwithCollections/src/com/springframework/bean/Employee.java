package com.springframework.bean;

import java.util.List;

public class Employee {

	private int id;
	private String Name;
	private List<String> address;
	public Employee() {
		super();
	}
	public Employee(int id, String name, List<String> address) {
		super();
		this.id = id;
		Name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", address=" + address + "]";
	}

	
}
