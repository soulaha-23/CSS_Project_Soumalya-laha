package IPL.Helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "IPL")
public class MyConfig {
	
	@Bean
	public EntityManager getEM() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}
