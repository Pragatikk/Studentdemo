package com.pragati.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragati.Student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
