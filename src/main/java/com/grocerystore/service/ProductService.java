package com.grocerystore.service;

import java.util.List;

import com.grocerystore.domain.Product;

public interface ProductService {
	List<Product> findAll ();
	
	Product findById(Long id);
	List<Product> findByCategory(String category);
	List<Product> blurrySearch(String title);

}
