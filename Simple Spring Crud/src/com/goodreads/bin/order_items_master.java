package com.goodreads.bin;

public class order_items_master {

	
	private int Item_Id;
	private book_master book;
	private order_master order;
	private Double Item_Amount;
	private int Item_Count;
	public int getItem_Id() {
		return Item_Id;
	}
	public void setItem_Id(int item_Id) {
		Item_Id = item_Id;
	}
	public book_master getBook() {
		return book;
	}
	public void setBook(book_master book) {
		this.book = book;
	}
	public order_master getOrder() {
		return order;
	}
	public void setOrder(order_master order) {
		this.order = order;
	}
	public Double getItem_Amount() {
		return Item_Amount;
	}
	public void setItem_Amount(Double item_Amount) {
		Item_Amount = item_Amount;
	}
	public int getItem_Count() {
		return Item_Count;
	}
	public void setItem_Count(int item_Count) {
		Item_Count = item_Count;
	}
	
}
