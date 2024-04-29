package se.campusmolndal.ecodemomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.campusmolndal.ecodemomo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.price= :someValue")
    Product findProductByExistingField(@Param("someValue") String someValue);

    Product save(Product product);
}