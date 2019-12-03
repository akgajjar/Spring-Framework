package com.goodreads.service;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.comment_master;
import com.goodreads.dao.Comment_masterDao;

public interface Comment_masterService {


	public void saveComment(comment_master c);
	
	public void updateComment(comment_master c);
	
	public void deleteComment(comment_master c);
	
	public comment_master getByC_Id(int C_Id);
	
	public List<comment_master> getCommentsByISBN(String ISBN);
	
	public List<comment_master> getCommentsByU_Id(int U_Id);

	void setCdao(Comment_masterDao cdao);
	
}
