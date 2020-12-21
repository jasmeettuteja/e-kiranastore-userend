package com.grocerystore.service;

import com.grocerystore.domain.BillingAddress;
import com.grocerystore.domain.Order;
import com.grocerystore.domain.Payment;
import com.grocerystore.domain.ShippingAddress;
import com.grocerystore.domain.ShoppingCart;
import com.grocerystore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findById(Long id);
}
