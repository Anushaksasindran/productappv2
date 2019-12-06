package com.productapp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.productapp.model.entities.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	
	public User findByName(String name);
	@Query("select u from User u where u.email=:email")
	public User findByEmail(String email);
}
