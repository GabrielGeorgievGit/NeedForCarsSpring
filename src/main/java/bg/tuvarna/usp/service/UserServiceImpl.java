package bg.tuvarna.usp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.tuvarna.usp.dto.RegisterUserDTO;
import bg.tuvarna.usp.entity.User;
import bg.tuvarna.usp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository ur;

	@Override
	public User findUser(String username, String password) {
		User u = ur.findUser(username);
		if(u.getPassword().equals(password)) return u;
		else return null;
	}

	@Override
	public boolean authenticate(String username, String password) {
		return ur.findUser(username).getPassword().equals(password);
	}

	@Override
	public User register(RegisterUserDTO user) {
		if(!user.getPassword().equals(user.getRepeatPassword())) return null;
		
		return ur.register(user.getUsername(), user.getPhone(), user.getPassword());
	}
	
//	private final UserRepository userRepository;
//	
//	public UserService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//	
	
}
