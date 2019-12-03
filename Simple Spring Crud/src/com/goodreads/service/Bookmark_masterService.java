package com.goodreads.service;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.bookmark_master;
import com.goodreads.dao.Bookmark_masterDao;

public interface Bookmark_masterService {

	public void setBdao(Bookmark_masterDao bdao);
	
	public void saveBookmark(bookmark_master b);
	
	public void updateBookmark(bookmark_master b);
	
	public void deleteBookmark(bookmark_master b);
	
	public List<bookmark_master> getBookmarksByU_Id(int U_Id);

	public bookmark_master getByU_IdandISBN(int U_Id, String ISBN);

	public List<bookmark_master> getBookmarksByISBN(String ISBN);

	
	
}
