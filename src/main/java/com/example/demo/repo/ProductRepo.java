package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
@Repository

public interface ProductRepo extends JpaRepository<Product, Long>{
	public Product findByBarand(String Barand);
}
