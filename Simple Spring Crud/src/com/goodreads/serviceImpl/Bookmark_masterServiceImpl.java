package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.bookmark_master;
import com.goodreads.dao.Bookmark_masterDao;
import com.goodreads.service.Bookmark_masterService;

public class Bookmark_masterServiceImpl implements Bookmark_masterService {

	private Bookmark_masterDao bdao;
	
	@Override
	public void setBdao(Bookmark_masterDao bdao) {
		this.bdao = bdao;
	}

	@Override
	public void saveBookmark(bookmark_master b) {
		bdao.saveBookmark(b);
	}

	@Override
	public void updateBookmark(bookmark_master b) {
		bdao.updateBookmark(b);
	}

	@Override
	public void deleteBookmark(bookmark_master b) {
		bdao.deleteBookmark(b);
	}

	@Override
	public List<bookmark_master> getBookmarksByU_Id(int U_Id) {
		return bdao.getBookmarksByU_Id(U_Id);
	}

	@Override
	public bookmark_master getByU_IdandISBN(int U_Id, String ISBN) {
		return (bookmark_master) bdao.getBookmarksByISBN(ISBN);
	}

	@Override
	public List<bookmark_master> getBookmarksByISBN(String ISBN) {
		return bdao.getBookmarksByISBN(ISBN);
	}

}
