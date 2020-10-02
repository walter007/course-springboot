package com.ws.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
