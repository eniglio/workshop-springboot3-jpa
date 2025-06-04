package com.eniglio.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eniglio.spring_course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
