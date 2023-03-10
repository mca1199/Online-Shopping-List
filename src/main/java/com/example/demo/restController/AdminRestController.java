package com.example.demo.restController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.AdminService;

@RestController
public class AdminRestController {
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping("/registration")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Admin registeration(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}
	
	@PostMapping("/addProduct")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Product addProduct(@RequestBody Product product) {
		return adminService.saveProducts(product);
	}
	
	@GetMapping("/findAllProduct")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public List<Product> findeAllProduct() {
		System.out.println("Calling: find Product");
		return adminService.getProducts();
	}
	
	
	
	@PostMapping("/adminLogin")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Admin AdminLogin(@RequestBody Admin admin) throws Exception{
		String tempEmail=admin.getEmail();
		String tempPassword=admin.getPassword();
		Admin adminObj=null;
		if(tempEmail!=null && tempPassword!=null) {
			adminObj=adminService.fetchByEmailAndPassword(tempEmail, tempPassword);
		}
		if(adminObj==null) {
			throw new Exception("Bad Credentials");
		}
		return adminObj;
}
	
	@GetMapping("/getProduct")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Product getProduct(@RequestBody Product product)throws Exception{
		String tempBarand=product.getBarand();
		Product productObj=null;
		if(tempBarand!=null) {
			productObj=adminService.fetchByBarand(tempBarand);
			
		}
		if(productObj==null) {
			throw new Exception("Empty");
		}
		return productObj;
	}
	

}
