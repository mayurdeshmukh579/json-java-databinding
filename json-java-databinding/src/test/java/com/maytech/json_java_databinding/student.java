package com.maytech.json_java_databinding;

public class student {
	
	private String name;
	private String address;
	private String city;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", address=" + address + ", city=" + city + ", id=" + id + "]";
	}
	
	
}
