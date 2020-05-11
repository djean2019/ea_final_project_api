package edu.miu.cs.cs544.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs.cs544.domain.user.User;
import edu.miu.cs.cs544.service.user.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
//	@PostMapping(value = "createuser", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
//	public void saveUser(User user) {
//		userService.createUser(user);
//	}
	
	@GetMapping(value="all", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
