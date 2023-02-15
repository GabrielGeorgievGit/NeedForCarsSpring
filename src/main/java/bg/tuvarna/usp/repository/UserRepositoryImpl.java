package bg.tuvarna.usp.repository;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bg.tuvarna.usp.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private EntityManager em;

	@Override
	public User findUser(String username) {
		User user = em.createQuery(
				  "SELECT u from User u WHERE u.username = :username", User.class).
				  setParameter("username", username).getSingleResult();
		
		return user;
	}
	
	@Transactional
	@Override
	public User register(String username, String phone, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPhone(phone);
		user.setPassword(password);
		try(Session currentSesstion = em.unwrap(Session.class)) {
			currentSesstion.persist(user);
		}
		/*User user = new User();
		user.setUsername(username);
		user.setPhone(phone);
		user.setPassword(password);
		try {
		em.persist(user);
		} catch(Exception e) {
			e.printStackTrace();
		}*/
//		em.getTransaction().commit();
		return user;
	}
	
}
