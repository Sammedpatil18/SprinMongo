package com.mongospring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongospring.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
