package com.grocerystore.repository;

import org.springframework.data.repository.CrudRepository;

import com.grocerystore.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

	

}
