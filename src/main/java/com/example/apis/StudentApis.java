package com.example.apis;

import com.example.beans.mongo.MongoStudent;
import com.example.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentApis {
    @Autowired
    StudentService studentService;
    @PostMapping("/create")
    public void create(@RequestBody MongoStudent student) {
        studentService.createStudent(student);
    }
    @GetMapping("/{id}")
    public MongoStudent getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }
}
