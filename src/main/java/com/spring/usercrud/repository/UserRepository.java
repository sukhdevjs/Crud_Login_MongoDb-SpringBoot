package com.spring.usercrud.repository;

import com.spring.usercrud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository; // Import MongoRepository for MongoDB operations

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    List<User> findAll();
}

