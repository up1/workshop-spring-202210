package com.example.day01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class EmployeeResponse extends Object{
	private int id;
	private String name;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EmployeeResponse response = (EmployeeResponse) o;
		return id == response.id && Objects.equals(name, response.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

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
