package se.campusmolndal.ecodemomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.campusmolndal.ecodemomo.model.Checkout;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

}
