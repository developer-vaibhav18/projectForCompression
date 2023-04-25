package com.example.repositories;

import com.example.beans.mongo.MongoRepairOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoRepositoryMongo extends MongoRepository<MongoRepairOrder,String> {

}
