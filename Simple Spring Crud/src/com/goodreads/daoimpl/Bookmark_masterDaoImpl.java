package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.bookmark_master;
import com.goodreads.dao.Book_masterDao;
import com.goodreads.dao.Bookmark_masterDao;
import com.goodreads.dao.User_masterDao;

public class Bookmark_masterDaoImpl implements Bookmark_masterDao {

	private HibernateTemplate template;
	private User_masterDao udao;
	private Book_masterDao bdao;
	
	@Override
	public void setUdao(User_masterDao udao) {
		this.udao = udao;
	}
	
	@Override
	public void setBdao(Book_masterDao bdao) {
		this.bdao = bdao;
	}

	@Override
	public void setTemplate(HibernateTemplate template) {
		this.template=template;
	}

	@Override
	public void saveBookmark(bookmark_master b) {
		template.save(b);
	}

	@Override
	public void updateBookmark(bookmark_master b) {
		template.update(b);
	}

	@Override
	public void deleteBookmark(bookmark_master b) {
		template.delete(b);
	}

	@Override
	public bookmark_master getByU_IdandISBN(int U_Id,String ISBN) {
		Object[] params  = {udao.getByU_Id(U_Id),bdao.getByISBN(ISBN)};
		List<bookmark_master> l= template.find("select b from bookmark_master b where b.user = ? and b.book = ?", params);
		if(l.size()>0)
			return l.get(0);
		return null;
	}


	@Override
	public List<bookmark_master> getBookmarksByU_Id(int U_Id) {
		Object[] params  = {udao.getByU_Id(U_Id)};
		return template.find("select b from bookmark_master b where b.user = ?", params);
	}
	@Override
	public List<bookmark_master> getBookmarksByISBN(String ISBN) {
		Object[] params  = {bdao.getByISBN(ISBN)};
		return template.find("select b from bookmark_master b where b.book = ?", params);
	}

}
