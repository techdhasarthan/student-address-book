package com.bootApplication.studentApplication.service;

import com.bootApplication.studentApplication.module.student;

import java.util.List;

public interface studentService {

        public student saveStudent(student std);

        public List<student>getAllStudents();
}
