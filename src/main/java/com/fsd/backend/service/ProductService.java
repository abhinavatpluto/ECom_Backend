package com.fsd.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.backend.entity.Product;
import com.fsd.backend.repo.ProductRepository;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepo;

	public List<Product> listProduct(Product prod) {
		return prodRepo.findAll();
	}
	
	public void createProd(Product prod) {
		prodRepo.save(prod);
		
	}

}
