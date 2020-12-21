package com.grocerystore.service;

import com.grocerystore.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	void removeById(Long id);

}
