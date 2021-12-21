package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.owner.Owner;


public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll();

    @Query(value = "SELECT DISTINCT productType FROM ProductType productType")
    List<ProductType> findAllProductTypes();

    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);
}
