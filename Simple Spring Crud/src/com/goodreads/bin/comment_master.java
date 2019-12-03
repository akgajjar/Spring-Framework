package com.goodreads.bin;

import java.sql.Timestamp;

public class comment_master {

	private int C_Id;
	private String C_Comment;
	private user_master user_master;
	private book_master book_master;
	private Boolean C_Show;
	private Timestamp C_TimeStamp;
	
	
	public int getC_Id() {
		return C_Id;
	}
	public void setC_Id(int c_Id) {
		C_Id = c_Id;
	}
	public String getC_Comment() {
		return C_Comment;
	}
	public void setC_Comment(String c_Comment) {
		C_Comment = c_Comment;
	}
	public user_master getUser_master() {
		return user_master;
	}
	public void setUser_master(user_master user_master) {
		this.user_master = user_master;
	}
	public book_master getBook_master() {
		return book_master;
	}
	public void setBook_master(book_master book_master) {
		this.book_master = book_master;
	}
	public Boolean getC_Show() {
		return C_Show;
	}
	public void setC_Show(Boolean c_Show) {
		C_Show = c_Show;
	}
	public Timestamp getC_TimeStamp() {
		return C_TimeStamp;
	}
	public void setC_TimeStamp(Timestamp c_TimeStamp) {
		C_TimeStamp = c_TimeStamp;
	}
	
	
}
