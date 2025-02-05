package com.springframework.bean;

public class Employee {

	private int id;
	private String Name;
	private Address address;
	

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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", address=" + address + "]";
	}
	
	
	
}
