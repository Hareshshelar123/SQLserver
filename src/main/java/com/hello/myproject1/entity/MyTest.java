package com.hello.myproject1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class MyTest {
	
	@Id
	private int id;
	
	private String name;
	private String ename;
	private String sal;
	private String emp;
	
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	
	public MyTest(String emp) {
		super();
		this.emp = emp;
	}
	public MyTest(int id, String name, String ename, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.sal = sal;
	}
	public MyTest() {
		super();
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
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	

}
