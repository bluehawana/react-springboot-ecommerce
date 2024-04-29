package se.campusmolndal.ecodemomo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import se.campusmolndal.ecodemomo.model.Product;
import se.campusmolndal.ecodemomo.service.ProductService;
import se.campusmolndal.ecodemomo.service.CartService;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        // Method implementation to fetch and return the product by ID
    }

    @PostMapping("/products/{id}/add")
    public ResponseEntity<String> addProductToCart(@PathVariable String id) {
        Product product = productService.getProductById(id);
        cartService.addProduct(product);
        return ResponseEntity.ok("Product added to cart");
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok((List<Product>) productService.getAllProducts());
    }
    // other methods
}