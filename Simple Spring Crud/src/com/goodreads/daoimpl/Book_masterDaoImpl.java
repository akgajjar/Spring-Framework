package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.book_master;
import com.goodreads.dao.Book_category_masterDao;
import com.goodreads.dao.Book_masterDao;

public class Book_masterDaoImpl implements Book_masterDao {

	private HibernateTemplate template;
	private Book_category_masterDao bdao;
	
	@Override
	public void setBdao(Book_category_masterDao bdao) {
		this.bdao = bdao;
	}

	@Override
	public void setTemplate(HibernateTemplate template) {
		this.template=template;
	}

	@Override
	public void saveBook(book_master b) {
		template.save(b);
	}

	@Override
	public void updateBook(book_master b) {
		template.update(b);
	}

	@Override
	public void deleteBook(book_master b) {
		template.delete(b);
	}

	@Override
	public book_master getByISBN(String ISBN) {
		return (book_master) template.get(book_master.class, ISBN);
	}

	@Override
	public List<book_master> getBooks() {
		return template.loadAll(book_master.class);
	}

	@Override
	public List<book_master> getBooksByCat_Id(int Cat_Id) {
		Object[] params  = {Cat_Id};
		String query = "select distinct b from book_master b \" +\r\n" + 
				"                \"join b.categories c t \" +\r\n" + 
				"                \"where c.Cat_Id = ? \"";
		return template.find(query, params);
	}

	@Override
	public void addintocategory(String ISBN, int Cat_Id) {
		book_master b=getByISBN(ISBN);
		b.getCategories().add(bdao.getByCat_Id(Cat_Id));
		updateBook(b);
	}

	@Override
	public void Removefromcategory(String ISBN, int Cat_Id) {
		book_master b=getByISBN(ISBN);
		b.getCategories().remove(bdao.getByCat_Id(Cat_Id));
		updateBook(b);
	}

}
