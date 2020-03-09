package com.jig.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerRegistry {
	private static EntityManagerFactory mySqlFactory;
	private static EntityManagerFactory oracleFactory;

	static {
		try {
			mySqlFactory = Persistence.createEntityManagerFactory("mysql");
			oracleFactory = Persistence.createEntityManagerFactory("oracle");
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	public static EntityManagerFactory getMySqlFactory() {
		return mySqlFactory;
	}

	public static EntityManagerFactory getOracleFactory() {
		return oracleFactory;
	}

	public static void close() {
		if (mySqlFactory != null) {
			mySqlFactory.close();
		}
		if (oracleFactory != null) {
			oracleFactory.close();
		}
	}
}
