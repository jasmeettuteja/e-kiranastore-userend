package com.grocerystore.service;

import com.grocerystore.domain.BillingAddress;
import com.grocerystore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}

