package com.goodreads.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_master;

public interface Order_masterDao {

	public void setTemplate(HibernateTemplate template);

	public void setUdao(User_masterDao udao);
	
	public void saveOrder(order_master o);
	
	public void updateOrder(order_master o);
	
	public void deleteOrder(order_master o);
	
	public order_master getByOrder_Id(int Order_Id);
	
	public List<order_master> getOrders();
	
	public List<order_master> getOrdersByU_Id(int U_Id);
	
}
