package com.fsd.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.backend.entity.Product;
import com.fsd.backend.repo.ProductRepository;
import com.google.protobuf.Option;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepo;

	public List<Product> listProduct(Product prod) {
		return prodRepo.findAll();
	}

	public Optional<Product> getById(Integer id) {
		return prodRepo.findById(id);
	}

	public void createProd(Product prod) {
		prodRepo.save(prod);

	}

	public void deleteByid(Integer id) {
		prodRepo.deleteById(id);
	}



	public Product updateP(Integer id, Product newP) {
		Optional<Product> prodPresent = prodRepo.findById(id);
		if (prodPresent.isPresent()) {
			Product oldP = prodPresent.get();
			// Do not update the ID field since it should remain constant.
			// Leave out the setId() method here.
			oldP.setCategory(newP.getCategory());
			oldP.setName(newP.getName());
			oldP.setPrice(newP.getPrice());
			prodRepo.save(oldP);
			return oldP;
		} else {
			
			return null;
		}

	}

}
