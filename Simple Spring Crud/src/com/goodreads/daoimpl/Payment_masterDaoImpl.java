package com.goodreads.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.payment_master;
import com.goodreads.bin.user_master;
import com.goodreads.dao.Order_masterDao;
import com.goodreads.dao.Payment_masterDao;

public class Payment_masterDaoImpl implements Payment_masterDao {

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
	public void savePayment(payment_master p) {
		template.save(p);
	}

	@Override
	public void updatePayment(payment_master p) {
		template.update(p);
	}

	@Override
	public void deletePayment(payment_master p) {
		template.delete(p);
	}

	@Override
	public payment_master getByPyment_Id(int Payment_Id) {
		return (payment_master) template.get(payment_master.class, Payment_Id);
	}

	@Override
	public payment_master getByOrder_Id(int Order_Id) {
		Object[] params  = {odao.getByOrder_Id(Order_Id)};
		List<payment_master> l= template.find("select p from payment_master p where p.order = ?", params);
		if(l.size()>0)
			return l.get(0);
		return null;
	}

	@Override
	public List<payment_master> getPayments() {
		return template.loadAll(payment_master.class); 
	}

}
