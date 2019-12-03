package com.goodreads.service;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.user_master;
import com.goodreads.dao.User_masterDao;

public interface User_masterService {
	

	public void setUdao(User_masterDao udao);
	
	public void saveUser(user_master u);
	
	public void updateUser(user_master u);
	
	public void deleteUser(user_master u);
	
	public user_master getByU_Id(int U_Id);
	
	public List<user_master> getUsers();
	
	public user_master Check_Login(String U_Email,String U_Password);
	
	public void Update_Block_Status(int U_Id,boolean status);
	
}
