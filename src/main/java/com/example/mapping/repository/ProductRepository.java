package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
