package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_items_master;
import com.goodreads.bin.user_master;
import com.goodreads.dao.Order_items_masterDao;
import com.goodreads.dao.Order_masterDao;

public class Order_items_masterDaoImpl implements Order_items_masterDao {

	private HibernateTemplate template;
	private Order_masterDao odao;
	
	@Override
	public void setOdao(Order_masterDao odao) {
		this.odao = odao;
	}

	@Override
	public void setTemplate(HibernateTemplate template) {
		this.template=template;
	}

	@Override
	public void saveOrder_item(order_items_master oi) {
		template.save(oi);
	}

	@Override
	public void updateOrder_item(order_items_master oi) {
		template.update(oi);
	}

	@Override
	public void deleteOrder_item(order_items_master oi) {
		template.delete(oi);
	}

	@Override
	public order_items_master getByItem_Id(int Item_id) {
		return (order_items_master) template.get(order_items_master.class, Item_id);
	}

	@Override
	public List<order_items_master> getOrder_ItemsByOrderId(int Order_id) {
		Object[] params  = {odao.getByOrder_Id(Order_id)};
		return template.find("select o from order_items_master oi where oi.order = ? ", params);
	}

}
