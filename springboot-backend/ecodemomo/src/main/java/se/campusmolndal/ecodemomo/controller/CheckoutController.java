package se.campusmolndal.ecodemomo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.campusmolndal.ecodemomo.model.Product;
import se.campusmolndal.ecodemomo.service.CartService;


public class CheckoutController {
    @Autowired
    private CartService cartService;

    @PostMapping("/checkout")
    public ResponseEntity<String> checkout() {
        cartService.checkout();
        return ResponseEntity.ok("Checkout successful");
    }

}
