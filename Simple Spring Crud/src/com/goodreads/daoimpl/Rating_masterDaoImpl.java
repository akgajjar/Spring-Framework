package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.book_master;
import com.goodreads.bin.rating_master;
import com.goodreads.bin.user_master;
import com.goodreads.dao.Book_masterDao;
import com.goodreads.dao.Bookmark_masterDao;
import com.goodreads.dao.Rating_masterDao;
import com.goodreads.dao.User_masterDao;

public class Rating_masterDaoImpl implements Rating_masterDao {

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
	public void saveRating(rating_master r) {
		template.save(r);
	}

	@Override
	public void updateRating(rating_master r) {
		template.update(r);
	}

	@Override
	public void deleteRating(rating_master r) {
		template.delete(r);
	}

	@Override
	public List<rating_master> getRatingsByISBN(String ISBN) {
		Object[] params  = {bdao.getByISBN(ISBN)};
		return template.find("select r from rating_master r where r.book=?", params);
		
	}

	@Override
	public List<rating_master> getRatingsByU_Id(int U_Id) {
		Object[] params  = {udao.getByU_Id(U_Id)};
		return template.find("select r from rating_master r where r.user=?", params);
	}


	@Override
	public rating_master getByU_IdandISBN(int U_Id, String ISBN) {
		Object[] params  = {udao.getByU_Id(U_Id),bdao.getByISBN(ISBN)};
		List<rating_master> l= template.find("select r from rating_master r where r.user=? and r.book=?", params);
		if(l.size() > 0 )
				return l.get(0);
		return null;
	}

}
