package com.grocerystore.repository;

import org.springframework.data.repository.CrudRepository;

import com.grocerystore.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
