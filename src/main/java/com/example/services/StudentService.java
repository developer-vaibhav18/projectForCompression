package com.example.services;

import com.example.beans.mongo.MongoStudent;
import com.example.beans.redis.RedisStudent;
import com.example.repositories.StudentRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class StudentService {

    @Autowired
    StudentRepositoryMongo studentRepositoryMongo;
    @Autowired
    RedisTemplate<String, RedisStudent> redisTemplate;

    public void createStudent(MongoStudent student) {
        studentRepositoryMongo.save(student);
    }

    public MongoStudent getStudentById(String id) {
        RedisStudent redisStudent = redisTemplate.opsForValue().get(id);
        if (redisStudent == null) {
            System.out.println("mongo call");
            MongoStudent mongoStudent = studentRepositoryMongo.findById(id).get();
            redisTemplate.opsForValue().set(id, new RedisStudent(mongoStudent));
            return mongoStudent;
        }
        return new MongoStudent(redisStudent);
    }
}
