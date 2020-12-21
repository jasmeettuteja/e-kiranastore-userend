package com.grocerystore.service;

import java.util.List;

import com.grocerystore.domain.CartItem;
import com.grocerystore.domain.Order;
import com.grocerystore.domain.Product;
import com.grocerystore.domain.ShoppingCart;
import com.grocerystore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	CartItem updateCartItem(CartItem cartItem);
	CartItem addProductToCartItem(Product product, User user, int qty);
CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	CartItem save(CartItem cartItem);
	List<CartItem> findByOrder(Order order);

}

