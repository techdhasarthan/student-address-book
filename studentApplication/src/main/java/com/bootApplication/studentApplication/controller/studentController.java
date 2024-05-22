package com.bootApplication.studentApplication.controller;

import com.bootApplication.studentApplication.module.student;
import com.bootApplication.studentApplication.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class studentController {

    @Autowired
    private studentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
        public List<student> getAllStudents(){
            return studentService.getAllStudents();
        }
    }


