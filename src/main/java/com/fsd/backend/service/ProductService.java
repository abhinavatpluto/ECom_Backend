package com.fsd.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.backend.entity.Product;
import com.fsd.backend.repo.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepo;

	public List<Product> listProduct(Product prod) {
		return prodRepo.findAll();
	}
	
	public Optional<Product> getById(Integer id){
		return prodRepo.findById(id);
	}
	
	public void createProd(Product prod) {
		prodRepo.save(prod);
		
	}
	
	public void deleteByid(Integer id) {
		prodRepo.deleteById(id);
	}

}
