package IPL.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import IPL.Dto.Player;

@Component
public class PlayerDao {
	
	@Autowired
	EntityManager entityManager;
	
	public void save(Player player) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(player);
		entityTransaction.commit();
	}

	public Player login(String username, String password) {
		List<Player> list = entityManager.createQuery("select x from Player x where username=?1 and password=?2")
		.setParameter(1, username).setParameter(2, password).getResultList();
		if(list== null) return null;
		
		return list.get(0);
	
		
	}
}
