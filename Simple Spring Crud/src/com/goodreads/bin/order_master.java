package com.goodreads.bin;

import java.sql.Timestamp;
import java.util.Set;

public class order_master {

	
	private int Order_Id;
	private user_master user;
	private Timestamp Order_Date;
	private char Order_Type;
	private int Order_Days_Of_Lease;
	private Double Order_Amount;
	private Double Order_Discount;
	private Double Order_SGST;
	private Double Order_CGST;
	private Double Order_Final_Price;
	private String Order_Address1;
	private String Order_Address2;
	private String Order_City;
	private String Order_State;
	private int pincode;
	private Set<order_items_master> Items;
	private payment_master payment;
	
	public int getOrder_Id() {
		return Order_Id;
	}
	public void setOrder_Id(int order_Id) {
		Order_Id = order_Id;
	}
	public user_master getUser() {
		return user;
	}
	public void setUser(user_master user) {
		this.user = user;
	}
	public Timestamp getOrder_Date() {
		return Order_Date;
	}
	public void setOrder_Date(Timestamp order_Date) {
		Order_Date = order_Date;
	}
	public char getOrder_Type() {
		return Order_Type;
	}
	public void setOrder_Type(char order_Type) {
		Order_Type = order_Type;
	}
	public int getOrder_Days_Of_Lease() {
		return Order_Days_Of_Lease;
	}
	public void setOrder_Days_Of_Lease(int order_Days_Of_Lease) {
		Order_Days_Of_Lease = order_Days_Of_Lease;
	}
	public Double getOrder_Amount() {
		return Order_Amount;
	}
	public void setOrder_Amount(Double order_Amount) {
		Order_Amount = order_Amount;
	}
	public Double getOrder_Discount() {
		return Order_Discount;
	}
	public void setOrder_Discount(Double order_Discount) {
		Order_Discount = order_Discount;
	}
	public Double getOrder_SGST() {
		return Order_SGST;
	}
	public void setOrder_SGST(Double order_SGST) {
		Order_SGST = order_SGST;
	}
	public Double getOrder_CGST() {
		return Order_CGST;
	}
	public void setOrder_CGST(Double order_CGST) {
		Order_CGST = order_CGST;
	}
	public Double getOrder_Final_Price() {
		return Order_Final_Price;
	}
	public void setOrder_Final_Price(Double order_Final_Price) {
		Order_Final_Price = order_Final_Price;
	}
	public String getOrder_Address1() {
		return Order_Address1;
	}
	public void setOrder_Address1(String order_Address1) {
		Order_Address1 = order_Address1;
	}
	public String getOrder_Address2() {
		return Order_Address2;
	}
	public void setOrder_Address2(String order_Address2) {
		Order_Address2 = order_Address2;
	}
	public String getOrder_City() {
		return Order_City;
	}
	public void setOrder_City(String order_City) {
		Order_City = order_City;
	}
	public String getOrder_State() {
		return Order_State;
	}
	public void setOrder_State(String order_State) {
		Order_State = order_State;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Set<order_items_master> getItems() {
		return Items;
	}
	public void setItems(Set<order_items_master> items) {
		Items = items;
	}
	public payment_master getPayment() {
		return payment;
	}
	public void setPayment(payment_master payment) {
		this.payment = payment;
	}
	
	
}
