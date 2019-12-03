package com.goodreads.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_items_master;
import com.goodreads.bin.user_master;

public interface Order_items_masterDao {

	public void setTemplate(HibernateTemplate template);
	
	public void setOdao(Order_masterDao odao);
	
	public void saveOrder_item(order_items_master oi);
	
	public void updateOrder_item(order_items_master oi);
	
	public void deleteOrder_item(order_items_master oi);
	
	public order_items_master getByItem_Id(int Item_id);
	
	public List<order_items_master>  getOrder_ItemsByOrderId(int Order_id);
}
