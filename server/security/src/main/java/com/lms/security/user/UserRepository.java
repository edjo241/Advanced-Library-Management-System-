package com.lms.security.user;

import com.lms.security.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
