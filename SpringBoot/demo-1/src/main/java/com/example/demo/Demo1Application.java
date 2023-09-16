package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
	//	SpringApplication.run(Demo1Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		
		Person p = context.getBean(Person.class);
		p.setEid(101);
		p.setEname("Hari");
		p.setEjob("Java-Full-Stack-Developer");
		System.out.println(p.getEid()+ "\n" + p.getEname()+ "\n" + p.getEjob());
	}

}
