package edu.miu.cs.cs544.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs544.domain.user.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{

}
