package com.rent.bean;

public class Order {
private int order_id;
private int order_user_id;
private int order_status;
private int order_sum;
private String order_date;
private String order_send_time;
private String order_remark;

public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public int getOrder_user_id() {
	return order_user_id;
}
public void setOrder_user_id(int order_user_id) {
	this.order_user_id = order_user_id;
}
public int getOrder_status() {
	return order_status;
}
public void setOrder_status(int order_status) {
	this.order_status = order_status;
}
public int getOrder_sum() {
	return order_sum;
}
public void setOrder_sum(int order_sum) {
	this.order_sum = order_sum;
}
public String getOrder_date() {
	return order_date;
}
public void setOrder_date(String order_date) {
	this.order_date = order_date;
}
public String getOrder_send_time() {
	return order_send_time;
}
public void setOrder_send_time(String order_send_time) {
	this.order_send_time = order_send_time;
}
public String getOrder_remark() {
	return order_remark;
}
public void setOrder_remark(String order_remark) {
	this.order_remark = order_remark;
}
}
