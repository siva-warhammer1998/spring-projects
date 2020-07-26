package com.example.demo.domain;

public class Userinput {
	private String gender;
	private String name;
	private String age;
	private Boolean emporNot;
	
	public Userinput() {
		
	}
	
	public Userinput(String gender, String name, String age, Boolean emporNot) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.emporNot = emporNot;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Boolean getEmporNot() {
		return emporNot;
	}

	public void setEmporNot(Boolean emporNot) {
		this.emporNot = emporNot;
	}

	
	
}