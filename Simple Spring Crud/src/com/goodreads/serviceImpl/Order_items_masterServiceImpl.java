package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_items_master;
import com.goodreads.bin.user_master;
import com.goodreads.dao.Order_items_masterDao;
import com.goodreads.service.Order_items_masterService;

public class Order_items_masterServiceImpl implements Order_items_masterService {

	private Order_items_masterDao odao;
	
	@Override
	public void setOdao(Order_items_masterDao odao) {
		this.odao = odao;
	}

	@Override
	public void saveOrder_item(order_items_master oi) {
		odao.saveOrder_item(oi);
	}

	@Override
	public void updateOrder_item(order_items_master oi) {
		odao.updateOrder_item(oi);
	}

	@Override
	public void deleteOrder_item(order_items_master oi) {
		odao.deleteOrder_item(oi);
	}

	@Override
	public order_items_master getByItem_Id(int Item_id) {
		return odao.getByItem_Id(Item_id);
	}

	@Override
	public List<order_items_master> getOrder_ItemsByOrderId(int Order_id) {
		return odao.getOrder_ItemsByOrderId(Order_id);
	}

}
