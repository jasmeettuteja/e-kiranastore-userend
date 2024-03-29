package com.grocerystore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.grocerystore.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findByCategory(String category);

	List<Product> findByNameContaining(String name);

	
}

