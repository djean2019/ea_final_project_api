package edu.miu.cs.cs544.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs544.domain.user.UserRole;
@Service
public interface UserRoleService {
	public void createUserRole(UserRole userRole);
	public List<UserRole> getAllUserRoles();
	public UserRole getUserRoleById(int id);
}
