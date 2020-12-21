package com.grocerystore.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerystore.domain.Product;
import com.grocerystore.repository.ProductRepository;
import com.grocerystore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		List<Product> productList = (List<Product>) productRepository.findAll();
		List<Product> activeProductList = new ArrayList<>();
		
		for (Product product: productList) {
			if(product.isActive()) {
				activeProductList.add(product);
			}
		}
		
		return activeProductList;
	}

	
	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	public List<Product> findByCategory(String category){
		List<Product> productList = productRepository.findByCategory(category);
		
		List<Product> activeProductList = new ArrayList<>();
		
		for (Product product: productList) {
			if(product.isActive()) {
				activeProductList.add(product);
			}
		}
		
		return activeProductList;
	}
	public List<Product> blurrySearch(String name) {
		List<Product> productList = productRepository.findByNameContaining(name);
List<Product> activeProductList = new ArrayList<>();
		
		for (Product product: productList) {
			if(product.isActive()) {
				activeProductList.add(product);
			}
		}
		
		return activeProductList;
	}

	
	
}
