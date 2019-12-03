package com.goodreads.dao;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.goodreads.bin.book_master;

public interface Book_masterDao {
	
	public void setTemplate(HibernateTemplate template);

	public void setBdao(Book_category_masterDao bdao);
	
	public void saveBook(book_master b);
	
	public void updateBook(book_master b);
	
	public void deleteBook(book_master b);
	
	public book_master getByISBN(String ISBN);
	
	public List<book_master> getBooks();
	
	public List<book_master> getBooksByCat_Id(int Cat_Id);
	
	public void addintocategory(String ISBN,int Cat_Id);
	
	public void Removefromcategory(String ISBN,int Cat_Id);
	
}
