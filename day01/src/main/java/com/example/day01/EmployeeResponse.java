package com.example.day01;

public class EmployeeResponse{
	private int id;
	private String name;

	public EmployeeResponse aId(int id) {
		this.id = id;
		return this;
	}

	public EmployeeResponse aName(String name) {
		this.name = name;
		return this;
	}

	public EmployeeResponse() {
	}

	public EmployeeResponse(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}
}
