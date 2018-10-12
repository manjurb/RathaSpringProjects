package com.css.corp.project.dao;

import java.util.List;

import com.css.corp.project.domain.Billing;

public interface BillingDao {

	public List<Billing> getAllBillings();

	public Billing getBilling(int id);

	public Billing addBilling(Billing billing);

	public void updateBilling(Billing billing);

	public void deleteBilling(int id);
	
	
}
