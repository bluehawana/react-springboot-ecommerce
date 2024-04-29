package se.campusmolndal.ecodemomo.service;

import org.springframework.stereotype.Service;
import se.campusmolndal.ecodemomo.model.Order;
import se.campusmolndal.ecodemomo.repository.OrderRepository;
import se.campusmolndal.ecodemomo.model.Product;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> findByProduct(Product product) {
        return orderRepository.findByProductId(product.getId().toString());
    }

    // other methods
}