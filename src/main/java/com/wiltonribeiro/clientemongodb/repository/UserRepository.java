package com.wiltonribeiro.clientemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wiltonribeiro.clientemongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
