package com.spring.usercrud.repository;

import java.util.Optional;

import com.spring.usercrud.model.UserRole;
import com.spring.usercrud.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository; // Import MongoRepository for MongoDB operations


public interface RoleRepository extends MongoRepository<Role, String> {


    Optional<Role> findByName(UserRole  name);
}