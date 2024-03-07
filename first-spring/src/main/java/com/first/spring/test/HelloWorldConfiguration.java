package com.first.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 record Person(String name , int age, Address add) {};
 record Address(String firstline , String city) {};
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		
		return "Ashok";
	}
	@Bean
	public int age() {
		
		return 29;
	}
	@Bean
	public Person person() {
		return new Person("kumar", 25,new Address("chodavaram", "anakapalli"));
		
		
	}
	@Bean
	public Person person2() {
		return new Person(name(),age(),add());
		
		
	}
	@Bean
	public Person person3(String name, int age, Address add2) {
		return new Person(name,age,add2);
		
		
	}
	@Bean(name = "add2")
	public Address add() {
		return new Address("gajuwaka", "visakhapatnam");
		
		
	}

}
