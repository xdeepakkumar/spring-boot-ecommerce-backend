package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "producCategory", path = "product-category")
public interface ProductRepositoryCategory extends JpaRepository<ProductCategory, Long> {

}
