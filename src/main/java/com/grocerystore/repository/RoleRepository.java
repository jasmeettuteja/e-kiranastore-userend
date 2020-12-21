package com.grocerystore.repository;

import org.springframework.data.repository.CrudRepository;

import com.grocerystore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role,Long> {

	Role findByname(String name);
}
