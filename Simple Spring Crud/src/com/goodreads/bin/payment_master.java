package com.goodreads.bin;

import java.sql.Timestamp;

public class payment_master {

	private int Payment_Id;
	private Double Payment_Amount;
	private order_master order;
	private Timestamp Payment_Date;
	private String Payment_Mode;
	
	public int getPayment_Id() {
		return Payment_Id;
	}
	public void setPayment_Id(int payment_Id) {
		Payment_Id = payment_Id;
	}
	public Double getPayment_Amount() {
		return Payment_Amount;
	}
	public void setPayment_Amount(Double payment_Amount) {
		Payment_Amount = payment_Amount;
	}
	public order_master getOrder() {
		return order;
	}
	public void setOrder(order_master order) {
		this.order = order;
	}
	public Timestamp getPayment_Date() {
		return Payment_Date;
	}
	public void setPayment_Date(Timestamp payment_Date) {
		Payment_Date = payment_Date;
	}
	public String getPayment_Mode() {
		return Payment_Mode;
	}
	public void setPayment_Mode(String payment_Mode) {
		Payment_Mode = payment_Mode;
	}
	
}
