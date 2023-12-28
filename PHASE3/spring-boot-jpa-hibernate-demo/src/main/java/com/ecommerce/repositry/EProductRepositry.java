package com.ecommerce.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Long>{
	
	// Spring only wants to mention those CRUD methods
	// that are not based on ID
	
	List<EProduct> findAllByName(String name);
	
	List<EProduct> findAllByPrice(float price);

}
