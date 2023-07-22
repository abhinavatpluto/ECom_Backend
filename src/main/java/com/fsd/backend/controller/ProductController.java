package com.fsd.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fsd.backend.entity.Product;
import com.fsd.backend.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService proService;

	@GetMapping("/prod")
	public List<Product> getAll(Product pro) {
		return proService.listProduct(pro);
	}

	@GetMapping("/prod/{id}")
	public Optional<Product> byId(@PathVariable Integer id) {
		return proService.getById(id);
	}

	@PostMapping("/prod")
	public void create(@RequestBody Product product) {
		proService.createProd(product);

	}

	@DeleteMapping("/prod/{id}")
	public void delete(@PathVariable Integer id) {
		proService.deleteByid(id);

	}



	@PutMapping("/prod/{id}")
	public Product updateProduct(@PathVariable Integer id, @RequestBody Product updatedProduct) {
		return proService.updateP(id, updatedProduct);
	}

}
