package com.ws.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
