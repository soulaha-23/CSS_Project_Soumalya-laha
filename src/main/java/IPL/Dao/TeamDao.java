package IPL.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import IPL.Dto.Team;

@Component
public class TeamDao {
	@Autowired
	EntityManager entityManager;

	

	// create the account
	public void save(Team team) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(team);
		entityTransaction.commit();
	}

	// login into account
	public Team login(String username, String password) {
		List<Team> list = entityManager.createQuery("select x from Team x where username=?1 and password=?2")
				.setParameter(1, username).setParameter(2, password).getResultList();

		if (list == null)
			return null;
		return list.get(0);
	}

	// get team by
	public List<Team> getAllTeam() {
		List<Team> team = entityManager.createQuery("select x from Team x").getResultList();
		return team;
	}

	// fetch team by id
	public Team getTeamById(int id) {
		Team team = entityManager.find(Team.class, id);
		return team;
	}

	// update the status
	public void update(Team team) {
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(team);
		entityTransaction.commit();
	}
	
	// add amount
	public Team addAmount(int id) {
		Team team = entityManager.find(Team.class, id);
		return team;
	}
}
