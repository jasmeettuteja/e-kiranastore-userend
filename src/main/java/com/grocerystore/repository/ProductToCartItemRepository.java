package com.grocerystore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.grocerystore.domain.CartItem;
import com.grocerystore.domain.ProducttoCartItem;
@Transactional
public interface ProductToCartItemRepository extends CrudRepository<ProducttoCartItem,Long>{
	void deleteByCartItem(CartItem cartItem);
}
