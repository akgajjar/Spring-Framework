package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.rating_master;
import com.goodreads.dao.Rating_masterDao;
import com.goodreads.service.Rating_masterService;

public class Rating_masterServiceImpl implements Rating_masterService {

	private Rating_masterDao rdao;
	
	@Override
	public void setRdao(Rating_masterDao rdao) {
		this.rdao = rdao;
	}

	@Override
	public void saveRating(rating_master r) {
		rdao.saveRating(r);
	}

	@Override
	public void updateRating(rating_master r) {
		rdao.updateRating(r);
	}

	@Override
	public void deleteRating(rating_master r) {
		rdao.deleteRating(r);
	}

	@Override
	public List<rating_master> getRatingsByISBN(String ISBN) {
		return rdao.getRatingsByISBN(ISBN);
	}

	@Override
	public List<rating_master> getRatingsByU_Id(int U_Id) {
		return rdao.getRatingsByU_Id(U_Id);
	}

	@Override
	public rating_master getByU_IdandISBN(int U_Id, String ISBN) {
		return rdao.getByU_IdandISBN(U_Id, ISBN);
	}

}
