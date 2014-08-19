package com.rent.bean;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private String sex;
	private Integer age;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String sex, Integer age) {
		this.sex = sex;
		this.age = age;
	}

	// Property accessors


	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}