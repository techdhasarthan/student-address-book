package com.bootApplication.studentApplication.service;

import com.bootApplication.studentApplication.module.student;
import com.bootApplication.studentApplication.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements studentService{

    @Autowired
    private studentRepository studentRepository;
    @Override
    public student saveStudent(student std) {
        return studentRepository.save(std);
    }

    @Override
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }
}
