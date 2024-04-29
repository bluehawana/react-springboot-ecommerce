package se.campusmolndal.ecodemomo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.campusmolndal.ecodemomo.repository.CartRepository;
import se.campusmolndal.ecodemomo.model.Cart;
import se.campusmolndal.ecodemomo.model.Product;
import se.campusmolndal.ecodemomo.service.ProductService;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductService productService;

    public Cart addProduct(Long productId, Integer quantity) {
        Cart cart = cartRepository.findById(1L).orElse(new Cart());
        Product product = productService.getProductById(productId);
        cart.addProduct(product);
        return cartRepository.save(cart);
    }

    public Cart removeProduct(Long productId) {
        Cart cart = cartRepository.findById(1L).orElse(new Cart());
        Product product = productService.getProductById(productId);
        cart.removeProduct(product);
        return cartRepository.save(cart);
    }

    public Cart updateProduct(Long productId, Integer quantity) {
        Cart cart = cartRepository.findById(1L).orElse(new Cart());
        Product product = productService.getProductById(productId);
        cart.updateProduct(product, quantity);
        return cartRepository.save(cart);
    }

    public Cart getCart() {
        return cartRepository.findById(1L).orElse(new Cart());
    }

    public Cart checkout() {
        Cart cart = cartRepository.findById(1L).orElse(new Cart());
        cartRepository.delete(cart);
        return cart;
    }

    public void addProduct(Long cartId, Product product) {
        Cart cart = cartRepository.findById(cartId).orElse(new Cart());
        cart.addProduct(product);
        cartRepository.save(cart);
    }

    public void addProduct(Product product) {
        Cart cart = cartRepository.findById(1L).orElse(new Cart());
        cart.addProduct(product);
        cartRepository.save(cart);
    }
}