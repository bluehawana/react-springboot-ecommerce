package se.campusmolndal.ecodemomo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import se.campusmolndal.ecodemomo.model.Product;
import se.campusmolndal.ecodemomo.service.CartService;
import se.campusmolndal.ecodemomo.service.ProductService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*") // Allow requests from all origins
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

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable String id) {
        Long productId;
        try {
            productId = Long.parseLong(id);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid product ID format: " + id);
        }
        return productService.getProductById(productId);
    }

    @PostMapping("/products/{id}/add")
    public ResponseEntity<Product> addProductToCart(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        if (product != null) {
            cartService.addProduct(product);
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @Autowired
    private ApplicationContext appContext;

    @GetMapping("/uploads/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> servePhoto(@PathVariable String filename) {
        // Load the photo file from the uploads directory
        Resource file = appContext.getResource("file:C:/Users/BLUEH/IdeaProjects/EkoEatsEshop/uploads/" + filename);

        // Check if the resource exists
        if (file.exists()) {
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_JPEG)
                    .body(file);
        } else {
            // If the resource does not exist, return 404 Not Found
            return ResponseEntity.notFound().build();
        }
    }
}
    // other methods