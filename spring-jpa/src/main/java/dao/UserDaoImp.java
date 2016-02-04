package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.AccountInfo;

public class UserDaoImp implements UserDao {

	
	@Override
	public AccountInfo save(AccountInfo accountInfo) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SimplePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(accountInfo);
		em.getTransaction().commit();
		emf.close();
		return accountInfo;
	}

}
