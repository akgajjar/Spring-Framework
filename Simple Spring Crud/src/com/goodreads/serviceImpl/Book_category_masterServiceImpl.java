package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.book_category_master;
import com.goodreads.dao.Book_category_masterDao;
import com.goodreads.service.Book_category_masterService;

public class Book_category_masterServiceImpl implements Book_category_masterService {

	
	private Book_category_masterDao bdao;
	
	@Override
	public void setBdao(Book_category_masterDao bdao) {
		this.bdao = bdao;
	}

	@Override
	public void saveCategory(book_category_master b) {
		bdao.saveCategory(b);
	}

	@Override
	public void updateCategory(book_category_master b) {
		bdao.updateCategory(b);
	}

	@Override
	public void deleteCategory(book_category_master b) {
		bdao.deleteCategory(b);
	}

	@Override
	public book_category_master getByCat_Id(int Cat_Id) {
		return bdao.getByCat_Id(Cat_Id);
	}

	@Override
	public List<book_category_master> getCategories() {
		return bdao.getCategories();
	}

	@Override
	public List<book_category_master> getCategoriesByISBN(String ISBN) {
		return bdao.getCategoriesByISBN(ISBN);
	}

}
