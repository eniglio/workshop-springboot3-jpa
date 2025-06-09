package com.eniglio.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eniglio.spring_course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
