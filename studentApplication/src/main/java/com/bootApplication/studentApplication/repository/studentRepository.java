package com.bootApplication.studentApplication.repository;

import com.bootApplication.studentApplication.module.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<student,Integer> {
}
