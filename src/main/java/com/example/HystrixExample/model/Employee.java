package com.example.HystrixExample.model;
public class Employee {
	public Employee() {
		
	}

	public Employee(String name, int id, String detail) {
		super();
		this.name = name;
		this.id = id;
		this.detail = detail;
	}

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	private String detail;




}
