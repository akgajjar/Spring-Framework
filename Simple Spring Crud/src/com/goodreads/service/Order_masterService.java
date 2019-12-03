package com.goodreads.service;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_master;
import com.goodreads.dao.Order_masterDao;

public interface Order_masterService {

	public void setOdao(Order_masterDao odao);
	
	public void saveOrder(order_master o);
	
	public void updateOrder(order_master o);
	
	public void deleteOrder(order_master o);
	
	public order_master getByOrder_Id(int Order_Id);
	
	public List<order_master> getOrders();
	
	public List<order_master> getOrdersByU_Id(int U_Id);
	
}
