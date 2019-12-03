package com.goodreads.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.book_category_master;

public interface Book_category_masterDao {
	
	public void setTemplate(HibernateTemplate template);

	public void saveCategory(book_category_master b);
	
	public void updateCategory(book_category_master b);
	
	public void deleteCategory(book_category_master b);
	
	public book_category_master getByCat_Id(int Cat_Id);
	
	public List<book_category_master> getCategories();

	public List<book_category_master> getCategoriesByISBN(String ISBN);
	
}
