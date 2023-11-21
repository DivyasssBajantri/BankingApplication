package com.springboot.Banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String contactnumber;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "AccountHolder [id=" + id + ", name=" + name + ", age=" + age + ", contactnumber=" + contactnumber + "]";
	}
	
	
	

}
