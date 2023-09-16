package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Person {
	private int eid;
	private String ename;
	private String ejob;

}
