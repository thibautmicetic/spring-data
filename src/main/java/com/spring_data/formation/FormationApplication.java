package com.spring_data.formation;

import com.spring_data.formation.model.Category;
import com.spring_data.formation.model.Comment;
import com.spring_data.formation.model.Product;
import com.spring_data.formation.service.CategoryService;
import com.spring_data.formation.service.CommentService;
import com.spring_data.formation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class FormationApplication implements CommandLineRunner {

	private final ProductService productService;
	private final CommentService commentService;
	private final CategoryService categoryService;

	@Autowired
	public FormationApplication(ProductService productService, CommentService commentService, CategoryService categoryService) {
		this.productService = productService;
		this.commentService = commentService;
		this.categoryService = categoryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(FormationApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Optional<Product> optProduct = productService.getOneProduct(1);
		Product product = optProduct.get();
	}
}
