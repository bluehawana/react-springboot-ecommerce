package se.campusmolndal.ecodemomo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import se.campusmolndal.ecodemomo.model.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {
}
