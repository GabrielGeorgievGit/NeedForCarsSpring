package bg.tuvarna.usp.repository;

import bg.tuvarna.usp.entity.User;

public interface UserRepository {
	User findUser(String username);
	User register(String username, String phone, String password);
}
