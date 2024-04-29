package se.campusmolndal.ecodemomo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.campusmolndal.ecodemomo.model.Product;
import se.campusmolndal.ecodemomo.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<String> addProductToCart(@RequestBody Product product) {
        cartService.addProduct(String.valueOf(product.getId()), product.getQuantity());
        return ResponseEntity.ok("Product added to cart");
    }

    @PostMapping("/remove")
    public ResponseEntity<String> removeProductFromCart(@RequestBody Product product) {
        cartService.removeProduct(String.valueOf(product.getId()));
        return ResponseEntity.ok("Product removed from cart");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateProductInCart(@RequestBody Product product) {
        cartService.updateProduct(String.valueOf(product.getId()), product.getQuantity());
        return ResponseEntity.ok("Product updated in cart");
    }

    @PostMapping("/checkout")
    public ResponseEntity<String> checkout() {
        cartService.checkout();
        return ResponseEntity.ok("Checkout successful");
    }
}