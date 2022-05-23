package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.products.entity.Product;
import com.products.repo.ProductRepo;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private ProductRepo productRepo;

	/*@PostMapping("/add")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		Product saveProduct = this.productRepo.save(product);
		return ResponseEntity.ok(saveProduct);
	}*/

	@GetMapping("/get")
	public List<Product>getProductId(){
		return productRepo.findAll();
	}

	@DeleteMapping("/{id}")
	public int	deleteprofile(@PathVariable("id") int id) {
		this.productRepo.deleteById(id);
		return id;
	}
@
	public Product createProduct(@RequestBody Product product){
		return productRepo.save(product);
	}
}