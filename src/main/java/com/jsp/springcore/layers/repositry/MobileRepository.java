package com.jsp.springcore.layers.repositry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jsp.springcore.layers.entity.Mobile;

@Repository
public class MobileRepository {

	public void addMobile(Mobile mobile) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		//Save
		em.persist(mobile);

		et.commit();
		em.close();

	}

	public Mobile findMobileById(int mobileId) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Mobile mobile = em.find(Mobile.class, mobileId);

		et.commit();
		em.close();

		return mobile;
	}

	public Mobile updateMobile(Mobile mobile) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Mobile mobile1 = em.find(Mobile.class, mobile.getMobileId());
		mobile1.setMobileModel(mobile.getMobileModel());
		mobile1.setMobileBrand(mobile.getMobileBrand());
		mobile1.setMobilePrice(mobile.getMobilePrice());

		et.commit();
		em.close();

		return mobile1;
	}

	public Mobile deleteMobile(int mobileId) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Mobile mobile = em.find(Mobile.class, mobileId);
		em.remove(mobile);

		et.commit(); 
		em.close();

		return mobile;
	}

	public List<Mobile> findAllMobile() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		List<Mobile> mobiles = em.createQuery("SELECT m FROM Mobile m", Mobile.class).getResultList();

		et.commit();
		em.close();

		return mobiles;
	}


}
