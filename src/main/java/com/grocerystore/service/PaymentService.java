package com.grocerystore.service;

import com.grocerystore.domain.Payment;
import com.grocerystore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
