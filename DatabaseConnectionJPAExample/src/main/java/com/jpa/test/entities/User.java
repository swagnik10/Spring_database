package com.jpa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	private String name;
	private String city;
	private String status;
	public User(int id, String name, String city, String status) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
