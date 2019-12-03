package com.goodreads.serviceImpl;

import java.util.List;

import com.goodreads.bin.payment_master;
import com.goodreads.dao.Payment_masterDao;
import com.goodreads.service.Payment_masterService;

public class Payment_masterServiceImpl implements Payment_masterService {

	private Payment_masterDao pdao;
	
	@Override
	public void setPdao(Payment_masterDao pdao) {
		this.pdao = pdao;
	}

	@Override
	public void savePayment(payment_master p) {
		pdao.savePayment(p);
	}

	@Override
	public void updatePayment(payment_master p) {
		pdao.updatePayment(p);
	}

	@Override
	public void deletePayment(payment_master p) {
		pdao.deletePayment(p);
	}

	@Override
	public payment_master getByPyment_Id(int Payment_Id) {
		return pdao.getByPyment_Id(Payment_Id);
	}

	@Override
	public payment_master getByOrder_Id(int Order_Id) {
		return pdao.getByOrder_Id(Order_Id);
	}

	@Override
	public List<payment_master> getPayments() {
		return pdao.getPayments();
	}

}
