package com.goodreads.bin;

import java.util.Set;

public class book_category_master {
	
		private int Cat_Id;
		private String Cat_Name;
		private String Cat_Description;
		private Set<book_master> books;
		
		public int getCat_Id() {
			return Cat_Id;
		}
		public void setCat_Id(int cat_Id) {
			Cat_Id = cat_Id;
		}
		public String getCat_Name() {
			return Cat_Name;
		}
		public void setCat_Name(String cat_Name) {
			Cat_Name = cat_Name;
		}
		public String getCat_Description() {
			return Cat_Description;
		}
		public void setCat_Description(String cat_Description) {
			Cat_Description = cat_Description;
		}
		public Set<book_master> getBooks() {
			return books;
		}
		public void setBooks(Set<book_master> books) {
			this.books = books;
		}
		

}
