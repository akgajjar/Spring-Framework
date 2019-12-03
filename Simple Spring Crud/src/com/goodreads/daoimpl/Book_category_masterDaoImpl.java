package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.book_category_master;
import com.goodreads.dao.Book_category_masterDao;

public class Book_category_masterDaoImpl implements Book_category_masterDao {

	HibernateTemplate template;
	
	@Override
	public void setTemplate(HibernateTemplate template) {
		this.template=template;
		
	}

	@Override
	public void saveCategory(book_category_master b) {
		template.save(b);
	}

	@Override
	public void updateCategory(book_category_master b) {
		template.update(b);
	}

	@Override
	public void deleteCategory(book_category_master b) {
		template.delete(b);
	}

	@Override
	public book_category_master getByCat_Id(int Cat_Id) {
		return (book_category_master) template.get(book_category_master.class, Cat_Id);
	}

	@Override
	public List<book_category_master> getCategoriesByISBN(String ISBN) {
		Object[] params  = {ISBN};
		String query = "select distinct b from book_category_master b \" +\r\n" + 
				"                \"join b.books c t \" +\r\n" + 
				"                \"where c.ISBN = ? \"";
		return template.find(query, params);
	}

	@Override
	public List<book_category_master> getCategories() {
		return template.loadAll(book_category_master.class);
	}
	

}
