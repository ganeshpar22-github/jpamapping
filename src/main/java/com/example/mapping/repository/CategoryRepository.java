package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
