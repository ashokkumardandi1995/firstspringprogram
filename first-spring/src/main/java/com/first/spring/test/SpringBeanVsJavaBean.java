package com.first.spring.test;

import java.io.Serializable;

class Pojo{
	private String text;
	private int number;
	 public String toString() {
		 return "text" +" ; "+ number;
	 }
	
}

class JavaBean implements Serializable {   //EJB
	private String text;
	private int number;
	public String getText() {
		return text;
	}
	//Getters and setters
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
public class SpringBeanVsJavaBean {

	public static void main(String[] args) {
		
Pojo pojo = new Pojo() ;
System.out.println(pojo);

	}

}
