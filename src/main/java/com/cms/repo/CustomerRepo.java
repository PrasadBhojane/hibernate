package com.cms.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cms.entity.Customer;
import com.cms.util.HibernateUtil;

public class CustomerRepo {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public String saveCustomer(Customer customer) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			Object save = session.save(customer);
			transaction.commit();

			if (save != null) {
				return "Customer details saved successfully";
			}
		}

		catch (Exception e) {
			System.out.println("Exception handled->" + e.getLocalizedMessage());
		}
		return "failed to save Customer details";
	}	
}
