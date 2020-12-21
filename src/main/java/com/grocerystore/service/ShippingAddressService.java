package com.grocerystore.service;

import com.grocerystore.domain.ShippingAddress;
import com.grocerystore.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
