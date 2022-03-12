package com.cms.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.cms.entity.Customer;

public class HibernateUtil {

	  private static SessionFactory sessionFactory;
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                Configuration configuration = new Configuration();
	                Properties settings = new Properties();
	                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
	                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/cms2");
	                settings.put(Environment.USER, "root");
	                settings.put(Environment.PASS, "Prb9595050220$");
	                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

	                settings.put(Environment.SHOW_SQL, "true");

	                settings.put(Environment.HBM2DDL_AUTO, "create");

	                configuration.setProperties(settings);

	                configuration.addAnnotatedClass(Customer.class);

	                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties()).build();

	                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return sessionFactory;
	    }
	    
}
