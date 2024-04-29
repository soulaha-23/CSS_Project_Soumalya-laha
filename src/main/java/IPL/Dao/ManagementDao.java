package IPL.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import IPL.Dto.Management;

@Component
public class ManagementDao {
	@Autowired
	EntityManager entityManager;

	public void Management_save(Management management) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(management);
		entityTransaction.commit();
	}
	
	public Management Mangement_login(String name, String password) {
		List<Management> existUser=entityManager.createQuery("select x from Management x where name=?1 and password=?2")
		.setParameter(1, name).setParameter(2, password).getResultList();
		if(existUser.isEmpty()) {
			return null;
		}
		return existUser.get(0);
	}
}
