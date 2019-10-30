package com.springframework.bean;

import java.util.List;

public class Employee {

	private int id;
	private String Name;
	private List<Address> address;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", address=" + address + "]";
	}
	
	
	
}
