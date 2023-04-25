package com.example.beans.mongo;

import com.example.beans.Gender;
import com.example.beans.redis.RedisStudent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "student")
public class MongoStudent {
    public MongoStudent(RedisStudent redisStudent) {
        this.gender = redisStudent.getGender();
        this.grade = redisStudent.getGrade();
        this.name = redisStudent.getName();
        this.id = redisStudent.getId();
    }
    @Id
    private String id;
    private String name;
    private Gender gender;
    private int grade;
}
