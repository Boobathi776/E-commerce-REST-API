package com.boobathi.simpleWebApp.repository;

import com.boobathi.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>  // the extended interface has all the methods
{

}
