package com.maytech.json_java_databinding;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(value = "isActive")
public class student {
	
	private String name;
	private String address;
	private String city;
	private int id;
	private int[] phone;
	@JsonProperty("isActive")
	private boolean isActive;
	private TrainerInfo batch;
	
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
	public int[] getPhone() {
		return phone;
	}
	public void setPhone(int[] phone) {
		this.phone = phone;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public TrainerInfo getBatch() {
		return batch;
	}
	public void setBatch(TrainerInfo batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", address=" + address + ", city=" + city + ", id=" + id + ", phone="
				+ Arrays.toString(phone) + ", isActive=" + isActive + ", batch=" + batch + "]";
	}
	
	
	
	
	
	
	
	
}
