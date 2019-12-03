package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.user_master;
import com.goodreads.dao.User_masterDao;
import com.goodreads.service.User_masterService;

public class User_masterServiceImpl implements User_masterService {

	User_masterDao udao;
	
	@Override
	public void setUdao(User_masterDao udao) {
		this.udao = udao;
	}

	@Override
	public void saveUser(user_master u) {
		udao.saveUser(u);
	}

	@Override
	public void updateUser(user_master u) {
		udao.updateUser(u);
	}

	@Override
	public void deleteUser(user_master u) {
		udao.deleteUser(u);
	}

	@Override
	public user_master getByU_Id(int U_Id) {
		return udao.getByU_Id(U_Id);
	}

	@Override
	public List<user_master> getUsers() {
		return udao.getUsers();
	}

	@Override
	public user_master Check_Login(String U_Email, String U_Password) {
		return udao.Check_Login(U_Email, U_Password);
	}

	@Override
	public void Update_Block_Status(int U_Id,boolean status) {
		udao.Update_Block_Status(U_Id, status);
	}

}
