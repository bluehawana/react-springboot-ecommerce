package se.campusmolndal.ecodemomo.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepository<T, T1> {
    T findByName(String name);

    T saveProduct(T product);

}
