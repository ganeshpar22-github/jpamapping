package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
