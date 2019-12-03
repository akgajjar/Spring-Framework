package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.comment_master;
import com.goodreads.dao.Comment_masterDao;
import com.goodreads.service.Comment_masterService;

public class Comment_masterServiceImpl implements Comment_masterService {

	private Comment_masterDao cdao;

	@Override
	public void setCdao(Comment_masterDao cdao) {
		this.cdao = cdao;
	}

	@Override
	public void saveComment(comment_master c) {
		cdao.saveComment(c);
	}

	@Override
	public void updateComment(comment_master c) {
		cdao.updateComment(c);
	}

	@Override
	public void deleteComment(comment_master c) {
		cdao.deleteComment(c);
	}

	@Override
	public comment_master getByC_Id(int C_Id) {
		return cdao.getByC_Id(C_Id);
	}

	@Override
	public List<comment_master> getCommentsByISBN(String ISBN) {
		return cdao.getCommentsByISBN(ISBN);
	}

	@Override
	public List<comment_master> getCommentsByU_Id(int U_Id) {
		return cdao.getCommentsByU_Id(U_Id);
	}

}
