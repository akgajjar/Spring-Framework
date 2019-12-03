package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.user_master;
import com.goodreads.dao.User_masterDao;


public class User_masterDaoImpl implements User_masterDao {
	
	 HibernateTemplate template;
	
	@Override
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void saveUser(user_master u){  
	    template.save(u);  
	}  
	
	@Override
	public void updateUser(user_master u){  
	    template.update(u);  
	}  
	
	@Override
	public void deleteUser(user_master u){  
	    template.delete(u);  
	}  
	
	@Override
	public List<user_master> getUsers(){  
	    return template.loadAll(user_master.class);  
	}

	@Override
	public user_master getByU_Id(int U_Id) {
		return (user_master)template.get(user_master.class,U_Id);  
	}

	@Override
	public user_master Check_Login(String U_Email, String U_Password) {
		Object[] params  = {U_Email,U_Password};
		List<user_master> l= template.find("select u from user_master u where u.U_Email=? and u.U_Password", params);
		if(l.size()>0)
			return l.get(0);
		return null;
	}

	@Override
	public void Update_Block_Status(int U_Id,boolean status) {
		user_master u=getByU_Id(U_Id);
		u.setU_Block(status);
		updateUser(u);
	}
	
}
