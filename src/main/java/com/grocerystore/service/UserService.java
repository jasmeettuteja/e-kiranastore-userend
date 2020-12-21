package com.grocerystore.service;

import java.util.Set;

import com.grocerystore.domain.User;
import com.grocerystore.domain.UserBilling;
import com.grocerystore.domain.UserPayment;
import com.grocerystore.domain.UserShipping;
import com.grocerystore.domain.security.PasswordResetToken;
import com.grocerystore.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	User findByUsername(String username);
	User findByEmail(String email);
	User createUser(User user,Set<UserRole> userRoles);
	User save(User user);
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	void setUserDefaultPayment(Long userPaymentId, User user);
	void updateUserShipping(UserShipping userShipping, User user);
	void setUserDefaultShipping(Long userShippingId, User user);
User findById(Long id);


}

