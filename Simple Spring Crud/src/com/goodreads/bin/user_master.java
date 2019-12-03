package com.goodreads.bin;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Set;

public class user_master {

	
	
	private int U_Id;
	private String U_Fname;
	private String U_Mname;
	private String U_Lname;
	private String U_Mobile;
	private String U_Email;
	private String U_Password;
	private Boolean U_Block;
	private String U_Address1;
	private String U_Address2;
	private String U_city;
	private String U_State;
	private int U_Pincode;
	private Blob U_Img;
	private String U_Type;
	private Timestamp U_Creation_Date;
	private Set<book_master> books;
	private Set<comment_master> comments;
	private Set<bookmark_master> bookmarks;
	private Set<rating_master> ratings;
	private Set<order_master> orders;
	
	public int getU_Id() {
		return U_Id;
	}
	public void setU_Id(int u_Id) {
		U_Id = u_Id;
	}
	public String getU_Fname() {
		return U_Fname;
	}
	public void setU_Fname(String u_Fname) {
		U_Fname = u_Fname;
	}
	public String getU_Mname() {
		return U_Mname;
	}
	public void setU_Mname(String u_Mname) {
		U_Mname = u_Mname;
	}
	public String getU_Lname() {
		return U_Lname;
	}
	public void setU_Lname(String u_Lname) {
		U_Lname = u_Lname;
	}
	public String getU_Mobile() {
		return U_Mobile;
	}
	public void setU_Mobile(String u_Mobile) {
		U_Mobile = u_Mobile;
	}
	public String getU_Email() {
		return U_Email;
	}
	public void setU_Email(String u_Email) {
		U_Email = u_Email;
	}
	public String getU_Password() {
		return U_Password;
	}
	public void setU_Password(String u_Password) {
		U_Password = u_Password;
	}
	public Boolean getU_Block() {
		return U_Block;
	}
	public void setU_Block(Boolean u_Block) {
		U_Block = u_Block;
	}
	public String getU_Address1() {
		return U_Address1;
	}
	public void setU_Address1(String u_Address1) {
		U_Address1 = u_Address1;
	}
	public String getU_Address2() {
		return U_Address2;
	}
	public void setU_Address2(String u_Address2) {
		U_Address2 = u_Address2;
	}
	public String getU_city() {
		return U_city;
	}
	public void setU_city(String u_city) {
		U_city = u_city;
	}
	public String getU_State() {
		return U_State;
	}
	public void setU_State(String u_State) {
		U_State = u_State;
	}
	public int getU_Pincode() {
		return U_Pincode;
	}
	public void setU_Pincode(int u_Pincode) {
		U_Pincode = u_Pincode;
	}
	public Blob getU_Img() {
		return U_Img;
	}
	public void setU_Img(Blob u_Img) {
		U_Img = u_Img;
	}
	public String getU_Type() {
		return U_Type;
	}
	public void setU_Type(String u_Type) {
		U_Type = u_Type;
	}
	
	public Timestamp getU_Creation_Date() {
		return U_Creation_Date;
	}
	public void setU_Creation_Date(Timestamp u_Creation_Date) {
		U_Creation_Date = u_Creation_Date;
	}
	public Set<book_master> getBooks() {
		return books;
	}
	public void setBooks(Set<book_master> books) {
		this.books = books;
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
	public Set<order_master> getOrders() {
		return orders;
	}
	public void setOrders(Set<order_master> orders) {
		this.orders = orders;
	}
	
	
	
	
}
