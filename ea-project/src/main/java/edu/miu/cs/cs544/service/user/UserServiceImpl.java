package edu.miu.cs.cs544.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

import edu.miu.cs.cs544.domain.user.User;
import edu.miu.cs.cs544.repository.user.UserRepository;

@Service
//@Transactional(propagation=Propagation.REQUIRES_NEW)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}

}
