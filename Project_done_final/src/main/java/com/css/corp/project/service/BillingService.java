package com.css.corp.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.css.corp.project.dao.BillingDao;
import com.css.corp.project.dao.UserDao;
import com.css.corp.project.domain.Billing;
import com.css.corp.project.domain.User;

@Service
public class BillingService {

	@Autowired
	BillingDao billingDao;

	@Transactional
	public List<Billing> getAllBillings() {
		return billingDao.getAllBillings();
	}

	@Transactional
	public Billing getBilling(int id) {
		return billingDao.getBilling(id);
	}

	@Transactional
	public void addBilling(Billing billing) {
		billingDao.addBilling(billing);
	}

	@Transactional
	public void updateBilling(Billing billing) {
		billingDao.updateBilling(billing);

	}

	@Transactional
	public void deleteBilling(int id) {
		billingDao.deleteBilling(id);
	}
	
}
