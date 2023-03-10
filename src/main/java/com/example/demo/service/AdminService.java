package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Product;
import com.example.demo.repo.AdminRepo;
import com.example.demo.repo.ProductRepo;


@Service
public class AdminService {
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private AdminRepo adminRepo;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	
	public Product saveProducts(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> getProducts(){
		return productRepo.findAll();
	}
	
	
	public Admin fetchByEmailAndPassword(String email, String password) {
	return adminRepo.findByEmailAndPassword(email, password);
}
	public Product fetchByBarand(String Barand) {
		return productRepo.findByBarand(Barand);
	}

}
