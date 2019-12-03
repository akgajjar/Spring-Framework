package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.comment_master;
import com.goodreads.dao.Book_masterDao;
import com.goodreads.dao.Comment_masterDao;
import com.goodreads.dao.User_masterDao;

public class Comment_masterDaoImpl implements Comment_masterDao {

	private HibernateTemplate template;
	private Book_masterDao bdao;
	private User_masterDao udao;
	
	@Override
	public void setBdao(Book_masterDao bdao) {
		this.bdao = bdao;
	}
	
	@Override
	public void setUdao(User_masterDao udao) {
		this.udao = udao;
	}

	@Override
	public void setTemplate(HibernateTemplate template) {
		this.template=template;
	}

	@Override
	public void saveComment(comment_master c) {
		template.save(c);
	}

	@Override
	public void updateComment(comment_master c) {
		template.update(c);
	}

	@Override
	public void deleteComment(comment_master c) {
		template.delete(c);
	}

	@Override
	public comment_master getByC_Id(int C_Id) {
		return (comment_master) template.get(comment_master.class, C_Id);
	}

	@Override
	public List<comment_master> getCommentsByISBN(String ISBN) {
		Object[] params  = {bdao.getByISBN(ISBN)};
		return template.find("select c from comment_master c where c.book_master = ? ", params);
	}

	@Override
	public List<comment_master> getCommentsByU_Id(int U_Id) {
		Object[] params  = {udao.getByU_Id(U_Id)};
		return template.find("select c from comment_master c where c.user_master = ? ", params);
	}

}
