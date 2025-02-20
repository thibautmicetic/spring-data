package com.spring_data.formation.repository;

import com.spring_data.formation.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    public Iterable<Product> findByName(String name);

    public Iterable<Product> findByCategoriesName(String name);
}
