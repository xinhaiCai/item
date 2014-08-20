package com.rent.bean;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields
	private String user_id;
	private String user_name;
	private String user_password;
	private String user_email;
	private String user_address;
	private String user_phone;
	private String user_QQ;
	private int user_cart_id;
	// Constructors

	/** default constructor */
	public User() {
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_QQ() {
		return user_QQ;
	}

	public void setUser_QQ(String user_QQ) {
		this.user_QQ = user_QQ;
	}

	public int getUser_cart_id() {
		return user_cart_id;
	}

	public void setUser_cart_id(int user_cart_id) {
		this.user_cart_id = user_cart_id;
	}


	

}