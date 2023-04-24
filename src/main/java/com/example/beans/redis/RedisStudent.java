package com.example.beans.redis;


import com.example.beans.Gender;
import com.example.beans.mongo.MongoStudent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RedisStudent implements Serializable {
    public RedisStudent(MongoStudent mongoStudent) {
        this.gender = mongoStudent.getGender();
        this.grade = mongoStudent.getGrade();
        this.name = mongoStudent.getName();
        this.id = mongoStudent.getId();
    }
    private String id;
    private String name;
    private Gender gender;
    private int grade;
}
