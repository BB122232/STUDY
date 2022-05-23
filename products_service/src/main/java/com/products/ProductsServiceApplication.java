package com.products;

import com.products.entity.Product;
import com.products.repo.ProductRepo;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ProductsServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductsServiceApplication.class, args);
	}

	@Autowired
	private ProductRepo productRepo;

	@Override
	public void run(String... args) throws Exception{
		Product product= new Product();
		product.setProductid(101);
		product.setProductType("Perfume");
		product.setProductprice(15000);
		product.setProductName("Chanel No 5");
		product.setCategory("Fragnance");
		product.setRating(0);
		product.setReview(10);
		product.setImageString("Not Available");
		product.setDescription("Great product");
		product.setSpecification("Smells lovely");
       productRepo.save(product);

		Product product1= new Product();
		product.setProductid(102);
		product.setProductType("Novel");
		product.setProductprice(250);
		product.setProductName("Turtles all the way down");
		product.setCategory("Books");
		product.setRating(10);
		product.setReview(10);
		product.setImageString("Not Available");
		product.setDescription("Great product");
		product.setSpecification("Loved to read it");
		productRepo.save(product1);
	}
}
