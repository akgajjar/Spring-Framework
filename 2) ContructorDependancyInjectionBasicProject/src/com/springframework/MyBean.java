package com.springframework;

public class MyBean {
	
	
	private int id;
	private String name;
	
	
	public MyBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public MyBean() {
		super();
	}

	public MyBean(String name) {
		super();
		this.name = name;
	}

	public MyBean(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "MyBean [id=" + id + ", name=" + name + "]";
	}

	
	

}
