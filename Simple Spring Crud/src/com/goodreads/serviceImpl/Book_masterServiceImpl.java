package com.goodreads.serviceImpl;

import java.util.List;


import com.goodreads.bin.book_master;
import com.goodreads.dao.Book_masterDao;
import com.goodreads.service.Book_masterService;

public class Book_masterServiceImpl implements Book_masterService {

	private Book_masterDao bdao;
	
	@Override
	public void setBdao(Book_masterDao bdao) {
		this.bdao = bdao;
	}

	@Override
	public void saveBook(book_master b) {
		bdao.saveBook(b);
	}

	@Override
	public void updateBook(book_master b) {
		bdao.updateBook(b);
	}

	@Override
	public void deleteBook(book_master b) {
		bdao.deleteBook(b);
	}

	@Override
	public book_master getByISBN(String ISBN) {
		return bdao.getByISBN(ISBN);
	}

	@Override
	public List<book_master> getBooks() {
		return bdao.getBooks();
	}

	@Override
	public List<book_master> getBooksByCat_Id(int Cat_Id) {
		return bdao.getBooksByCat_Id(Cat_Id);
	}

	@Override
	public void addintocategory(String ISBN, int Cat_Id) {
		bdao.addintocategory(ISBN, Cat_Id);
	}

	@Override
	public void Removefromcategory(String ISBN, int Cat_Id) {
		bdao.Removefromcategory(ISBN, Cat_Id);
	}

}
