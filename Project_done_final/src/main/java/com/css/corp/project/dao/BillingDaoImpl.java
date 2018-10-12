package com.css.corp.project.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.css.corp.project.domain.Billing;
import com.css.corp.project.domain.User;

@Repository
public class BillingDaoImpl implements BillingDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@Override
	public List<Billing> getAllBillings() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Billing> billingList = session.createQuery("from Billing").list();
		return billingList;
	}

	@Override
	public Billing getBilling(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Billing billing = (Billing) session.get(Billing.class, id);
		return billing;
	}

	@Override
	public Billing addBilling(Billing billing) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(billing);
		return billing;
	}

	@Override
	public void updateBilling(Billing billing) {
		Session session = this.sessionFactory.getCurrentSession();
		Hibernate.initialize(billing);
		session.update(billing);
		
	}

	@Override
	public void deleteBilling(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Billing billing = (Billing) session.load(Billing.class, new Integer(id));
		if (null != billing) {
			session.delete(billing);
		}
		
	}

	
}
