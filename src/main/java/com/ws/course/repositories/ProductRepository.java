package com.ws.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
