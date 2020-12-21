package com.grocerystore.repository;

import org.springframework.data.repository.CrudRepository;

import com.grocerystore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
