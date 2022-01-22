package com.cms.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
	
	public Customer getCustomerById(Integer id) {
		Customer customer = null;
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			System.out.println("repo calling database with id -"+id);
			customer = session.get(Customer.class, id);
			transaction.commit();
		}
		catch (Exception e) {
			System.out.println("Exception handled->" + e.getLocalizedMessage());
		}
		System.out.println("repo passing customer details to service"+customer);
		return customer;
	}

	public String deleteCustomerById(Integer id) {
		 Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
		 SessionFactory sessionFactory = con.buildSessionFactory();
		Customer customer = new Customer();
//		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
		
			Query query = session.createQuery("DELETE FROM Customer WHERE customerId = 1");
			query.executeUpdate();
//			transaction.commit();
//			session.close();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Exception handled->" + e.getLocalizedMessage());
//		}
		return "Customer deleted successfully";
	}
	
	
}
