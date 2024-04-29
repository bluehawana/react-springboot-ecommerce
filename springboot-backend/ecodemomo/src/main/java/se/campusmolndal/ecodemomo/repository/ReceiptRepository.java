package se.campusmolndal.ecodemomo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import se.campusmolndal.ecodemomo.model.Receipt;

@Repository
public interface ReceiptRepository extends MongoRepository<Receipt, String> {
}