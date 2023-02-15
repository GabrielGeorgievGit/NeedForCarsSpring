package bg.tuvarna.usp.service;

import bg.tuvarna.usp.dto.RegisterUserDTO;
import bg.tuvarna.usp.entity.User;

public interface UserService {
	User findUser(String username, String password);
	boolean authenticate(String username, String password);
	User register(RegisterUserDTO user);
}
