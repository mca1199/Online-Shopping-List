package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Cart_T")

public class Add_To_Cart {
	@Id	
	
	@GeneratedValue
	

	private Long serial_Number;
	
	private String generation;
	private String processer;
	private String price;
	private String garanty;
	private String modele_Number;
	private String barand;
	private String product_Type;
	
	
	
	   
	public Long getSerial_Number() {
		return serial_Number;
	}
	public void setSerial_Number(Long serial_Number) {
		this.serial_Number = serial_Number;
	}
	public String getModele_Number() {
		return modele_Number;
	}
	public void setModele_Number(String modele_Number) {
		this.modele_Number = modele_Number;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getProcesser() {
		return processer;
	}
	public void setProcesser(String processer) {
		this.processer = processer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGaranty() {
		return garanty;
	}
	public void setGaranty(String garanty) {
		this.garanty = garanty;
	}
	public String getBarand() {
		return barand;
	}
	public void setBarand(String barand) {
		this.barand = barand;
	}
	public String getProduct_Type() {
		return product_Type;
	}
	public void setProduct_Type(String product_Type) {
		this.product_Type = product_Type;
	}

	
	
}
