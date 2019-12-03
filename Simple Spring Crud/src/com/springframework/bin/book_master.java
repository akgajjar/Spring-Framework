package com.springframework.bin;

import java.sql.Timestamp;
import java.util.Set;

public class book_master {

	private String ISBN ;
	private String B_Name;
	private String B_Author;
	private Double B_price;
	private int B_Page;
	private int B_Lease_Days;
	private int B_Lease_Amount;
	private String B_Description;
	private user_master user_master;
	private char B_Type;
	private Timestamp B_Date;
	private Set<book_category_master> categories;
	private Set<comment_master> comments;
	private Set<bookmark_master> bookmarks;
	private Set<rating_master> ratings;
	private Set<order_items_master> order_items;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getB_Name() {
		return B_Name;
	}
	public void setB_Name(String b_Name) {
		B_Name = b_Name;
	}
	public String getB_Author() {
		return B_Author;
	}
	public void setB_Author(String b_Author) {
		B_Author = b_Author;
	}
	public Double getB_price() {
		return B_price;
	}
	public void setB_price(Double b_price) {
		B_price = b_price;
	}
	public int getB_Page() {
		return B_Page;
	}
	public void setB_Page(int b_Page) {
		B_Page = b_Page;
	}
	public int getB_Lease_Days() {
		return B_Lease_Days;
	}
	public void setB_Lease_Days(int b_Lease_Days) {
		B_Lease_Days = b_Lease_Days;
	}
	public int getB_Lease_Amount() {
		return B_Lease_Amount;
	}
	public void setB_Lease_Amount(int b_Lease_Amount) {
		B_Lease_Amount = b_Lease_Amount;
	}
	public String getB_Description() {
		return B_Description;
	}
	public void setB_Description(String b_Description) {
		B_Description = b_Description;
	}
	
	public char getB_Type() {
		return B_Type;
	}
	
	public Timestamp getB_Date() {
		return B_Date;
	}
	public void setB_Date(Timestamp b_Date) {
		B_Date = b_Date;
	}
	public void setB_Type(char b_Type) {
		B_Type = b_Type;
	}
	public user_master getUser_master() {
		return user_master;
	}
	public void setUser_master(user_master user_master) {
		this.user_master = user_master;
	}
	public Set<book_category_master> getCategories() {
		return categories;
	}
	public void setCategories(Set<book_category_master> categories) {
		this.categories = categories;
	}
	public Set<comment_master> getComments() {
		return comments;
	}
	public void setComments(Set<comment_master> comments) {
		this.comments = comments;
	}
	public Set<bookmark_master> getBookmarks() {
		return bookmarks;
	}
	public void setBookmarks(Set<bookmark_master> bookmarks) {
		this.bookmarks = bookmarks;
	}
	
	public Set<rating_master> getRatings() {
		return ratings;
	}
	public void setRatings(Set<rating_master> ratings) {
		this.ratings = ratings;
	}
	
	
	
	
}
