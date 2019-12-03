package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_master;
import com.goodreads.dao.Order_masterDao;
import com.goodreads.service.Order_masterService;

public class Order_masterServiceImpl implements Order_masterService {

	private Order_masterDao odao;

	@Override
	public void setOdao(Order_masterDao odao) {
		this.odao = odao;
	}

	@Override
	public void saveOrder(order_master o) {
		odao.saveOrder(o);
	}

	@Override
	public void updateOrder(order_master o) {
		odao.updateOrder(o);
	}

	@Override
	public void deleteOrder(order_master o) {
		odao.deleteOrder(o);
	}

	@Override
	public order_master getByOrder_Id(int Order_Id) {
		return odao.getByOrder_Id(Order_Id);
	}

	@Override
	public List<order_master> getOrders() {
		return odao.getOrders();
	}

	@Override
	public List<order_master> getOrdersByU_Id(int U_Id) {
		return odao.getOrdersByU_Id(U_Id);
	}

}
