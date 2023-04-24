package com.example.repositories;

import com.example.beans.mongo.MongoStudent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryMongo extends MongoRepository<MongoStudent, String> {

}
