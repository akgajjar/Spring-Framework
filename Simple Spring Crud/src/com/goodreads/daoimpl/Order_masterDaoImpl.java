package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_master;
import com.goodreads.bin.user_master;
import com.goodreads.dao.Order_masterDao;
import com.goodreads.dao.User_masterDao;

public class Order_masterDaoImpl implements Order_masterDao {

	private HibernateTemplate template;
	private User_masterDao udao;
	
	@Override
	public void setUdao(User_masterDao udao) {
		this.udao = udao;
	}

	@Override
	public void setTemplate(HibernateTemplate template) {
		this.template=template;
	}

	@Override
	public void saveOrder(order_master o) {
		template.save(o);
	}

	@Override
	public void updateOrder(order_master o) {
		template.update(o);
	}

	@Override
	public void deleteOrder(order_master o) {
		template.delete(o);
	}

	@Override
	public order_master getByOrder_Id(int Order_Id) {
		return (order_master) template.get(order_master.class,Order_Id);
	}

	@Override
	public List<order_master> getOrders() {
		return template.loadAll(order_master.class);
	}

	@Override
	public List<order_master> getOrdersByU_Id(int U_Id) {
		Object[] params  = {udao.getByU_Id(U_Id)};
		return template.find("select o from order_master o where o.user = ?", params);
	}

}
