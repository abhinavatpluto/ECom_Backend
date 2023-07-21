package com.fsd.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fsd.backend.entity.Product;
import com.fsd.backend.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

	@Autowired
	private ProductService proService;

	@GetMapping("/prod")
	public List<Product> getAll(Product pro) {
		return proService.listProduct(pro);
	}

	@PostMapping("/prod")
	public void create(@RequestBody Product product) {
		proService.createProd(product);

	}

}
