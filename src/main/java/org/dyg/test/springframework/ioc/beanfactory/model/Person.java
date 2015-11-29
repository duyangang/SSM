package org.dyg.test.springframework.ioc.beanfactory.model;

public class Person {
	private String name;
	private Integer age;
	
	public void work(){
		System.out.println("I am working");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
