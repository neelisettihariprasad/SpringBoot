package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Home {
	private String HouseOwner;
	private int id;
	@Autowired
	@Qualifier("hari")
	private InternateConnection connect;
	
	
	public String getHouseOwner() {
		return HouseOwner;
	}
	public void setHouseOwner(String houseOwner) {
		HouseOwner = houseOwner;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void connect()
	{
		System.out.println("Connecting to internate");
		connect.switchOn();
	}
	public Home() {
		super();
		System.out.println("Constructor is called!");
		// TODO Auto-generated constructor stub
	}

}
     
