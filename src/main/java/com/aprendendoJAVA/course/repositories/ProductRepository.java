package com.aprendendoJAVA.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoJAVA.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
