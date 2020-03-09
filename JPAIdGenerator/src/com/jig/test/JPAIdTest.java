package com.jig.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import com.jig.entities.Bill;
import com.jig.helper.EntityManagerRegistry;

public class JPAIdTest {
	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Bill bill = null;
		boolean flag = false;

		try {
			entityManagerFactory = EntityManagerRegistry.getOracleFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			bill = new Bill();
			bill.setBillAmt(2000);
			bill.setBillDate(new Date());
			bill.setBillerName("Flipkart");
			bill.setCustomerName("Ahuja Traders");
			entityManager.persist(bill);
			System.out.println(bill.getBillNo());
			
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				}
				else {
					transaction.rollback();
				}
			}
			EntityManagerRegistry.close();
		}

	}
}
