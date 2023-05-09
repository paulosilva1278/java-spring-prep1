package com.devsuperior.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_product")
@Getter
@Setter
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "department_ID")
	private Department department;

	public Product() {
	}

	public Product(Long id, String name, Double price, Department department) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.department = department;
	}

}
