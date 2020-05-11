package edu.miu.cs.cs544.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs544.domain.user.User;

@Service
public interface UserService {
	public void createUser(User user);
	public List<User> getAllUsers();
	public User getUserById(int id);
}
