package com.goodreads.service;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.rating_master;
import com.goodreads.dao.Rating_masterDao;

public interface Rating_masterService {

	public void setRdao(Rating_masterDao rdao);
	
	public void saveRating(rating_master r);
	
	public void updateRating(rating_master r);
	
	public void deleteRating(rating_master r);
	
	public List<rating_master> getRatingsByISBN(String ISBN);
	
	public List<rating_master> getRatingsByU_Id(int U_Id);
	
	public rating_master getByU_IdandISBN(int U_Id,String ISBN);
}
