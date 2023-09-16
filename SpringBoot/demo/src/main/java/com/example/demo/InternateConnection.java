package com.example.demo;

import org.springframework.stereotype.Component;

@Component("hari")
public class InternateConnection {
	private int IpAddress;
	private int speed;
	public int getIpAddress() {
		return IpAddress;
	}
	public void setIpAddress(int ipAddress) {
		IpAddress = ipAddress;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void switchOn()
	{
		System.out.println("swithching the jio internate connection");
	}

}
