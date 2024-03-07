package com.first.spring.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstSpringApplication {

	public static void main(String[] args) {
		try(var context =	new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);){
			
		
	
	System.out.println(context.getBean("name"));
	
	System.out.println(context.getBean("age"));
	
	System.out.println(context.getBean("person"));
	
	System.out.println(context.getBean("person2"));
	
	System.out.println(context.getBean("person3"));
	
	System.out.println(context.getBean("add2"));
	
	System.out.println(context.getBean(Address.class));
	
	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	
	}
		}

}
