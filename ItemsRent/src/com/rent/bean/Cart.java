package com.rent.bean;

public class Cart {
	private int cart_user_id;
	private int cart_item_id;
	private int cart_num;
	
	public int getCart_user_id() {
		return cart_user_id;
	}
	public void setCart_user_id(int cart_user_id) {
		this.cart_user_id = cart_user_id;
	}
	public int getCart_item_id() {
		return cart_item_id;
	}
	public void setCart_item_id(int cart_item_id) {
		this.cart_item_id = cart_item_id;
	}
	public int getCart_num() {
		return cart_num;
	}
	public void setCart_num(int cart_num) {
		this.cart_num = cart_num;
	}
}
