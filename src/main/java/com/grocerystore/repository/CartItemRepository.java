package com.grocerystore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.grocerystore.domain.CartItem;
import com.grocerystore.domain.Order;
import com.grocerystore.domain.ShoppingCart;
@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	List<CartItem> findByOrder(Order order);
}

